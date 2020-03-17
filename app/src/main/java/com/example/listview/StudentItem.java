package com.example.listview;

public class StudentItem {
    private String name;
    private int imageId;

    public StudentItem(String _name, int _imageId) {
        name = _name;
        imageId = _imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
