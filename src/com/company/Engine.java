package com.company;

public class Engine {
    private boolean isOperating;
    private String fuelType;


    public Engine(boolean isOperating, String fuelType) {
        this.isOperating = isOperating;
        this.fuelType = fuelType;
    }

    public void start() {
        if (!isOperating) {
            isOperating = true;
            System.out.println("The engine has started");
        }
    }

    public void stop() {
        if (isOperating) {
            isOperating = false;
            System.out.println("The engine is stopped");
        }
    }

}
