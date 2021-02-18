package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public Mono<Void> deleteAll() {
        return userRepository.deleteAll();
    }

    public Flux<User> getAll() {
        return userRepository.findAll();
    }

    public Mono<Void> deleteId(int id) {
        return userRepository.deleteById(id);
    }

    public Mono<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Mono<User> save(UserDTO userDTO) {
        return userRepository.save(new User(userDTO));
    }
}
