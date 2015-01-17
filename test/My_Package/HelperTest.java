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
public class HelperTest {

    public HelperTest() {
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
    public void testUnderStock() {
        System.out.println("underStock");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        wh.setQuantity(3, 50);
        wh.setQuantity(2, 280);
        String expResult = "Mouse\n";
        String result = Helper.underStock(wh);
        assertEquals(expResult, result);
    }

    @Test
    public void testOverStock() {
        System.out.println("overStock");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        wh.setQuantity(2, 30);
        wh.setQuantity(3, 50);
        wh.setQuantity(0, 3);
        wh.setQuantity(1, 5);
        wh.setQuantity(4, 5);
        wh.setQuantity(5, 45);
        wh.setQuantity(6, 75);
        String expResult = "MasaPC\nStationar\n";
        String result = Helper.overStock(wh);
        assertEquals(expResult, result);
    }

    @Test
    public void testPriceFilter() {
        System.out.println("priceFilter");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        int min = 250;
        int max = 450;
        String expResult = "Tastatura\nBoxe\n";
        String result = Helper.priceFilter(wh, min, max);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuantityFilter() {
        System.out.println("quantityFilter");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        int min = 250;
        int max = 650;
        String expResult = "Cooler\nMouse\n";
        String result = Helper.quantityFilter(wh, min, max);
        assertEquals(expResult, result);
        wh.setQuantity(3, 651);
        expResult = "Cooler\n";
        result = Helper.quantityFilter(wh, min, max);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotals() {
        System.out.println("totals");
        Warehouse wh = new Warehouse();
        wh.generateWarehouse();
        int expResult = 1283;
        int result = Helper.totals(wh);
        assertEquals(expResult, result);
        wh.setQuantity(3, 500);
        expResult = 1183;
        result = Helper.totals(wh);
        assertEquals(expResult, result);
    }

}
