package za.ac.cput.Factory;

import za.ac.cput.Entity.Reservation;

public class ReservationFactory {

    public static Reservation createReservation(int reservationNo, int timeOfReservation, int numSeats, int tableID){
return new Reservation.Builder().setReservationNo(reservationNo)
        .setTimeOfReservation(timeOfReservation)
        .setNumSeats(numSeats)
        .setTableID(tableID)
        .build();
    }
}
