package com.caltech.solutions.learning.management.dto.libraryTO;

/**
 * @author Weverton Souza.
 * Created on 07/02/2020
 */
public class ImageLinkTO {
    private String smallThumbnail;
    private String thumbnail;

    public ImageLinkTO() {}

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public ImageLinkTO setSmallThumbnail(final String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
        return this;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public ImageLinkTO setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
}
