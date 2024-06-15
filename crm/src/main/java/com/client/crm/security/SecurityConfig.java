package com.client.crm.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(csrf -> csrf.disable()) // Disabling CSRF protection (not recommended for production environments)
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/home").permitAll() // Allowing access to /login without authentication
                        .anyRequest().authenticated() // All other requests need authentication
                )
                .formLogin(formLogin -> formLogin
                        .loginPage("/login")
                        .defaultSuccessUrl("/home",true)
                        .permitAll()); // Enabling form-based login with default settings

        return httpSecurity.build();
    }
}
