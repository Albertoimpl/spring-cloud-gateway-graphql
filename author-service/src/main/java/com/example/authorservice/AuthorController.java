package com.example.authorservice;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AuthorController {

    private static List<Author> ALL_AUTHORS;

    public AuthorController() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ALL_AUTHORS = mapper.readValue(new ClassPathResource("./fixtures/authors.json").getFile(), new TypeReference<>() {});
    }

    @GetMapping("authors")
    public List<Author> getAllAuthors() {
        return ALL_AUTHORS;
    }

}
