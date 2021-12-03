package com.example.springcloudgatewaygraphql.filters;
import reactor.core.publisher.Mono;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.WebFilterChainProxy;
import org.springframework.web.server.ServerWebExchange;

/**
 * GlobalFilter for Basic Authentication using Spring Security.
 */
public class BasicAuthGlobalFilter implements GlobalFilter {
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		// @formatter:off
		SecurityWebFilterChain basicAuthFilter = ServerHttpSecurity
				.http()
				.authorizeExchange()
				.anyExchange().authenticated()
				.and()
				.build();
		// @formatter:on

		return new WebFilterChainProxy(basicAuthFilter).filter(exchange, chain::filter);
	}
}

