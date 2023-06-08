package com.javaprojects.classes1;

import java.util.Arrays;

public class CarDealerShip {
    private String name;
    private int maxCarsOnDisplay;
    private int maxCarsInStock;

    public CarDealerShip() {
    }

    public CarDealerShip(String name, int maxCarsOnDisplay, int maxCarsInStock) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.maxCarsInStock = maxCarsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public int getMaxCarsInStock() {
        return maxCarsInStock;
    }

    public void setMaxCarsInStock(int maxCarsInStock) {
        this.maxCarsInStock = maxCarsInStock;
    }

    @Override
    public String toString() {
        return "CarDealerShip{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", maxCarsInStock=" + maxCarsInStock +
                '}';
    }
}
