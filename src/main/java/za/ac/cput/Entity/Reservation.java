package za.ac.cput.Entity;

public class Reservation {
    private int reservationNo;
    private  int timeOfReservation;
    public int numSeats;;
    public int tableID;

    private Reservation(Builder builder){
        this.reservationNo = builder.reservationNo;
        this.timeOfReservation = builder.timeOfReservation;
        this.numSeats = builder.numSeats;
        this.tableID = builder.tableID;
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(int reservationNo) {
        this.reservationNo = reservationNo;
    }

    public int getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(int timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNo=" + reservationNo +
                ", timeOfReservation=" + timeOfReservation +
                ", numSeats=" + numSeats +
                ", tableID=" + tableID +
                '}';
    }
    public static class Builder{
        private int reservationNo;
        private  int timeOfReservation;
        public int numSeats;;
        public int tableID;

        public Builder setReservationNo(int reservationNo) {
            this.reservationNo = reservationNo;
            return this;
        }

        public Builder setTimeOfReservation(int timeOfReservation) {
            this.timeOfReservation = timeOfReservation;
            return this;
        }

        public Builder setNumSeats(int numSeats) {
            this.numSeats = numSeats;
            return this;
        }

        public Builder setTableID(int tableID) {
            this.tableID = tableID;
            return this;
        }
        public Builder copy(Reservation reservation){
            this.reservationNo = reservation.reservationNo;
            this.timeOfReservation = reservation.timeOfReservation;
            this.numSeats = reservation.timeOfReservation;
            this.tableID = reservation.tableID;
            return this;
        }
        public Reservation build(){
            return new Reservation(this);
        }
    }
}
