package za.ac.cput.Factory;

//Nawaaz Amien
//219099839
//Group 21

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.BookingPrice;

import static org.junit.jupiter.api.Assertions.*;

class BookingPriceFactoryTest {

    @Test
    public void createBooking(){
        BookingPrice bookingPrice = BookingPriceFactory.createBooking("01213456",600,"002", 0001);
        System.out.println(bookingPrice);
        assertNotNull(bookingPrice);
    }

}