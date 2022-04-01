package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static String tableID(){
        return UUID.randomUUID().toString();
    }
}
