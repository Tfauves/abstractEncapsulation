package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> myVehicles = new ArrayList<>();




    public void setMyVehicles(Vehicle newVehicle) {
        myVehicles.add(newVehicle);
    }

//    public List<Vehicle> getMyVehicles() {
//        return myVehicles;
//    }

    public void displayMyVehicles() {
        for (Vehicle vehicle : myVehicles){
            System.out.println("Your newest vehicle has been delivered " + vehicle.getManufacturer() + " " + vehicle.getModel() + " " + vehicle.getColor());
        }
    }


}
