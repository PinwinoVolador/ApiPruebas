package com.utp.proyectoAcreditacion.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(authorizeRequests ->
	            authorizeRequests
	                .anyRequest().permitAll()
	        )
	        .requestCache(requestCache -> requestCache.disable())
	        .csrf(csrf -> csrf.disable())
	        .httpBasic();

	    return http.build();
	}
}
