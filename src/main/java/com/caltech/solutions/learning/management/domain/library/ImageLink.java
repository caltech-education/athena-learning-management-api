package com.caltech.solutions.learning.management.domain.library;

public class ImageLink {
    private String smallThumbnail;
    private String thumbnail;

    public ImageLink() {}

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public ImageLink setSmallThumbnail(final String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
        return this;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public ImageLink setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
}
