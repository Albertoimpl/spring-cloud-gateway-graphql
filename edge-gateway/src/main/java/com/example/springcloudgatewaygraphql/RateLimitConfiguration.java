package com.example.springcloudgatewaygraphql;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
class RateLimitConfiguration {

    @Bean
    KeyResolver genericKeyResolver() {
        return exchange -> Mono.just("generic");
    }

}
