package za.ac.cput.Factory;

import za.ac.cput.Entity.Customer;
import za.ac.cput.Util.Helper;
/*Warren Jaftha(Leader) -219005303
CustomerFactory.java
27/03/2022
 */
public class CustomerFactory {
    public static Customer createCustomer(String customerName, String customerSurname, String customerEmail, String customerCell, String customerTemperature)
    {
        //email validation...regex

        if(!Helper.isValidEmail(customerEmail))
        {
            System.out.println("Not a valid email");
            return null;
        }
        if(Helper.isNullorEmpty(customerName)||Helper.isNullorEmpty(customerSurname))
            return null;



        String personId= Helper.buyerId();
        Customer customer=new Customer.Builder().setCustomerID(personId)
                .setCustomerName(customerName)
                .setCustomerSurname(customerSurname)
                .setCustomerEmail(customerEmail)
                .setCustomerCellNumber(customerCell)
                .setCustomerTemperature(customerTemperature)
                .build();
        return customer;
    }
}
