package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/_api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
