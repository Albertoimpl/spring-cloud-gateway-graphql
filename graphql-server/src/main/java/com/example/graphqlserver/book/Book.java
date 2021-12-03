package com.example.graphqlserver.book;

import java.util.List;

public class Book {

    private String isbn;
    private String title;
    private int pageCount;
    private List<String> authors;

    public Book() {
    }

    public Book(String isbn, String title, int pageCount, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
