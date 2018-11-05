package com.company.android_2;

public class Furniture {
    private String name;
    private String manufacturer;
    private String material;
    private String color;
    private int cost;

    public Furniture(String name, String manufacturer, String material, String color, int cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
