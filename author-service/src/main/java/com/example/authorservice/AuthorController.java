package com.example.authorservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorController {

    private static List<Author> ALL_AUTHORS;

    public AuthorController() {
        ALL_AUTHORS = new ArrayList<>();
        ALL_AUTHORS.add(new Author("Agatha", "Christie", "pic", "email", "phone"));
        ALL_AUTHORS.add(new Author("Barbara", "Cartland", "pic", "email", "phone"));
        ALL_AUTHORS.add(new Author("William", "Shakespeare", "pic", "email", "phone"));
        ALL_AUTHORS.add(new Author("Corin", "Tellado", "pic", "email", "phone"));
        ALL_AUTHORS.add(new Author("Leo", "Tolstoy", "pic", "email", "phone"));
    }

    @GetMapping("authors")
    public List<Author> getAllAuthors() {
        return ALL_AUTHORS;
    }

}
