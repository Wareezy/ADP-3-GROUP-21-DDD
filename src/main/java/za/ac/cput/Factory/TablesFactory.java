package za.ac.cput.Factory;

import za.ac.cput.Entity.Tables;

public class TablesFactory {
    public static Tables createTables(int tableID, boolean occupied, String reservedTable, int numSeats){
        return new Tables.Builder().setTableID(tableID)
                .setOccupied(occupied)
                .setReservedTable(reservedTable)
                .setNumSeats(numSeats)
                .build();
    }
}
