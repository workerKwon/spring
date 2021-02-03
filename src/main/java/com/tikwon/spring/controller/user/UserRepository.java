package com.tikwon.spring.controller.user;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

    @Query("select * from user where email = :email")
    Mono<User> findByEmail(String email);
}
