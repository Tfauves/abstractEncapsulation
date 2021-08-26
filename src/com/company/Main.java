package com.company;

public class Main {

    public static void main(String[] args) {
        /*
Challenge for Abstract Classes and Methods:

Create a program focusing on Vehicles
Required Classes: Vehicle, Engine
Each Vehicle Class should contain one Engine
Each Vehicle Class should contain methods to:
    Start/Stop
    Add Passengers
    Remove Passengers

Basic Requirements:
At least one Abstract Class
At least two Abstract Methods
 */
        // write your code here
//        Engine fourCyl = new Engine(false, "gas");
//        Engine motorCycleEngine = new Engine(false, "gas");
//        Engine boatEngine = new Engine(false, "gas");
//        Engine planeEngine = new Engine(false, "jet fuel");
//
//        Car myCar = new Car(fourCyl, "manual", true, "Chevy", "Sonic", "Black", 0, 4,110);
//        Motorcycle myBike = new Motorcycle(motorCycleEngine, "Yamaha", "YZF-R6", "red & white", 0, 2, 160);
//        Boat myBoat = new Boat(boatEngine, "Wellcraft 38", "Scarab KV", "white", 0, 5, 70);
//        Plane myPlane = new Plane(planeEngine, "Beechcraft", "King Air 350i", "white & blue", 0, 11, 312, "not set", 2078);

//        System.out.println(myCar.toString());
//        System.out.println(myBike.toString());
//        System.out.println(myBoat.toString());
//        System.out.println(myPlane.toString());
//        myCar.addPassenger(3);
//        myCar.removePassenger(1);
//        System.out.println(myCar.toString());
//
//        myCar.carEngine.start();
//        myCar.accelerate();
//        myCar.accelerate();
//        myCar.brake();
        Store store01 = new Store();
        store01.fillStoreInventory();
        store01.viewInventory(store01.getStoreInventory());





    }
}
