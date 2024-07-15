package com.studyolle.modules.account;

import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/*
account 프로퍼티를 가지고 있는 중간 객체
스프링 시큐리티가 다루는 유저 정보와 도메인에서 다루는 유저 정보 사이의 갭을 매꿔주는 역할
여기서 상속하고 있는 User 는 시큐리티의 User 이다.
* */
@Getter
public class UserAccount extends User {

    private Account account;

    public UserAccount(Account account) {
        super(account.getNickname(), account.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_USER")));
        this.account = account;
    }
}
