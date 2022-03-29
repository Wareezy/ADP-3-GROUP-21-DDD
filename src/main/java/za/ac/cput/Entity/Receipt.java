package za.ac.cput.Entity;

import java.util.Date;

public class Receipt {

    public String receiptID;
    public Date date;
    private double amount;

    private Receipt (Receipt builder) {
        this.date = builder.date;
        this.receiptID = builder.receiptID;
        this.amount = builder.amount;

    }

    public String getReceiptID(){
        return receiptID;
    }

    public Date getDate(){
        return date;
    }

    public double getAmount (){
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString (){
    return "Receipt{" +
            "receiptID='" + receiptID + '\'' +
            ", date='" + date + '\'' +
            ", amount='" + amount +
            '}';
    }

    public static class Builder {
        public String receiptID;
        public Date date;
        private double amount;

    }

    public Receipt copy (Receipt receipt) {
        this.date =receipt.date;
        this.receiptID=receipt.receiptID;
        this.amount= receipt.amount;
        return this;
    }

    public Receipt build(){

        return new Receipt( this );
    }
}
