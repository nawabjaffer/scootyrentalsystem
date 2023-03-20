package com.njs.scootyrental.model;

public class Trip {

    private final int OUTLET_DISTANCE_DROPLOCATION = 10;

    public long tripId;
    private Reservation reservationDetails;
    int tripCost;
    private Location pickuplocation;
    private Location droplocation;

}
