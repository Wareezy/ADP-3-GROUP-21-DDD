package za.ac.cput.Entity;
/*Warren Jaftha(Leader) -219005303
Customer.java
27/03/2022
 */
public class Customer {
    private String customerID;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String customerCellNumber;
    private String customerTemperature;

    private Customer(){}

    private Customer(Builder builder)
    {

        this.customerID=builder.customerID;
        this.customerName=builder.customerName;
        this.customerSurname=builder.customerSurname;
        this.customerEmail=builder.customerEmail;
        this.customerCellNumber=builder.customerCellNumber;
        this.customerTemperature=builder.customerTemperature;
    }
    public String getCustomerID(){return customerID;}
    public String getCustomerName(){return customerName;}
    public String getCustomerSurname(){return customerSurname;}
    public String getCustomerEmail(){return customerEmail;}
    public String getCustomerCellNumber(){return customerCellNumber;}
    public String getCustomerTemperature(){return customerTemperature;}

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerCellNumber='" + customerCellNumber + '\'' +
                ", customerTemperature='" + customerTemperature + '\'' +
                '}';
    }

    public static class Builder
    {
        //has same attributes as above
        private String customerID;
        private String customerName;
        private String customerSurname;
        private String customerEmail;
        private String customerCellNumber;
        private String customerTemperature;

        public Builder setCustomerID(String customerID) {
            this.customerID= customerID;//these are setters but they going to return a value and they are going to return a builder object
            //it sets the employee number then it returns -----this----- you have to change void to "Builder"
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setCustomerSurname(String customerSurname) {
            this.customerSurname = customerSurname;
            return this;
        }
        public Builder setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }
        public Builder setCustomerCellNumber(String customerCellNumber) {
            this.customerCellNumber= customerCellNumber;
            return this;
        }
        public Builder setCustomerTemperature(String customerTemperature) {
            this.customerTemperature= customerTemperature;
            return this;
        }
        public Builder copy(Customer customer)
        {
            this.customerID=customer.customerID;
            this.customerName=customer.customerName;
            this.customerSurname=customer.customerSurname;
            this.customerEmail=customer.customerEmail;
            this.customerCellNumber=customer.customerCellNumber;
            this.customerTemperature=customer.customerTemperature;
            return this;
        }
        public Customer build()
        {
            return new Customer(this);//return an anonymous object, "this" is a builder object

        }
    }
}


