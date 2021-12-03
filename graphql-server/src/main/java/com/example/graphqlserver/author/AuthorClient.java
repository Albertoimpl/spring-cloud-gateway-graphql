package com.example.graphqlserver.author;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class AuthorClient {

    private final RestTemplate restTemplate;

    public AuthorClient(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public List<Author> getAllAuthors() {
        return restTemplate
                .exchange("http://localhost:8091/authors",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Author>>() {
                        })
                .getBody();
    }
}
