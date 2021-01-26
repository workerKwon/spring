package com.tikwon.spring.controller.user;

import com.tikwon.spring.controller.user.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
}
