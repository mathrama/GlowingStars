/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paramjeet
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerIDGood() {
        System.out.println("getPlayerID Good");
        Player instance = null;
        String expResult = "name";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
     public void testGetPlayerIDBad() {
        System.out.println("getPlayerID Bad");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
     
      public void testGetPlayerIDBoundary() {
        System.out.println("getPlayerID Boundary");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
     public void testSetPlayerIDGood() {
        System.out.println("setPlayerID Good");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

      public void testSetPlayerIDBad() {
        System.out.println("setPlayerID Bad");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      
        public void testSetPlayerIDBoundary() {
        System.out.println("setPlayerID Boundary");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play Good");
        Player instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     public void testPlayBad() {
        System.out.println("play Bad");
        Player instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     
      public void testPlayBoundary() {
        System.out.println("play Boundary");
        Player instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        public void play() {
        }
    }
    
}
