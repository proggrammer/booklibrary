package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private String name;
    private Address address;

    public Author() {
    }

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
