package za.ac.cput.Factory;

//Nawaaz Amien
//219099839
//Group 21

import za.ac.cput.Entity.BookingPrice;
import za.ac.cput.Util.Helper;

public class BookingPriceFactory {
    public static BookingPrice createBooking(String CustomerId, int deposit_price, String waiterId, int tableId){
        String customerBookingId= Helper.bookingId();
        BookingPrice bookingPrice = new BookingPrice.Builder().setBookingId(customerBookingId)
                .setCustomerId(CustomerId)
                .setDeposit_price(deposit_price)
                .setWaiterId(waiterId)
                .setTableId(tableId)
                .build();
        return bookingPrice;
    }

}

