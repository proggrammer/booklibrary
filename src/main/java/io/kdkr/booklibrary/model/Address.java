package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    public Address() {
    }

    public Address(String city) {
        this.city = city;
    }

    private String city;
}
