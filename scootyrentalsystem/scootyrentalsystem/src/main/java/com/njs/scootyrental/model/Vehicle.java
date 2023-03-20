package com.njs.scootyrental.model;

enum Scooter{

    PETROL,
    ELECTRIC

}
public class Vehicle {
    private String id;
    private Location outletLocation;
    private boolean isReserved;

    public Vehicle(String id, Location outletLocation) {
        this.id = id;
        this.outletLocation =outletLocation;
        this.isReserved = false;
    }

    public String getId() {
        return id;
    }

    public Location getOutletLocation() {
        return outletLocation;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        isReserved = true;
    }

    public void release() {
        isReserved = false;
    }
}
