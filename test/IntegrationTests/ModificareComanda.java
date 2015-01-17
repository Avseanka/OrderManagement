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
public class ModificareComanda {

    public ModificareComanda() {
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
    public void modificareAnulare() {
        Warehouse wh = new Warehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 1, "Grisha");
        Customer c = new Customer(op, 2, "Ashot");
        op.intregistrareClient(c);
        wh.generateWarehouse();
        c.placeOrder(3, 5);
        c.placeOrder(2, 20);
        c.modifyOrder(3, 10);
        c.modifyOrder(2, 25);

        String expRez = "3   Mouse  10   Pending\n"
                + "2   Cooler  25   Pending\n";
        String rez = c.seeClientOrders();
        assertEquals(expRez, rez);
    }

}
