package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin
@RestController
@RequestMapping("_api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/createUser")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getList")
    public Flux<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteAll")
    public Mono deleteAll() {
        return userService.deleteAll();
    }
}
