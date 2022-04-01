package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;
import za.ac.cput.Util.Helper;

public class PaymentFactory {
    public static Payment createPayment (String paymentOption, double orderAmount) {

        String payment1 = Helper.payment1();

        Payment payment = new
                Payment.Builder().setPaymentID(payment1)
        .setPaymentOption(paymentOption)
        .setOrderAmount(orderAmount)
                .build();
        return payment;

    }
}
