package com.example.springcookie.dto;

import lombok.Getter;

@Getter
public class LoginResponseDto {

    private final Long id;
    // 이외 응답에 필요한 데이터들을 필드로 구성하면 된다.
    // 필요한 생성자
    public LoginResponseDto(Long id) {
        this.id = id;
    }

}
