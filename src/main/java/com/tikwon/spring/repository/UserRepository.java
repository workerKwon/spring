package com.tikwon.spring.repository;

import com.tikwon.spring.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
}
