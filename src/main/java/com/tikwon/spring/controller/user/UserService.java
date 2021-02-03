package com.tikwon.spring.controller.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono deleteAll();

    Mono deleteId(int id);
}
