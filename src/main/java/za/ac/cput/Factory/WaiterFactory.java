package za.ac.cput.Factory;

import za.ac.cput.Entity.Waiter;
import za.ac.cput.Util.Helper;
/*Warren Jaftha(Leader) -219005303
WaiterFactory.java
27/03/2022
 */
public class WaiterFactory {
    public static Waiter createWaiter(String waiterName, String waiterSurname, String waiterCellNumber)
    {
        String serverId= Helper.workerId();
        Waiter customer=new Waiter.Builder().setWaiterID(serverId)
                .setWaiterName(waiterName)
                .setWaiterSurname(waiterSurname)
                .setWaiterCellNumber(waiterCellNumber)
                .build();
        return customer;
    }
}
