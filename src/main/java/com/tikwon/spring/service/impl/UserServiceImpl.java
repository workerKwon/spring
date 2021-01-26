package com.tikwon.spring.service.impl;

import com.tikwon.spring.entity.User;
import com.tikwon.spring.repository.UserRepository;
import com.tikwon.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service // Service interface를 생성하지 않고 Impl만 사용하면 에러가 발생한다.
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }
}
