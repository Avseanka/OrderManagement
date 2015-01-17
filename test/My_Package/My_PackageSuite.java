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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Doru
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({My_Package.UserTest.class, My_Package.CustomerTest.class, My_Package.OrderTest.class, My_Package.ProductTest.class, My_Package.WarehouseTest.class, My_Package.HelperTest.class, My_Package.OPDeptTest.class, My_Package.OperatorTest.class})
public class My_PackageSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
