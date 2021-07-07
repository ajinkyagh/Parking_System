package com.company;

public class Car {
    private String plate;
    private String colour;

    public Car(String numberPlate, String colour) {
        this.plate=numberPlate;
        this.colour=colour;
    }

    public String getPlate() {
        return plate;
    }

    public String getColour() {
        return colour;
    }
}
