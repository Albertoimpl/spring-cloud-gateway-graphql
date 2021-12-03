package com.example.graphqlserver;

import com.example.graphqlserver.author.Author;
import com.example.graphqlserver.author.AuthorClient;
import com.example.graphqlserver.book.Book;
import com.example.graphqlserver.book.BookClient;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibraryController {

    private final BookClient bookClient;
    private final AuthorClient authorClient;

    public LibraryController(BookClient bookClient, AuthorClient authorClient) {
        this.bookClient = bookClient;
        this.authorClient = authorClient;
    }

    @QueryMapping
    public List<Book> books() {
        return bookClient.getAllBooks();
    }

    @SchemaMapping
    public List<Author> authors(Book book) {
        // TODO Search authors for that book
        return authorClient.getAllAuthors();
    }

}
