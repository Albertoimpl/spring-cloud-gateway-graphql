package com.example.bookservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private static List<Book> ALL_BOOKS;

    public BookController() {
        ALL_BOOKS = new ArrayList<>();
        ALL_BOOKS.add(new Book("9780007119271", "The Mysterious Affair at Styles", 296, List.of("Agatha Christie")));
        ALL_BOOKS.add(new Book("9780008196523", "The Thirteen Problems", 256, List.of("Agatha Christie")));
    }

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }

}
