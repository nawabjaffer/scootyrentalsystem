package com.njs.scootyrental.database;

import com.njs.scootyrental.exceptions.ReservationNotFoundException;
import com.njs.scootyrental.model.Reservation;
import com.njs.scootyrental.model.Trip;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TripManager {

    final static Map<String, Trip> tripsStore = new HashMap<>();

    public static boolean addTrips(Reservation reserviour, Trip trips) {
        tripsStore.put(reserviour.reservationID,trips);
        return true;

    }

    public static List<Trip> getAlReservations() {
        return tripsStore.values().stream().collect(Collectors.toList());
    }

    public static Optional<Trip> getReservationsByID(String reservationID) throws ReservationNotFoundException {
        if (tripsStore.containsKey(reservationID)) {
            return Optional.of(tripsStore.get(reservationID));
        }
        else {
            throw new ReservationNotFoundException("Reservation ID was not found in the Reservation Store ");
        }
    }


    public static boolean deleteReservation(Reservation reservation,Trip trip) throws ReservationNotFoundException {

        if (tripsStore.containsKey(reservation.reservationID)) {
            tripsStore.remove(reservation.reservationID);
            return true;
        } else {
            throw new ReservationNotFoundException("Deleted for the selected Reservation was not found in the Reservation Store ");
        }

    }

    public static boolean updateReservation(Reservation reservation,Trip trip) throws ReservationNotFoundException {

        if (tripsStore.containsKey(reservation.reservationID)) {
            tripsStore.remove(reservation.reservationID);
            tripsStore.put(reservation.reservationID, trip );
            return true;
        } else {
            throw new ReservationNotFoundException(" Updation for the selected Reservation was not found in the Reservation ");
        }

    }

}
