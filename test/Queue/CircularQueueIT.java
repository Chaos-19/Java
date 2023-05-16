/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAEDC
 */
public class CircularQueueIT {
    
    public CircularQueueIT() {
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
     * Test of enqueue method, of class CircularQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object data = null;
        CircularQueue instance = new CircularQueue();
        instance.enqueue(data);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class CircularQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        CircularQueue instance = new CircularQueue();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class CircularQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        CircularQueue instance = new CircularQueue();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class CircularQueue.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        CircularQueue instance = new CircularQueue();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
