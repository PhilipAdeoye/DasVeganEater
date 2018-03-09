package com.example.philip.dasveganeater;

import java.io.Serializable;

/**
 * Created by Philip-Mac on 3/4/18.
 */

public class Food implements Serializable {

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, String shortDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
    }

    public Food(String name, String shortDescription, int imageResourceId) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.imageResourceId = imageResourceId;
    }

    public Food(String name, String shortDescription, int imageResourceId, String longDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImageResourceId() {
        return imageResourceId != Constants.NO_IMAGE_PROVIDED;
    }

    private String name;
    private String shortDescription;

    private  String longDescription;

    private int imageResourceId = Constants.NO_IMAGE_PROVIDED;
}
