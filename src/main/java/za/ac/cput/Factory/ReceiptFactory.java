package za.ac.cput.Factory;

import za.ac.cput.Entity.Receipt;
import za.ac.cput.Util.Helper;

public class ReceiptFactory {

    public static Receipt createReceipt( double amount, String date) {



        String receipt1 = Helper.receipt1 ();

        Receipt receipt = new
                Receipt.Builder().setReceiptID(receipt1)
                .setAmount(amount)
                .setDate(date)
                .build();
        return receipt;
    }
}
