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
public class OperatorTest {

    public OperatorTest() {
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
    public void testSeeOrders() {
        System.out.println("seeOrders");
        Operator instance = null;
        String expResult = "";
        String result = instance.seeOrders();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testConfirm() {
        System.out.println("confirm");
        int id = 0;
        Operator instance = null;
        instance.confirm(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAnulare() {
        System.out.println("anulare");
        int id = 0;
        Operator instance = null;
        instance.anulare(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testValidareComenzi() {
        System.out.println("validareComenzi");
        Operator instance = null;
        instance.validareComenzi();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRestock() {
        System.out.println("restock");
        Operator instance = null;
        instance.restock();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotals() {
        System.out.println("getTotals");
        Operator instance = null;
        int expResult = 0;
        int result = instance.getTotals();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
