package com.example.graphqlserver.book;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BookClient {

    private final RestTemplate restTemplate;

    public BookClient(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public List<Book> getAllBooks() {
        return restTemplate
                .exchange("http://localhost:8090/books",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Book>>() {
                        })
                .getBody();
    }
}
