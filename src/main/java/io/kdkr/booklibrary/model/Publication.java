package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Publication {
    private String year;
    private Publisher publisher;

    public Publication() {
    }

    public Publication(String year, Publisher publisher) {
        this.year = year;
        this.publisher = publisher;
    }
}
