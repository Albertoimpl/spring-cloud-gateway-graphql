package com.example.bookservice;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class BookController {

    private static List<Book> ALL_BOOKS;

    public BookController() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ALL_BOOKS = mapper.readValue(new ClassPathResource("./fixtures/books.json").getFile(), new TypeReference<>() {});
    }

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }

}
