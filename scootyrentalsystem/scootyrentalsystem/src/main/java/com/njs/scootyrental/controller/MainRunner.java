package com.njs.scootyrental.controller;

import com.njs.scootyrental.database.OutletManager;
import com.njs.scootyrental.database.ReservationManager;
import com.njs.scootyrental.database.TripManager;
import com.njs.scootyrental.database.UserManager;
import com.njs.scootyrental.exceptions.OutletFailureException;
import com.njs.scootyrental.model.Location;
import com.njs.scootyrental.model.Outlet;
import com.njs.scootyrental.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;

public class MainRunner {

    private static UserManager userManager;
    private static ReservationManager reservationManager;
    private static TripManager tripManager;
    private static OutletManager outletManager;

    // A container to handle the single instances its runs once when the class loaded
    static {
        userManager=new UserManager();
        reservationManager = new ReservationManager();
        tripManager = new TripManager();
        outletManager = new OutletManager();

    }
    public static void main(String ...args)
    {

    }

    private static void getThenewUser() {


    }

    private static void addNewO() {

        Outlet out =new  Outlet("OutletZ", new Location(23,56), Arrays.asList(new Vehicle("TN72AY1517",new Location(23,56)),new Vehicle("TN72AY1117",new Location(23,56)),new Vehicle("TN72AY1519",new Location(23,56))));
        try {
            outletManager.registerNewOutlet(out);
        } catch (OutletFailureException e) {
            throw new RuntimeException(e);
        }

    }

}
