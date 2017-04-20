/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import model.User;
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
public class UserMapperTest {
    
    public UserMapperTest() {
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
     * Test of getUserName method, of class UserMapper.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String name = "yolly";
        UserMapper instance = new UserMapper();
        User expResult = null;
        User result = instance.getUserName(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUserByPswd method, of class UserMapper.
     */
    @Test
    public void testGetUserByPswd() {
        System.out.println("getUserByPswd");
        String pswd = "indeche";
        UserMapper instance = new UserMapper();
        User expResult = null;
        User result = instance.getUserByPswd(pswd);
        assertEquals(expResult, result);
       
    }
    
}
