package za.ac.cput.Entity;

public class BookingPrice {
    private String BookingId;
    private String CustomerId;
    private int deposit_price;
    public String waiterId;
    public int tableId;

    private BookingPrice(){}

    //insert private constructor
    private BookingPrice(BookingPrice.Builder builder) {
        this.BookingId = builder.BookingId;
        this.CustomerId = builder.CustomerId;
        this.deposit_price = builder.deposit_price;
        this.waiterId = builder.waiterId;
        this.tableId = builder.tableId;
    }

    public String getBookingId() {
        return BookingId;
    }

    public String getCustomerId() {
        return CustomerId;
    }


    public String getWaiterId() {
        return waiterId;
    }


    public int getTableId() {
        return tableId;
    }


    public int getDeposit_price() {
        return deposit_price;
    }

    public void setDeposit_price(int deposit_price) {
        this.deposit_price = deposit_price;
    }

    @Override
    public String toString() {
        return "BookingPrice{" +
                "BookingId='" + BookingId + '\'' +
                ", CustomerId='" + CustomerId + '\'' +
                ", deposit_price=" + deposit_price +
                ", waiterId='" + waiterId + '\'' +
                ", tableId=" + tableId +
                '}';
    }

    public static class Builder {
        private String BookingId;
        private String CustomerId;
        private int deposit_price;
        public String waiterId;
        public int tableId;

        public void setBookingId(String bookingId) {
            BookingId = bookingId;
        }

        public void setCustomerId(String customerId) {
            CustomerId = customerId;
        }

        public void setWaiterId(String waiterId) {
            this.waiterId = waiterId;
        }

        public void setTableId(int tableId) {
            this.tableId = tableId;
        }

        public void setDeposit_price(int deposit_price) {
            this.deposit_price = deposit_price;
        }

        public BookingPrice.Builder copy(BookingPrice bookingprice) {
            this.BookingId = bookingprice.BookingId;
            this.CustomerId = bookingprice.CustomerId;
            this.waiterId = bookingprice.waiterId;
            this.deposit_price = bookingprice.deposit_price;
            this.tableId = bookingprice.tableId;
            return this;
        }

        public BookingPrice build() {
            return new BookingPrice(this);
        }
    }

}
