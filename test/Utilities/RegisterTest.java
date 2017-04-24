/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class RegisterTest {
    
    public RegisterTest() {
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
     * Test of processRequest method, of class Register.
     * @throws java.lang.Exception
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Register instance = new Register();
        instance.processRequest(request, response);
      
    }

    /**
     * Test of doGet method, of class Register.
     * @throws java.lang.Exception
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Register instance = new Register();
        instance.doGet(request, response);
       
    }

    /**
     * Test of doPost method, of class Register.
     * @throws java.lang.Exception
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Register instance = new Register();
        instance.doPost(request, response);
       
    }

    /**
     * Test of getServletInfo method, of class Register.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        
    }
    
}
