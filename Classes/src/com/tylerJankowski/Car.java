package com.tylerJankowski;

public class Car {
// "Public" = unrestricted access to this class

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;

    }

    public void setDoors(int numDoors) {
        this.doors = numDoors;
    }

    public void setWheels(int numWheels) {
        this.wheels = numWheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }
    public String getEngine() {
        return this.engine;
    }

}
