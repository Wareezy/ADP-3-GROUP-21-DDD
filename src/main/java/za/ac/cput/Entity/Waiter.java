package za.ac.cput.Entity;

public class Waiter {
    private String waiterID;
    private String waiterName;
    private String waiterSurname;
    private String waiterCellNumber;

    private Waiter(){}

    private Waiter(Builder builder)
    {

        this.waiterID=builder.waiterID;
        this.waiterName=builder.waiterName;
        this.waiterSurname=builder.waiterSurname;
        this.waiterCellNumber=builder.waiterCellNumber;

    }
    public String getWaiterID(){return waiterID;}
    public String getWaiterName(){return waiterName;}
    public String getWaiterSurname(){return waiterSurname;}
    public String getWaiterCellNumber(){return waiterCellNumber;}

    @Override
    public String toString() {
        return "Waiter{" +
                "waiterID='" + waiterID + '\'' +
                ", waiterName='" + waiterName + '\'' +
                ", waiterSurname='" + waiterSurname + '\'' +
                ", waiterCellNumber='" + waiterCellNumber + '\'' +
                '}';
    }


    public static class Builder
    {
        //has same attributes as above
        private String waiterID;
        private String waiterName;
        private String waiterSurname;
        private String waiterCellNumber;


        public Waiter.Builder setWaiterID(String waiterID) {
            this.waiterID= waiterID;//these are setters but they going to return a value and they are going to return a builder object
            //it sets the employee number then it returns -----this----- you have to change void to "Builder"
            return this;
        }

        public Waiter.Builder setWaiterName(String waiterName) {
            this.waiterName = waiterName;
            return this;
        }

        public Waiter.Builder setWaiterSurname(String waiterSurname) {
            this.waiterSurname = waiterSurname;
            return this;
        }
        public Waiter.Builder setWaiterCellNumber(String waiterCellNumber) {
            this.waiterCellNumber= waiterCellNumber;
            return this;
        }

        public Waiter.Builder copy(Waiter waiter)
        {
            this.waiterID=waiter.waiterID;
            this.waiterName=waiter.waiterName;
            this.waiterSurname=waiter.waiterSurname;
            this.waiterCellNumber=waiter.waiterCellNumber;
            return this;
        }
        public Waiter build()
        {
            return new Waiter(this);//return an anonymous object, "this" is a builder object

        }
    }
}

