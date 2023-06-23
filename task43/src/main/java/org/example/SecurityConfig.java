package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/register").permitAll() // Доступ для всех на главную страницу и страницу регистрации
                .anyRequest().authenticated() // Все остальные страницы требуют авторизации
                .and()
                .formLogin()
                .loginPage("/login") // Путь к странице авторизации
                .defaultSuccessUrl("/home", true) // Перенаправление после успешной авторизации
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
}

