package com.project.chefklub.models;

public class QuickTipModel {

    int image;
    String name;
    String tip;

    public QuickTipModel(int image, String name, String tip) {
        this.image = image;
        this.name = name;
        this.tip = tip;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
