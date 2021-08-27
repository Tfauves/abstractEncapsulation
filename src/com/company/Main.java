package com.company;

import com.company.vehicle.Boat;
import com.company.vehicle.Car;
import com.company.vehicle.Motorcycle;
import com.company.vehicle.Plane;

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
        Car car = new Car(new Engine(false, "gas"), "manual", "car", true, "Jaguar", "F- Type", "Racing Green", 0, 2,7_300_000, 200);
        Motorcycle motorBike = new Motorcycle(new Engine(false, "gas"), "Yamaha", "motor bike", "YZF-R6", "red & white", 0, 2, 1_200_000, 160);
        Boat boat = new Boat(new Engine(false, "gas"), "Wellcraft 38", "boat","Scarab KV", "white", 0, 5, 5_000_000, 70);
        Plane plane = new Plane(new Engine(false, "gas"), "Beechcraft", "plane", "King Air 350i", "white & blue", 0, 11, 312, 4_00_000_000, "not specified",2078);


        car.addPassenger(2);
       car.removePassenger(1);

        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();


        Store store01 = new Store();
        store01.fillStoreInventory();
        store01.displayInventory();
        store01.buyVehicle();
        store01.customerGarage.displayMyVehicles();

    }
}
