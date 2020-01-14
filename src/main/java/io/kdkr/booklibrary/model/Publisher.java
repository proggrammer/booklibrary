package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Publisher {
    private String name;
    private Address address;

    public Publisher() {
    }

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
