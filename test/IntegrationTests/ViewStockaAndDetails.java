/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegrationTests;

import My_Package.Customer;
import My_Package.OPDept;
import My_Package.Operator;
import My_Package.Warehouse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Doru
 */
public class ViewStockaAndDetails {

    public ViewStockaAndDetails() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testViewStock() {
        Warehouse wh = new Warehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 1, "Grisha");
        Customer c = new Customer(op, 2, "Ashot");
        op.intregistrareClient(c);
        wh.generateWarehouse();
        c.placeOrder(3, 5);
        c.placeOrder(2, 20);

        String expRez = "0. Laptop\n"
                + "1. Tastatura\n"
                + "2. Cooler\n"
                + "3. Mouse\n"
                + "4. Boxe\n"
                + "5. MasaPC\n"
                + "6. Stationar\n";

        String rez = o.viewStock();
        assertEquals(expRez, rez);

        expRez = "Produs: Mouse   Price: 18   Quantity: 600"
                + "Produs: Cooler   Price: 50   Quantity: 300";

        rez = c.viewDetails(3) + c.viewDetails(2);
        assertEquals(expRez, rez);
    }

}
