package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Mono<User> save(UserDTO userDTO) {
        return userRepository.save(new User(userDTO)
                .changeEncodePassword(passwordEncoder)
        );
    }

    public Mono deleteAll() {
        return userRepository.deleteAll();
    }

    public Flux<User> getAll() {
        return userRepository.findAll();
    }

    public Mono deleteId(int id) {
        return userRepository.deleteById(id);
    }

    public Mono<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
