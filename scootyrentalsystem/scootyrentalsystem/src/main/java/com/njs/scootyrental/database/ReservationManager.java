package com.njs.scootyrental.database;

import com.njs.scootyrental.exceptions.ReservationNotFoundException;
import com.njs.scootyrental.model.Reservation;
import com.njs.scootyrental.model.User;
import com.njs.scootyrental.model.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReservationManager {
    //userId,Reservation object
    final static Map<String, Reservation> reservationStore = new HashMap<>();

    public static boolean addreservation(User user, Reservation reservation) {

        reservationStore.put(user.getEmail(), reservation);
        return true;

    }

    public static List<Reservation> getAlReservations() {
        return reservationStore.values().stream().collect(Collectors.toList());
    }


    public static boolean deleteReservation(User user, Reservation reservation) throws ReservationNotFoundException {

        if (reservationStore.containsKey(user.getEmail())) {
            reservationStore.remove(user.getEmail());
            return true;
        } else {
            throw new ReservationNotFoundException("Deleted for the selected Reservation was not found in the Reservation Store ");
        }

    }

    public static boolean updateReservation(User user, Reservation reservation) throws ReservationNotFoundException {

        if (reservationStore.containsKey(user.getEmail())) {
            reservationStore.remove(user.getEmail());
            reservationStore.put(user.getEmail(),reservation );
            return true;
        } else {
            throw new ReservationNotFoundException(" Updation for the selected Reservation was not found in the Reservation ");
        }

    }


}
