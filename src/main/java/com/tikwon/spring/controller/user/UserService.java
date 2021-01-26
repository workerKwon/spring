package com.tikwon.spring.controller.user;

import com.tikwon.spring.controller.user.User;

import reactor.core.publisher.Mono;

public interface UserService {

    public Mono<User> createUser(User user);
}
