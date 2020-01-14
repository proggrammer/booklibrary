package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private BookDescription bookDescription;
    private Author author;
    private Publication publication;

    public Book() {
    }

    public Book(String id, BookDescription bookDescription, Author author, Publication publication) {
        this.id = id;
        this.bookDescription = bookDescription;
        this.author = author;
        this.publication = publication;
    }
}
