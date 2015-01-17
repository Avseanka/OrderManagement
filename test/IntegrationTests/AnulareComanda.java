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
public class AnulareComanda {

    public AnulareComanda() {
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
    public void testAnulare() {
        Warehouse wh = new Warehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 1, "Grisha");
        Customer c = new Customer(op, 2, "Ashot");
        op.intregistrareClient(c);
        wh.generateWarehouse();
        c.placeOrder(3, 5);
        c.placeOrder(2, 20);
        c.anulateOrder(3);  // Prima comanda se anuleaza pentru ca nu a fost confirmata
        o.validareComenzi();
        c.anulateOrder(2);  //A doua comanda este confirmata si nu se mai poate anula.

        String expRez = "3   Mouse  5   Anulated\n"
                + "2   Cooler  20   Confirmed\n";
        String rez = c.seeClientOrders();
        assertEquals(expRez, rez);
    }

}
