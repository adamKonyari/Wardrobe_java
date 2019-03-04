package com.codecool.API.Clothing;

public abstract class Cloth {

    private String brand;
    private String id;
    protected Type type;

    public Cloth(String brand, String id) {
        this.brand = brand;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
