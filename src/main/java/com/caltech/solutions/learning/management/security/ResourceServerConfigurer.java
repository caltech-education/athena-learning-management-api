package com.caltech.solutions.learning.management.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author Weverton Souza.
 * Created on 12/01/2020
 */
@Configuration
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/quiz-answers/**")
//                .hasAnyRole("ADMIN_LEV1");
        http.authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
