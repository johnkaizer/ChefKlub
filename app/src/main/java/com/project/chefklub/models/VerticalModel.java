package com.project.chefklub.models;

public class VerticalModel {
    int image;
    String name;
    String duration;
    String rating;
    String cost;
    String ingredients;
    String description;

    public VerticalModel(int image, String name, String duration, String rating, String cost, String ingredients, String description) {
        this.image = image;
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.cost = cost;
        this.ingredients = ingredients;
        this.description = description;
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
