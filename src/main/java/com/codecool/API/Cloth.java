package com.codecool.API;

public class Cloth {

    private String brand;
    private String id;
    protected Type type;

    public Cloth(String brand, String id, Type type) {
        this.brand = brand;
        this.id = id;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
