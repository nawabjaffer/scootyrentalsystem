package com.njs.scootyrental.model;


import java.util.ArrayList;
import java.util.List;

public class Outlet {
    private String name;
    private Location location;
    private List<Vehicle> vehicles;
    private int parkingSlots;

    public Outlet(String name, Location location, List<Vehicle> vehicleList) {
        this.name = name;
        this.location = location;
        this.vehicles = vehicleList;
        this.parkingSlots = vehicleList.size();
    }

    public String setVehicleList(List<Vehicle> vehiclesList) {
        this.vehicles = vehiclesList;
        return "List was added succesfully";
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getParkingSlots() {
        return parkingSlots;
    }

    public boolean hasFreeParkingSlot() {
        return vehicles.size() < parkingSlots;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}