package com.njs.scootyrental.controller;

import com.njs.scootyrental.database.ReservationManager;
import com.njs.scootyrental.database.UserManager;
import com.njs.scootyrental.exceptions.ReservationNotFoundException;
import com.njs.scootyrental.model.Reservation;
import com.njs.scootyrental.model.User;
import com.njs.scootyrental.model.Vehicle;

public class RservationService {

    ReservationManager reservationRepo;
    UserManager userRepo;

    public RservationService(ReservationManager reservationService,UserManager userManager) {
        this.reservationRepo = reservationService;
        userRepo = userManager;
    }


    boolean reserveVehicleByUser(User user, Reservation reservatiom)
    {
       return reservationRepo.addreservation(user,reservatiom);
    }
    boolean cancelVehicleByUser(User user ,Reservation reservatiom)
    {
        try {
            return reservationRepo.deleteReservation(user,reservatiom);
        } catch (ReservationNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
