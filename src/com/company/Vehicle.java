package com.company;

public abstract class Vehicle {
    private String manufacturer;
    private String model;
    private String color;
    private int numberOfPassengers;
    private int maxNumberOfPassengers;

    public Vehicle(String manufacturer, String model, String color, int numberOfPassengers, int maxNumberOfPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void addPassenger(int passengerQty);

    public abstract void removePassenger();

    public abstract String toString();



    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

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

}
