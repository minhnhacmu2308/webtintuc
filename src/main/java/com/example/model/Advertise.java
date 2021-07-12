package com.example.model;

public class Advertise {
    private int id;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Advertise(int id, String image) {
        this.id = id;
        this.image = image;
    }

    public Advertise() {
    }

    @Override
    public String toString() {
        return "Advertise{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
