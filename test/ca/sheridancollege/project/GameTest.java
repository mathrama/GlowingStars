/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GameTest {
    
    public GameTest() {
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
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameNameGood() {
        System.out.println("getGameName Good");
        Game instance = null;
        String expResult = "gamename";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    public void testGetGameNameBad() {
        System.out.println("getGameName Bad");
        Game instance = null;
        String expResult = "" ;
        String result = instance.getGameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testGetGameNameBoundary() {
        System.out.println("getGameName Boundary");
        Game instance = null;
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayersGood() {
        System.out.println("getPlayers Good");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
     public void testGetPlayersBad() {
        System.out.println("getPlayers Bad");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
     
      public void testGetPlayersBoundary() {
        System.out.println("getPlayers Boundary");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayersGood() {
        System.out.println("setPlayers Good");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
      public void testSetPlayersBad() {
        System.out.println("setPlayers Bad");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      
        public void testSetPlayersBoundary() {
        System.out.println("setPlayers Boundary");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
     public void testPlayGood() {
        System.out.println("play Good");
        Game instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
      public void testPlayBad() {
        System.out.println("play Bad");
        Game instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      
      public void testPlayBoundary() {
        System.out.println("play Boundary");
        Game instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
      public void testDeclareWinnerGood() {
        System.out.println("declareWinner Good");
        Game instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      
        public void testDeclareWinnerBad() {
        System.out.println("declareWinner Bad");
        Game instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        
        
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner Boundary");
        Game instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }

        public void play() {
        }

        public void declareWinner() {
        }
    }
    
}
