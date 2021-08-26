package com.company;

public class Boat extends Vehicle{
    public Engine boatEngine;
    private int currentSpeed;

    public Boat(Engine boatEngine, String manufacturer, String model, String color, int numberOfPassengers, int maxNumberOfPassengers, int cost, int maxSpeed) {
        super(manufacturer, model, color, numberOfPassengers, maxNumberOfPassengers, maxSpeed, cost);
        this.boatEngine = boatEngine;
        currentSpeed = 0;
    }

    public void start() {
        boatEngine.start();
    }

    public void stop() {
        boatEngine.stop();
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
        int speedIncrement = 10;
        if (boatEngine.getIsOperating()) {
            currentSpeed += speedIncrement;
            System.out.println("Your" + " " + getColor() + " " + getManufacturer() + " " + getModel() + " is currently traveling at " + getCurrentSpeed() + " knots.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void brake() {
        int speedDecrement = 5;
        if (boatEngine.getIsOperating()) {
            currentSpeed -= speedDecrement;
            System.out.println("Decreasing throttle. Your speed is now " + getCurrentSpeed() + " knots.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}
