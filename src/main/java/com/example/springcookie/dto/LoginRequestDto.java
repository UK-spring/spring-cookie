package com.example.springcookie.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

// 필드 전체를 매개변수로 가진 생성자가 있어야 @ModelAttribute가 동작한다.
@Getter
@AllArgsConstructor
public class LoginRequestDto {
    // 사용자가 입력한 아이디
    @NotBlank
    private final String userName;
    // 사용자가 입력한 비밀번호
    @NotNull
    private final String password;

}
