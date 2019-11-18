package com.example.android.shushme;

public class MyPlaces {
    private String id;
    private String name;
    private String addess;

    public MyPlaces(String id, String name, String addess) {
        this.id = id;
        this.name = name;
        this.addess = addess;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddess() {
        return addess;
    }
}
