package za.ac.cput.Factory;

//Nawaaz Amien
//219099839
//Group 21

import za.ac.cput.Entity.Manager;
import za.ac.cput.Util.Helper;

public class ManagerFactory {
    public static Manager createManager(String firstName, String lastName, String address, int employee_number){
        String employeeId= Helper.managerId();
        Manager manager = new Manager.Builder().setManagerId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setEmployee_number(employee_number)
                .build();
        return manager;
    }

}
