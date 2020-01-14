package io.kdkr.booklibrary.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDescription {
    private String name;
    private String about;
    private String imageUrl;
    private String videoUrl;

    public BookDescription() {
    }

    public BookDescription(String name, String about, String imageUrl, String videoUrl) {
        this.name = name;
        this.about = about;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
    }
}
