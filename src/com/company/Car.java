package com.company;

public class Car extends Vehicle {
    public Engine carEngine;
    private String TransmissionType;
    private boolean isTurboCharged;


    public Car(Engine carEngine, String transmissionType, boolean isTurboCharged, String manufacturer, String model, String color, int numberOfPassengers, int maxNumberOfPassengers) {
        super(manufacturer, model, color, numberOfPassengers, maxNumberOfPassengers);
        this.carEngine = carEngine;
        this.TransmissionType = transmissionType;
        this.isTurboCharged = isTurboCharged;
    }

    public void start() {
        carEngine.start();
    }

    public void stop() {
        carEngine.stop();
    }


    public void addPassenger(int numberOfPassengers) {
        setNumberOfPassengers(getNumberOfPassengers() + numberOfPassengers);
    }

    public void removePassenger() {

        getNumberOfPassengers();
    }

    public String toString() {
        String outPut = " | The " + getColor() + " " + getManufacturer() + " " + getModel() + " has " + getNumberOfPassengers() + " passenger(s)" + " | ";
        return outPut;
    }


}
