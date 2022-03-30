package za.ac.cput.Entity;

public class SupplierID {
    private String nameCompany;
    private String email;
    private String order;
    private String address;
    private String Stock;
    private int   id;

    //private constructor
    private SupplierID(){}

    private SupplierID(Builder builder){

        this.address = builder.address;
        this.id = builder.id;
        this.email = builder.address;
        this.nameCompany = builder.nameCompany;
        this.order = builder.order;
        this.Stock = builder.Stock;

    }

    public String getNameCompany() {
        return nameCompany;
    }


    public String getEmail() {
        return email;
    }


    public String getOrder() {
        return order;
    }


    public String getAddress() {
        return address;
    }

    public String getStock() {
        return Stock;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "SupplierID{" +
                "nameCompany='" + nameCompany + '\'' +
                ", email='" + email + '\'' +
                ", order='" + order + '\'' +
                ", address='" + address + '\'' +
                ", Stock='" + Stock + '\'' +
                ", id=" + id +
                '}';
    }
    //builder pattern
    public static class Builder{
        private String nameCompany;
        private String email;
        private String order;
        private String address;
        private String Stock;
        private int   id;

        public Builder setNameCompany(String nameCompany) {
            this.nameCompany = nameCompany;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setOrder(String order) {
            this.order = order;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setStock(String stock) {
            Stock = stock;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder copy(SupplierID supplierid){
            this.id = supplierid.id;
            this.address = supplierid.address;
            this.email = supplierid.email;
            this.nameCompany = supplierid.nameCompany;
            this.order = supplierid.order;
            this.Stock = supplierid.Stock;

            return this;

        }
        public SupplierID build(){

            return new SupplierID(this);
        }

    }
}
