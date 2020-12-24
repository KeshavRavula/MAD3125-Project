package com.foodexpo.project;

public class Restaurant {
    private String restName;
    private String restLocation;
    private String restImage;

    public Restaurant(String restName, String restLocation, String restImage) {
        this.restName = restName;
        this.restLocation = restLocation;
        this.restImage = restImage;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestLocation() {
        return restLocation;
    }

    public void setRestLocation(String restLocation) {
        this.restLocation = restLocation;
    }

    public String getRestImage() {
        return restImage;
    }

    public void setRestImage(String restImage) {
        this.restImage = restImage;
    }
}
