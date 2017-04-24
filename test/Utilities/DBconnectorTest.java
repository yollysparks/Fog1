/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felesiah
 */
public class DBconnectorTest {
    
    public DBconnectorTest() {
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

    /**
     * Test of getConnector method, of class DBconnector.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetConnector() throws Exception {
        System.out.println("getConnector");
        Connection expResult = null;
        Connection result = DBconnector.getConnector();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getConnection method, of class DBconnector.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DBconnector instance = new DBconnector();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of close method, of class DBconnector.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        DBconnector instance = new DBconnector();
        instance.close(stmt, rs, conn);
       
    }
    
}
