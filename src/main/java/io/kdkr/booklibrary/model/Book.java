package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String id;
    private String name;

    public Book() {
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
