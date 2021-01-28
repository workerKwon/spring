package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service // Service interface를 생성하지 않고 Impl만 사용하면 에러가 발생한다.
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Flux<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public Mono deleteAll() {
        return userRepository.deleteAll();
    }

    @Override
    public Mono deleteId(int id) {
        return userRepository.deleteById(id);
    }
}
