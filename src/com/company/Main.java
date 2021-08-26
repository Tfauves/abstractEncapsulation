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
        Engine fourCyl = new Engine(false, "gas");

        Car myCar = new Car(fourCyl, "manual", true, "Chevy", "Sonic", "Black", 1, 4);

        System.out.println(myCar.toString());
        myCar.addPassenger(2);
        System.out.println(myCar.toString());




    }
}
