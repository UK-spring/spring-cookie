package com.example.springcookie.controller;

import com.example.springcookie.dto.UserResponseDto;
import com.example.springcookie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;

    @GetMapping("/home")
    public String home(
            // @CookieValue(required = true) 로 필수값(default) 설정
            // required = false 이면 필수값 아님.
            @CookieValue(name = "userId", required = false) Long userId, // String->Long 자동 타입컨버팅
            Model model
    ) {

        // 쿠키에 값이 없으면 로그인 페이지로 이동 -> 로그인 X
        if(userId == null) {
            return "login";
        }

        // 실제 DB에 데이터 조회 후 결과가 없으면 로그인 페이지로 이동 -> 일치하는 회원정보 X
        UserResponseDto loginUser = userService.findById(userId);

        if(loginUser == null) {
            return "login";
        }

        // 정상적으로 로그인 된 사람이라면 View에서 사용할 데이터를 model 객체에 데이터 임시 저장
        model.addAttribute("loginUser", loginUser);
        // home 화면으로 이동
        return "home";
    }
}
