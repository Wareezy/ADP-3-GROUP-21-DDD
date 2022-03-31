package za.ac.cput.Util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;
/*Warren Jaftha(Leader) -219005303
Helper.java
27/03/2022
 */
public class Helper {
    public static boolean isNullorEmpty(String s)
    {
        return (s==null || s.equals("") || s.isEmpty()||s.equalsIgnoreCase("null"));
    }
    public static boolean isValidEmail(String customerEmail)
    {
        EmailValidator ev= EmailValidator.getInstance();
        return ev.isValid(customerEmail);
    }
//Warren-219005303 Generating random ID code//
    public static String workerId()
    {
        return UUID.randomUUID().toString();
    }
    public static String buyerId()
    {
        return UUID.randomUUID().toString();
    }
    //Warren-219005303 Generating random ID code//

    //Nawaaz Generating random ID code//
    public static String managerId(){return UUID.randomUUID().toString();}
    public static String bookingId(){return UUID.randomUUID().toString();}
//Nawaaz Generating random ID code//

    public static String payment1()
    {
        return UUID.randomUUID().toString();
    }
    public static String receipt1()
    {
        return UUID.randomUUID().toString();
    }

}
