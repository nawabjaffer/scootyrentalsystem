package com.njs.scootyrental.model;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Reservation {

    public final String reservationID;
    private User user;
    private Vehicle vehicle;
    private LocalDateTime startTime;

    private Location pickupLocation;
    private Location dropLocation;
    private int durationInMinutes;

    public Reservation(long reservationID, User user, Vehicle vehicle, Location pickupLocation, Location dropLocation, int durationInMinutes) {
        this.reservationID = UUID.randomUUID().toString();
        this.user = user;
        this.vehicle = vehicle;
        this.durationInMinutes = durationInMinutes;
        this.startTime = LocalDateTime.now();
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return startTime.plusMinutes(durationInMinutes);
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(getEndTime());
    }
}

