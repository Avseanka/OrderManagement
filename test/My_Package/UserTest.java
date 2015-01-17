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
public class UserTest {

    public UserTest() {
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
        User instance = null;
        String expResult = "";
        String result = instance.viewStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testViewDetails() {
        System.out.println("viewDetails");
        int id = 0;
        User instance = null;
        String expResult = "";
        String result = instance.viewDetails(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
