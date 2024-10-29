package com.example.springcookie.dto;

import lombok.Getter;

@Getter
public class UserResponseDto {
    // 유저 식별자
    private Long id;
    // 유저 이름
    private String name;

    public UserResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
