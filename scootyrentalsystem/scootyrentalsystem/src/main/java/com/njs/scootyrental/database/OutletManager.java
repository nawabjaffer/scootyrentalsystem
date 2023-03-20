package com.njs.scootyrental.database;

import com.njs.scootyrental.exceptions.OutletFailureException;
import com.njs.scootyrental.model.Location;
import com.njs.scootyrental.model.Outlet;
import com.njs.scootyrental.model.Vehicle;

import java.util.*;

public class OutletManager {
    //It will also have methods to add/remove vehicles and get the list of available vehicles.
    static {
        Outlet outletA = new Outlet("outletA", (new Location(23, 45)), new ArrayList<>() );
        Outlet outletB = new Outlet("outletB", (new Location(23, 45)), new ArrayList<>());
        Outlet outletC = new Outlet("outletC", (new Location(23, 45)), new ArrayList<>());
        Outlet outletD = new Outlet("outletD", (new Location(23, 45)), new ArrayList<>());
        Outlet outletE = new Outlet("outletE", (new Location(23, 45)), new ArrayList<>());
        outletRepo= Arrays.asList(outletA,outletB,outletC,outletD,outletE);

    }
    static List<Outlet> outletRepo = new ArrayList<>();
    public void registerNewOutlet(Outlet outlet) throws OutletFailureException {
        if(Objects.nonNull(outlet)) {
            outletRepo.add(outlet);
        }
        else {
            throw new OutletFailureException("Unable to install Outlet. Please contact ypur administrator");
        }

    }

    public void getAllOutlet(Outlet outlet) throws OutletFailureException {
        if(Objects.nonNull(outlet)) {
            outletRepo.add(outlet);
        }
        else {
            throw new OutletFailureException("Unable to install Outlet. Please contact ypur administrator");
        }

    }
    public void updateOutletVehicleList(Outlet outlet, List<Vehicle> vehicleList ) throws OutletFailureException {
        if(Objects.nonNull(outlet) && outletRepo.contains(outlet)) {
            outlet.setVehicleList(vehicleList);
        }
        else {
            throw new OutletFailureException("Unable to install Outlet. Please contact ypur administrator");
        }

    }



}
