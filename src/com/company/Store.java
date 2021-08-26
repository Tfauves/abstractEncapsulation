package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Vehicle> storeInventory = new ArrayList<>();


    public void fillStoreInventory() {
        Engine jagEngine = new Engine(false, "gas");
        Engine motorCycleEngine = new Engine(false, "gas");
        Engine boatEngine = new Engine(false, "gas");
        Engine planeEngine = new Engine(false, "jet fuel");

        Car car = new Car(jagEngine, "manual", true, "Jaguar", "F- Type", "Racing Green", 0, 2,7_300_000, 200);
        Motorcycle motorBike = new Motorcycle(motorCycleEngine, "Yamaha", "YZF-R6", "red & white", 0, 2, 1_200_000, 160);
        Boat boat = new Boat(boatEngine, "Wellcraft 38", "Scarab KV", "white", 0, 5, 5_000_000, 70);
        Plane plane = new Plane(planeEngine, "Beechcraft", "King Air 350i", "white & blue", 0, 11, 312, 4_00_000_000, "not specified",2078);

        storeInventory.add(car);
        storeInventory.add(motorBike);
        storeInventory.add(boat);
        storeInventory.add(plane);

    }

    public void viewInventory(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }

    }

    public List<Vehicle> getStoreInventory() {
        return storeInventory;
    }



}
