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
public class WarehouseTest {

    public WarehouseTest() {
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
    public void testGenerateWarehouse() {
        System.out.println("generateWarehouse");
        Warehouse instance = new Warehouse();
        instance.generateWarehouse();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Warehouse instance = new Warehouse();
        String expResult = "";
        String result = instance.getStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testOrderConfirmed() {
        System.out.println("orderConfirmed");
        int quantity = 0;
        int id = 0;
        Warehouse instance = new Warehouse();
        instance.orderConfirmed(quantity, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testViewDetails() {
        System.out.println("viewDetails");
        int id = 0;
        Warehouse instance = new Warehouse();
        String expResult = "";
        String result = instance.viewDetails(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int produs = 0;
        Warehouse instance = new Warehouse();
        int expResult = 0;
        int result = instance.getQuantity(produs);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        int produs = 0;
        Warehouse instance = new Warehouse();
        int expResult = 0;
        int result = instance.getPrice(produs);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWhSize() {
        System.out.println("getWhSize");
        Warehouse instance = new Warehouse();
        int expResult = 0;
        int result = instance.getWhSize();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product p = null;
        Warehouse instance = new Warehouse();
        instance.addProduct(p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        int id = 0;
        Warehouse instance = new Warehouse();
        Product expResult = null;
        Product result = instance.getProduct(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetInitialQuantity() {
        System.out.println("getInitialQuantity");
        int produs = 0;
        Warehouse instance = new Warehouse();
        int expResult = 0;
        int result = instance.getInitialQuantity(produs);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        int produs = 0;
        Warehouse instance = new Warehouse();
        String expResult = "";
        String result = instance.getProductName(produs);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int produs = 0;
        int quantity = 0;
        Warehouse instance = new Warehouse();
        instance.setQuantity(produs, quantity);
        fail("The test case is a prototype.");
    }

}
