package com.example.springcloudgatewaygraphql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {


	@Bean
	public SecurityWebFilterChain securitygWebFilterChain(ServerHttpSecurity http) {
		// @formatter:off
		return http
			.csrf().disable()
			.cors().disable()
			.authorizeExchange()
				.anyExchange().authenticated()
			.and()
				.httpBasic()
			.and()
			.build();
		// @formatter:on
	}
}
