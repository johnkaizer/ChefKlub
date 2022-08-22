package com.project.chefklub.models;

public class VerticalModel {
    int image;
    String name;
    String duration;
    String rating;
    String cost;

    public VerticalModel(int image, String name, String duration, String rating, String cost) {
        this.image = image;
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.cost = cost;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
