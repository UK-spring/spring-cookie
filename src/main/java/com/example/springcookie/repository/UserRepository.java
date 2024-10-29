package com.example.springcookie.repository;

import com.example.springcookie.dto.UserResponseDto;
import com.example.springcookie.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {

    private static final User USER1 = new User(1L, "wonuk", 100, "wonuk", "1234");
    private static final User USER2 = new User(2L, "wonuk2", 200, "wonuk2", "2345");
    private static final List<User> USERS = Arrays.asList(USER1, USER2);

    public Long findIdByUserNameAndPassword(String userName, String password) {
        return USERS.stream()
                .filter(user -> user.getUserName().equals(userName) && user.getPassword().equals(password))
                .map(User::getId)
                .findFirst()
                .orElse(null);
    }

    public UserResponseDto findById(Long id) {
        return USERS.stream()
                .filter(user -> Objects.equals(user.getId(), id))
                .map(user -> new UserResponseDto(user.getId(), user.getName()))
                .findFirst()
                .orElse(null);
    }
}
