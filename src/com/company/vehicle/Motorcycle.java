package com.company.vehicle;

import com.company.Engine;
import com.company.vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    private Engine bikeEngine;
    private int currentSpeed;

    public Motorcycle(Engine bikeEngine, String manufacturer, String type, String model, String color, int numberOfPassengers, int maxNumberOfPassengers, int cost, int maxSpeed) {
        super(manufacturer, type, model, color, numberOfPassengers, maxNumberOfPassengers, maxSpeed, cost);
        this.bikeEngine = bikeEngine;
        currentSpeed = 0;

    }

    public void start() {
        bikeEngine.start();
    }

    public void stop() {
        bikeEngine.stop();
    }

    public void addPassenger(int numberOfPassengers) {
        if (numberOfPassengers < getMaxNumberOfPassengers()) {
            setNumberOfPassengers(getNumberOfPassengers() + numberOfPassengers);
            System.out.println("Passenger added successfully.");
        } else {
            System.out.println("There is not enough seating for that many passengers. The max amount of passengers is" + " " + getMaxNumberOfPassengers() + " Please try a different amount.");

        }
    }

    public void removePassenger(int numberOfPassengers) {
        if (getNumberOfPassengers() != 0) {
            setNumberOfPassengers(getNumberOfPassengers() - numberOfPassengers);
        } else {
            System.out.println("There are no passengers to remove");
        }
    }

//    public String toString() {
//        return " | The " + getColor() + " " + getManufacturer() + " " + getModel() + " has " + getNumberOfPassengers() + " passenger(s)" + " | ";
//    }

    public String toString() {
        return " | The " + getColor() + " " + getManufacturer() + " " + getModel() + " can be yours for " + displayPrice() + " | ";
    }

    public void accelerate() {
        int speedIncrement = 25;
        if (bikeEngine.getIsOperating()) {
            currentSpeed += speedIncrement;
            System.out.println("Your" + " " + getColor() + " " + getManufacturer() + " " + getModel() + " is currently traveling at " + getCurrentSpeed() + " mph.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void brake() {
        int speedDecrement = 10;
        if (bikeEngine.getIsOperating()) {
            currentSpeed -= speedDecrement;
            System.out.println("You applied the brakes. Your speed is now " + getCurrentSpeed() + " mph.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}
