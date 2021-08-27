package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    public Garage customerGarage = new Garage();
    public static final Scanner scanner = new Scanner(System.in);

    private List<Vehicle> storeInventory = new ArrayList<>();


    public void fillStoreInventory() {

        Car car = new Car(new Engine(false, "gas"), "manual", "car", true, "Jaguar", "F- Type", "Racing Green", 0, 2,7_300_000, 200);
        Motorcycle motorBike = new Motorcycle(new Engine(false, "gas"), "Yamaha", "motor bike", "YZF-R6", "red & white", 0, 2, 1_200_000, 160);
        Boat boat = new Boat(new Engine(false, "gas"), "Wellcraft 38", "boat","Scarab KV", "white", 0, 5, 5_000_000, 70);
        Plane plane = new Plane(new Engine(false, "gas"), "Beechcraft", "plane", "King Air 350i", "white & blue", 0, 11, 312, 4_00_000_000, "not specified",2078);

        storeInventory.add(car);
        storeInventory.add(motorBike);
        storeInventory.add(boat);
        storeInventory.add(plane);

    }

    public void viewInventory(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
            System.out.println();
        }

    }

    public void displayInventory() {
        System.out.println("                            Current Inventory            ");
        System.out.println("--------------------------------------------------------------------------------");
        viewInventory(storeInventory);
    }


    public void buyVehicle() {
        System.out.println("Enter Selection: ");
        System.out.println("""
                1). Car
                2). Motor Bike
                3). Boat
                4). plane
                """);
        String userSelection = scanner.next();
        switch (userSelection) {
            case "1":
                if (userSelection.equals("1")) {
                    for (int i = 0; i < storeInventory.size(); i++) {
                        if (storeInventory.get(i).getType().equals("car")) {
                            deliver(storeInventory.get(i));
                            storeInventory.remove(storeInventory.get(i));
                        }
                    }
                }

        }

    }

    public void deliver(Vehicle vehicle) {
        customerGarage.setMyVehicles(vehicle);

    }



    public List<Vehicle> getStoreInventory() {
        return storeInventory;
    }

    public void setStoreInventory(Vehicle vehicle) {

        storeInventory.remove(vehicle);
    }



}
