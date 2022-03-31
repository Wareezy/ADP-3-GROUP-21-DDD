package za.ac.cput.Entity;

import org.apache.maven.model.Build;

import java.util.Date;

public class Receipt {

    public String receiptID;
    public String date;
    private double amount;

    private Receipt() {
    }

    private Receipt(Builder builder) {
        this.date = builder.date;
        this.receiptID = builder.receiptID;
        this.amount = builder.amount;

    }

    public String getReceiptID() {
        return receiptID;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptID='" + receiptID + '\'' +
                ", date='" + date + '\'' +
                ", amount='" + amount +
                '}';
    }

    public static class Builder {

        public String receiptID;
        public String date;
        private double amount;


        public Builder setReceiptID(String receiptID) {
            this.receiptID = receiptID;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }


        public Builder copy(Receipt receipt) {
            this.date = receipt.date;
            this.receiptID = receipt.receiptID;
            this.amount = receipt.amount;
            return this;
        }

        public Receipt build() {

            return new Receipt(this);
        }
    }
}

