package com.tikwon.spring.controller;

import com.tikwon.spring.controller.user.User;
import com.tikwon.spring.controller.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Mono;


@SpringBootTest
@Slf4j
public class DataSaveTest {

    @Autowired
    private UserService userService;

    @Test
    void put() {

        Mono<User> user = userService.createUser(new User("1234", "1234"));

    }
}
