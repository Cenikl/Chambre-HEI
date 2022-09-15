package com.spring.project.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/").permitAll()
                .antMatchers(HttpMethod.GET,"/rooms/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/room/{roomId}").permitAll()
                .antMatchers(HttpMethod.POST,"/room/").permitAll()
                .antMatchers(HttpMethod.PATCH,"/room/{roomId}").permitAll()
                .antMatchers(HttpMethod.GET,"/customers").authenticated()
                .antMatchers(HttpMethod.GET,"/customers/*").authenticated()
                .antMatchers(HttpMethod.DELETE,"/customers/*").authenticated()
                .antMatchers(HttpMethod.POST,"/customers").permitAll()
                .antMatchers(HttpMethod.PUT,"/customers/*").authenticated()
                .antMatchers(HttpMethod.GET,"/employees").authenticated()
                .antMatchers(HttpMethod.GET,"/employees/*").authenticated()
                .antMatchers(HttpMethod.PUT,"/employees/*").authenticated()
                .antMatchers(HttpMethod.GET,"/manager/**").denyAll()
                .antMatchers(HttpMethod.PUT,"/manager/**").denyAll()
                .and()
                .csrf().disable();
    }
}
