package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        String[] caminhosPermitidos  = new String[] {"/", "/input", "/login", "/home"};

        http.authorizeRequests().antMatchers(caminhosPermitidos).permitAll().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }
}
