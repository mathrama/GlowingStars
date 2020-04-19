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
public class SpotItPlayerTest {
    
    public SpotItPlayerTest() {
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
     * Test of getCardCount method, of class SpotItPlayer.
     */
    @Test
    public void testGetCardCountGood() {
        System.out.println("getCardCount Good");
        SpotItPlayer instance = null;
        int expResult = 0;
        int result = instance.getCardCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testGetCardCountBad() {
        System.out.println("getCardCount Bad");
        SpotItPlayer instance = null;
        int expResult = 0;
        int result = instance.getCardCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testGetCardCountBoundary() {
        System.out.println("getCardCountBoundary");
        SpotItPlayer instance = null;
        int expResult = 0;
        int result = instance.getCardCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class SpotItPlayer.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        GroupOfCards card = null;
        SpotItPlayer instance = null;
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurentCard method, of class SpotItPlayer.
     */
    @Test
    public void testSetCurentCardGood() {
        System.out.println("setCurentCard Good");
        Card card = null;
        SpotItPlayer instance = null;
        instance.setCurentCard(card);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     public void testSetCurentCardBad() {
        System.out.println("setCurentCard Bad");
        Card card = null;
        SpotItPlayer instance = null;
        instance.setCurentCard(card);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     
      public void testSetCurentCardBoundary() {
        System.out.println("setCurentCard Boundary");
        Card card = null;
        SpotItPlayer instance = null;
        instance.setCurentCard(card);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayCard method, of class SpotItPlayer.
     */
    @Test
    public void testGetDisplayCardGood() {
        System.out.println("getDisplayCard Good");
        SpotItPlayer instance = null;
        Card expResult = null;
        Card result = instance.getDisplayCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     public void testGetDisplayCardBad() {
        System.out.println("getDisplayCard Bad");
        SpotItPlayer instance = null;
        Card expResult = null;
        Card result = instance.getDisplayCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      public void testGetDisplayCardBoundary() {
        System.out.println("getDisplayCard Boundary");
        SpotItPlayer instance = null;
        Card expResult = null;
        Card result = instance.getDisplayCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class SpotItPlayer.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play Good");
        SpotItPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
      public void testPlayBad() {
        System.out.println("play Bad");
        SpotItPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      
        public void testPlayBoundary() {
        System.out.println("play Boundary");
        SpotItPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
