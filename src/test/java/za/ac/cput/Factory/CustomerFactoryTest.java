package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Customer;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha(Leader) -219005303
CustomerFactoryTest.java
27/03/2022
 */
class CustomerFactoryTest {
    @Test
    void createCustomer()
    {
        Customer customer=CustomerFactory.createCustomer("Warren","Jaftha","warrenjaftha16@gmail.com","0618620283","28 degrees celsius");
        System.out.println(customer);
        assertNotNull(customer);
    }
}