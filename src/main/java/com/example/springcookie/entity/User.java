package com.example.springcookie.entity;

import lombok.Getter;

@Getter
public class User {
    // 식별자
    private Long id;
    // 이름
    private String name;
    // 나이
    private Integer age;
    // 로그인 ID
    private String userName;
    // 비밀번호
    private String password;

    public User(Long id, String name, Integer age, String userName, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;
    }
}
