package za.ac.cput.Factory;

//Nawaaz Amien
//219099839
//Group 21

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

    @Test
    public void createManager(){
        Manager manager = ManagerFactory.createManager("Nawaaz","Amien","8 Rockhill Way,Retreat", 0001);
        System.out.println(manager);
        assertNotNull(manager);
    }

}
