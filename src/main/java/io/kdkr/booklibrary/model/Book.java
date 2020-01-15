package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Book {
    @Id
    private String id;
    private String name;

    public Book() {
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
