package com.tikwon.spring.controller;

import com.tikwon.spring.controller.user.User;
import com.tikwon.spring.controller.user.UserDTO;
import com.tikwon.spring.controller.user.UserDetailServiceImpl;
import com.tikwon.spring.controller.user.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Mono;


@SpringBootTest
@Slf4j
public class DataSaveTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void put() {

        UserDTO userDTO = new UserDTO();
        userDTO.setName("kti");
        userDTO.setEmail("test@test.com");
        userDTO.setPassword("1234");
        userDTO.setAuth("ADMIN");

        Mono<User> user = userService.save(userDTO);

    }
}
