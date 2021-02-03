package com.tikwon.spring.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service // Service interface를 생성하지 않고 Impl만 사용하면 에러가 발생한다.
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        return userService.findByEmail(s).blockOptional().orElseThrow(() -> new UsernameNotFoundException("Authentication is Failed : " + s));
    }
}
