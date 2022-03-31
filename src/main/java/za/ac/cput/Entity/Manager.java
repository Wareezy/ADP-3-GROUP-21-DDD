package za.ac.cput.Entity;

//Nawaaz Amien
//219099839
//Group 21

public class Manager {
    public String managerId;
    public String firstName;
    public String lastName;
    private String address;
    private int employee_number;

    private Manager(){}

    //insert private constructor
    private Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.firstName = builder.firstName;
        this.lastName =  builder.lastName;
        this.address = builder.address;
        this.employee_number = builder.employee_number;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", employee_number=" + employee_number +
                '}';
    }

    public static class Builder {
        public String managerId;
        public String firstName;
        public String lastName;
        public int employee_number;
        private String address;

        public Builder setManagerId(String managerId) {
            this.managerId = managerId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmployee_number(int employee_number) {
            this.employee_number = employee_number;
            return this;
        }

        public Builder copy(Manager manager) {
            this.managerId = manager.managerId;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.address = manager.address;
            this.employee_number = manager.employee_number;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }

}
