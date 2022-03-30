package za.ac.cput.Entity;
public class Tables {
    public int tableID;
    public boolean occupied;
    private String reservedTable;
    public int numSeats;

    private Tables (Builder builder){
        this.tableID = builder.tableID;
        this.occupied = builder.occupied;
        this.reservedTable = builder.reservedTable;
        this.numSeats = builder.numSeats;
    }
    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getReservedTable() {
        return reservedTable;
    }

    public void setReservedTable(String reservedTable) {
        this.reservedTable = reservedTable;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "tableID=" + tableID +
                ", occupied=" + occupied +
                ", reservedTable='" + reservedTable + '\'' +
                ", numSeats=" + numSeats +
                '}';
    }
    public static class Builder{
        public int tableID;
        public boolean occupied;
        private String reservedTable;
        public int numSeats;

        public Builder setTableID(int tableID) {
            this.tableID = tableID;
            return this;
        }

        public Builder setOccupied(boolean occupied) {
            this.occupied = occupied;
            return this;
        }

        public Builder setReservedTable(String reservedTable) {
            this.reservedTable = reservedTable;
            return this;
        }

        public Builder setNumSeats(int numSeats) {
            this.numSeats = numSeats;
            return this;
        }
        public Builder copy(Tables tables){
            this.tableID = tables.tableID;
            this.occupied = tables.occupied;
            this.reservedTable = tables.reservedTable;
            this.numSeats = tables.numSeats;
            return this;
        }
        public Tables build(){
            return new Tables(this);
        }
    }
}
