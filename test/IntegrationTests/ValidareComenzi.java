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
public class ValidareComenzi {

    public ValidareComenzi() {
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
    public void testValidare() {
        Warehouse wh = new Warehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 1, "Grisha");
        Customer c = new Customer(op, 2, "Ashot");
        op.intregistrareClient(c);
        wh.generateWarehouse();
        c.placeOrder(3, 5);
        c.placeOrder(2, 900);
        c.placeOrder(90, 13); // 90 din 7

        String expRez = "Order ID: 0   Client ID: 2   ProductID: 3   Quantity: 5  Status: Pending\n"
                + "Order ID: 1   Client ID: 2   ProductID: 2   Quantity: 900  Status: Pending\n"
                + "Order ID: 2   Client ID: 2   ProductID: 90   Quantity: 13  Status: Pending\n";
        String rez = o.seeOrders();
        assertEquals(expRez, rez);

        o.validareComenzi();

        expRez = "Order ID: 0   Client ID: 2   ProductID: 3   Quantity: 5  Status: Confirmed\n"
                + "Order ID: 1   Client ID: 2   ProductID: 2   Quantity: 900  Status: Anulated\n"
                + "Order ID: 2   Client ID: 2   ProductID: 90   Quantity: 13  Status: Anulated\n";
        rez = o.seeOrders();
        assertEquals(expRez, rez);

    }
}
