package za.ac.cput.Entity;

public class ChefID {
    private String name;
    private String address;
    private String order;
    private String availableItems;
    private int id;

    //private constructor
    private ChefID(){}

    private ChefID(Builder builder){
        this.id = builder.id;
        this.address = builder.address;
        this.name = builder.name;
        this.order = builder.order;
        this.availableItems = builder.availableItems;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOrder() {
        return order;
    }

    public String getAvailableItems() {
        return availableItems;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "chefID{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", order='" + order + '\'' +
                ", availableItems='" + availableItems + '\'' +
                ", id=" + id +
                '}';
    }
    //builder pattern

    public static class Builder{
        private String name;
        private String address;
        private String order;
        private String availableItems;
        private int id;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setOrder(String order) {
            this.order = order;
            return this;
        }

        public Builder setAvailableItems(String availableItems) {
            this.availableItems = availableItems;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder copy(ChefID chefid){
            this.id = chefid.id;
            this.name = chefid.name;
            this.order = chefid.order;
            this.address = chefid.address;
            this.availableItems = chefid.availableItems;

            return this;
        }
        public ChefID build(){

            return new ChefID(this);

        }

    }
}

