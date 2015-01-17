/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Package;

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
public class CustomerTest {

    public CustomerTest() {
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
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 4, "Grisa");
        int id = 2;
        int quantity = 20;
        Customer instance = new Customer(op, 2, "Ashot");
        instance.placeOrder(id, quantity);
        op.getOrder(0);
        String expResult = "Order ID: 0   Client ID: 2   ProductID: 2   Quantity: 20  Status: Pending\n";
        String result = o.seeOrders();
        assertEquals(expResult, result);
    }

    @Test
    public void testAnulateOrder() {
        System.out.println("anulateOrder");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 4, "Grisa");
        int orderId = 0;
        Customer instance = new Customer(op, 2, "Ashot");
        instance.placeOrder(3, 14);
        instance.placeOrder(2, 20);
        instance.placeOrder(4, 15);
        instance.anulateOrder(2);
        String expResult = "Order ID: 0   Client ID: 2   ProductID: 3   Quantity: 14  Status: Pending\n"
                + "Order ID: 1   Client ID: 2   ProductID: 2   Quantity: 20  Status: Anulated\n"
                + "Order ID: 2   Client ID: 2   ProductID: 4   Quantity: 15  Status: Pending\n";
        String result = o.seeOrders();
        assertEquals(expResult, result);
    }

    @Test
    public void testModifyOrder() {
        System.out.println("modifyOrder");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Operator o = new Operator(op, 4, "Grisa");
        Customer instance = new Customer(op, 2, "Ashot");
        instance.placeOrder(3, 14);
        instance.placeOrder(2, 20);
        instance.placeOrder(4, 15);
        int orderId = 2;
        int quantity = 30;
        instance.modifyOrder(orderId, quantity);
        String expResult = "Order ID: 0   Client ID: 2   ProductID: 3   Quantity: 14  Status: Pending\n"
                + "Order ID: 1   Client ID: 2   ProductID: 2   Quantity: 30  Status: Pending\n"
                + "Order ID: 2   Client ID: 2   ProductID: 4   Quantity: 15  Status: Pending\n";
        String result = o.seeOrders();
        assertEquals(expResult, result);
    }

    @Test
    public void testBuy() {
        System.out.println("buy");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Product p = new Product("Avion", 123, 222);
        Customer instance = new Customer(op, 2, "Ashot");
        instance.buy(p);
        String expResult = "Avion\n";
        String result = instance.propduseCumparate();
        assertEquals(expResult, result);
    }

    @Test
    public void testPropduseCumparate() {
        System.out.println("propduseCumparate");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Product p = new Product("Avion", 123, 222);
        Product p1 = new Product("Maserati", 166, 666);
        Product p2 = new Product("Crystal", 55, 23);
        Customer instance = new Customer(op, 2, "Ashot");
        instance.buy(p);
        instance.buy(p1);
        instance.buy(p2);
        String expResult = "Avion\n" + "Maserati\n" + "Crystal\n";
        String result = instance.propduseCumparate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = new Customer(null, 2, "Ashot");
        int expResult = 2;
        int result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSeeClientOrders() {
        System.out.println("seeClientOrders");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        OPDept op = new OPDept(wh);
        Customer instance = new Customer(op, 2, "Ashot");
        Customer instance2 = new Customer(op, 12, "Anton");
        instance.placeOrder(4, 66);
        instance.placeOrder(1, 26);
        instance2.placeOrder(1, 6);
        instance2.placeOrder(2, 16);

        String expResult = "1   Tastatura  6   Pending\n"
                + "2   Cooler  16   Pending\n";
        String result = instance2.seeClientOrders();
        assertEquals(expResult, result);
    }

}
