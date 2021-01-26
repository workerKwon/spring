package com.tikwon.spring.service;

import com.tikwon.spring.model.User;

import reactor.core.publisher.Mono;

public interface UserService {

    public Mono<User> createUser(User user);
}
