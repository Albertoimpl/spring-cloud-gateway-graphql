package com.example.springcloudgatewaygraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringCloudGatewayGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayGraphqlApplication.class, args);
    }

}
