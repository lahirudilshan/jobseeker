/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import Domain.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahesh
 */
public class DBServiceTest {
    
    public DBServiceTest() {
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
     * Test of hello method, of class DBService.
     */
    @Test
    public void testHello() {
        System.out.println("hello");
        String txt = "";
        DBService instance = new DBService();
        String expResult = "";
        String result = instance.hello(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class DBService.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User newUser = null;
        DBService instance = new DBService();
        Boolean expResult = null;
        Boolean result = instance.createUser(newUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class DBService.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User userDetails = null;
        DBService instance = new DBService();
        Boolean expResult = null;
        Boolean result = instance.updateUser(userDetails);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class DBService.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int userId = 0;
        DBService instance = new DBService();
        Boolean expResult = null;
        Boolean result = instance.deleteUser(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchUserById method, of class DBService.
     */
    @Test
    public void testSearchUserById() {
        System.out.println("searchUserById");
        int userId = 0;
        DBService instance = new DBService();
        User expResult = null;
        User result = instance.searchUserById(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class DBService.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        DBService instance = new DBService();
        List expResult = null;
        List result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of usersSearchByRoleId method, of class DBService.
     */
    @Test
    public void testUsersSearchByRoleId() {
        System.out.println("usersSearchByRoleId");
        int roleId = 0;
        DBService instance = new DBService();
        List expResult = null;
        List result = instance.usersSearchByRoleId(roleId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
