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
public class OPDeptTest {

    public OPDeptTest() {
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
        System.out.println("viewStock");
        OPDept instance = null;
        String expResult = "";
        String result = instance.viewStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        Order ord = null;
        OPDept instance = null;
        instance.placeOrder(ord);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSeeOrders() {
        System.out.println("seeOrders");
        OPDept instance = null;
        String expResult = "";
        String result = instance.seeOrders();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testOrderConfirmed() {
        System.out.println("orderConfirmed");
        int id = 0;
        OPDept instance = null;
        instance.orderConfirmed(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAnulare() {
        System.out.println("anulare");
        int id = 0;
        OPDept instance = null;
        instance.anulare(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testViewDetails() {
        System.out.println("viewDetails");
        int id = 0;
        OPDept instance = null;
        String expResult = "";
        String result = instance.viewDetails(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int i = 0;
        OPDept instance = null;
        Order expResult = null;
        Order result = instance.getOrder(i);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSize() {
        System.out.println("getSize");
        OPDept instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int produs = 0;
        OPDept instance = null;
        int expResult = 0;
        int result = instance.getQuantity(produs);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWhSize() {
        System.out.println("getWhSize");
        OPDept instance = null;
        int expResult = 0;
        int result = instance.getWhSize();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWh() {
        System.out.println("getWh");
        OPDept instance = null;
        Warehouse expResult = null;
        Warehouse result = instance.getWh();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAnulateOrder() {
        System.out.println("anulateOrder");
        int id = 0;
        int prodId = 0;
        OPDept instance = null;
        instance.anulateOrder(id, prodId);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModifyOrder() {
        System.out.println("modifyOrder");
        int id = 0;
        int prodId = 0;
        int quantity = 0;
        OPDept instance = null;
        instance.modifyOrder(id, prodId, quantity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIntregistrareClient() {
        System.out.println("intregistrareClient");
        Customer c = null;
        OPDept instance = null;
        instance.intregistrareClient(c);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSeeClientOrders() {
        System.out.println("seeClientOrders");
        int id = 0;
        OPDept instance = null;
        String expResult = "";
        String result = instance.seeClientOrders(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
