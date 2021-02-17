package com.tikwon.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;

@Component
public class AccessHandler {

    @Autowired
    private UrlAuthenticationSuccessHandler successHandler;

    @Autowired
    private HandlerExceptionResolver handlerExceptionResolver;

    public AuthenticationSuccessHandler successHandler() {
        return successHandler;
    }

    public AuthenticationFailureHandler failureHandler() {
        return (request, response, authentication) -> handlerExceptionResolver.resolveException(request, response, null, authentication);
    }

    public AccessDeniedHandler accessDeniedHandler() {
        return (request, response, authentication) -> handlerExceptionResolver
                .resolveException(request, response, null, authentication);
    }

    public AuthenticationEntryPoint authenticationEntryPoint() {
        return (request, response, authentication) -> handlerExceptionResolver
                .resolveException(request, response, null, authentication);
    }

    public LogoutSuccessHandler logoutSuccessHandler() {
        return (request, response, authentication) -> response.setStatus(200);
    }


}
