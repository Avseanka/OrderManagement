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
public class OrderTest {

    public OrderTest() {
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
    public void testGetProdId() {
        System.out.println("getProdId");
        Order instance = new Order(13, 2, 20);
        int expResult = 13;
        int result = instance.getProdId();
        assertEquals(expResult, result);
        Order instance2 = new Order(20, 2, 20);
        expResult = 20;
        result = instance2.getProdId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetClientId() {
        System.out.println("getClientId");
        Order instance = new Order(13, 2, 20);
        int expResult = 2;
        int result = instance.getClientId();
        assertEquals(expResult, result);

        Order instance2 = new Order(13, 2, 20);
        expResult = 2;
        result = instance2.getClientId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Order instance2 = new Order(14, 5, 64);
        int expResult = 20;
        int result = instance2.getQuantity();
        expResult = 64;
        result = instance2.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int newQuantity = 44;
        Order instance = new Order(13, 2, 20);
        instance.setQuantity(newQuantity);
        int expResult = 44;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Order instance = new Order(13, 2, 20);
        String expResult = "Pending";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        instance.anulare();
        expResult = "Anulated";
        result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testConfirm() {
        System.out.println("confirm");
        Order instance = new Order(13, 2, 20);
        instance.confirm();
        String expResult = "Confirmed";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testAnulare() {
        System.out.println("anulare");
        Order instance = new Order(13, 2, 20);
        instance.anulare();
        String expResult = "Anulated";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

}
