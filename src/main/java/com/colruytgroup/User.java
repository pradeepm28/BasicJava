package com.colruytgroup;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(String name){
        this.name =name;
    }

    public String toString() {
        return name;
    }

}

