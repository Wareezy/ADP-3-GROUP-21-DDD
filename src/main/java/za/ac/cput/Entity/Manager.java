package za.ac.cput.Entity;

public class Manager {
    public String managerId;
    public String firstname;
    public String lastname;
    private String address;
    private int contact_number;

    //insert private constructor
    private Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.firstname = builder.firstname;
        this.lastname =  builder.lastname;
        this.address = builder.address;
        this.contact_number = builder.contact_number;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", contact_number=" + contact_number +
                '}';
    }

    public static class Builder {
        public String managerId;
        public String firstname;
        public String lastname;
        private String address;
        private int contact_number;

        public void setManagerId(String managerId) {
            this.managerId = managerId;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setContact_number(int contact_number) {
            this.contact_number = contact_number;
        }

        public Builder copy(Manager manager) {
            this.managerId = manager.managerId;
            this.firstname = manager.firstname;
            this.lastname = manager.lastname;
            this.address = manager.address;
            this.contact_number = manager.contact_number;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }

}
