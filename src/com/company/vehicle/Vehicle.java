package com.company.vehicle;

import java.text.NumberFormat;

public abstract class Vehicle {
    private String manufacturer;
    private String type;
    private String model;
    private String color;
    private int cost;
    private int numberOfPassengers;
    private int maxNumberOfPassengers;
    private int maxSpeed;

    public Vehicle(String manufacturer, String type, String model, String color, int numberOfPassengers, int maxNumberOfPassengers, int maxSpeed, int cost) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.model = model;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void addPassenger(int passengerQty);

    public abstract void removePassenger(int passengerQty);

    public abstract void accelerate();

    public abstract void brake();

    public String displayPrice() {
        return NumberFormat.getCurrencyInstance().format(getCost()/100.0);
    }


    public abstract String toString();

    public String getType() {
        return type;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // TODO: 8/26/2021 remove this. 
    public void setNumberOfPassengers(int totalPassengers) {
        numberOfPassengers = totalPassengers;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public int getCost() {
        return cost;
    }
}
