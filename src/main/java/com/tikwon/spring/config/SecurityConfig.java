//package com.tikwon.spring.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter { // @EnableWebSecurity와 WebSecurityConfigurerAdapter를 해주면 사이트 전체가 잠겨서 비밀번호를 쳐야 접근할 수 있게 된다.
//
//    @Override
//    public void configure(WebSecurity webSecurity) throws Exception {
//        webSecurity.ignoring().antMatchers("/css/**","/script/**","image/**", "/fonts/**", "lib/**"); // 자원에 대한 접근을 풀어준다.
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/**").permitAll(); // 일단은 모든 경로에 permitAll을 해줌.
//    }
//}
