package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Receipt;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptFactoryTest {

    @Test
    void createReceipt(){

        Receipt receipt = ReceiptFactory.createReceipt(150.00, "12/02/2022");
        System.out.println(receipt);
        assertNotNull(receipt);
    }

}