package com.tikwon.spring.controller.user;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> createUser(User user);

    Flux<User> getUserList();

    Mono deleteAll();

    Mono deleteId(int id);
}
