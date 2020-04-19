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
public class SpotItGameTest {
    
    public SpotItGameTest() {
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
     * Test of play method, of class SpotItGame.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play Good");
        SpotItGame instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     public void testPlayBad() {
        System.out.println("play Bad");
        SpotItGame instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      public void testPlayBoundary() {
        System.out.println("play Boundary");
        SpotItGame instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class SpotItGame.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCard Good");
        SpotItGame instance = null;
        Card expResult = null;
        Card result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     public void testGetCardBad() {
        System.out.println("getCard Bad");
        SpotItGame instance = null;
        Card expResult = null;
        Card result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      public void testGetCardBoundary() {
        System.out.println("getCard Boundary");
        SpotItGame instance = null;
        Card expResult = null;
        Card result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class SpotItGame.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner Good");
        SpotItGame instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     public void testDeclareWinnerBad() {
        System.out.println("declareWinner Bad");
        SpotItGame instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner Boundary");
        SpotItGame instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
