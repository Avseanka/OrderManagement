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
public class OrderPlacement {

    public OrderPlacement() {
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
    public void testPlacement() {
        Warehouse wh = new Warehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 1, "Grisha");
        Customer c = new Customer(op, 2, "Ashot");
        op.intregistrareClient(c);
        wh.generateWarehouse();
        c.placeOrder(3, 5);
        c.placeOrder(2, 20);

        String expRez = "Order ID: 0   Client ID: 2   ProductID: 3   Quantity: 5  Status: Pending\n"
                + "Order ID: 1   Client ID: 2   ProductID: 2   Quantity: 20  Status: Pending\n";
        String rez = o.seeOrders();
        assertEquals(expRez, rez);
    }

}
