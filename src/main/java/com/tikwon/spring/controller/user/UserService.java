package com.tikwon.spring.controller.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService extends UserDetailsService {

    Mono<User> createUser(User user);

    Flux<User> getUserList();

    Mono deleteAll();

    Mono deleteId(int id);
}
