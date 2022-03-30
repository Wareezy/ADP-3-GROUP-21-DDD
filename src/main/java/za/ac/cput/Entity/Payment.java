package za.ac.cput.Entity;

public class Payment {
    private String customerID;
    private double orderAmount;
    private String paymentOption;

    private Payment() {
    }

    private Payment(Builder builder) {
        this.customerID = builder.customerID;
        this.orderAmount = builder.orderAmount;
        this.paymentOption = builder.paymentOption;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "customerID='" + customerID + '\'' +
                ", orderAmount=" + orderAmount + '\'' +
                ", paymentOption='" + paymentOption +
                '}';
    }

    public static class Builder {

        private String customerID;
        private double orderAmount;
        private String paymentOption;

        public Builder setPaymentOption(String paymentOption) {
            this.paymentOption = paymentOption;
            return null;
        }

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return null;
        }

        public Builder setOrderAmount(double orderAmount) {
            this.orderAmount = orderAmount;
            return null;
        }

        public Builder copy(Payment payment) {
            this.paymentOption = payment.paymentOption;
            this.orderAmount = payment.orderAmount;
            this.customerID = payment.customerID;
            return this;
        }

        public Payment build() {

            return new Payment(this);

        }

    }

}
