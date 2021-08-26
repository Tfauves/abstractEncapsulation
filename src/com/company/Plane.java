package com.company;

public class Plane extends Vehicle{
    public Engine planeEngine;
    private String directionOfTravel;
    private int distanceOfTravel;
    private int currentSpeed;

    public Plane(Engine planeEngine, String manufacturer, String model, String color, int numberOfPassengers, int maxNumberOfPassengers, int maxSpeed, String directionOfTravel, int distanceOfTravel) {
        super(manufacturer, model, color, numberOfPassengers, maxNumberOfPassengers, maxSpeed);
        this.planeEngine = planeEngine;
        this.directionOfTravel = directionOfTravel;
        this.distanceOfTravel = distanceOfTravel;
        currentSpeed = 0;
    }

    public void start() {
        planeEngine.start();
    }

    public void stop() {
        planeEngine.stop();
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
        return " | The " + getColor() + " " + getManufacturer() + " " + getModel() + " has " + getNumberOfPassengers() + " passenger(s)" + " | ";
    }

    public void accelerate() {
        int speedIncrement = 50;
        if (planeEngine.getIsOperating()) {
            currentSpeed += speedIncrement;
            System.out.println("Your" + " " + getColor() + " " + getManufacturer() + " " + getModel() + " is currently traveling at " + getCurrentSpeed() + " knots.");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void brake() {
        int speedDecrement = 15;
        if (planeEngine.getIsOperating()) {
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
