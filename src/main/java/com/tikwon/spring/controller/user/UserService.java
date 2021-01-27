package com.tikwon.spring.controller.user;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    public Mono<User> createUser(User user);

    public Flux<User> getUserList();
}
