package com.company;

public class Car extends Vehicle {
    public Engine carEngine;
    private String TransmissionType;
    private boolean isTurboCharged;
    private int currentSpeed;


    public Car(Engine carEngine, String transmissionType, boolean isTurboCharged, String manufacturer, String model, String color, int numberOfPassengers, int maxNumberOfPassengers, int maxSpeed) {
        super(manufacturer, model, color, numberOfPassengers, maxNumberOfPassengers, maxSpeed);
        this.carEngine = carEngine;
        this.TransmissionType = transmissionType;
        this.isTurboCharged = isTurboCharged;
        currentSpeed = 0;
    }

    public void start() {
        carEngine.start();
    }

    public void stop() {
        carEngine.stop();
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

    public String toString() {
        String outPut = " | The " + getColor() + " " + getManufacturer() + " " + getModel() + " has " + getNumberOfPassengers() + " passenger(s)" + " | ";
        return outPut;
    }

    public void accelerate() {
        int speedIncrement = 20;
        if (carEngine.getIsOperating()) {
            currentSpeed += speedIncrement;
            System.out.println("Your" + " " + getColor() + " " + getManufacturer() + " " + getModel() + " is currently traveling at " + getCurrentSpeed() + " mph.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void brake() {
        int speedDecrement = 15;
        if (carEngine.getIsOperating()) {
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
