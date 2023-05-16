/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

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
public class CircularDoublyLinkedListTest {
    
    public CircularDoublyLinkedListTest() {
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
     * Test of isEmpty method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserAtFirst method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testInserAtFirst() {
        System.out.println("inserAtFirst");
        Object data = null;
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.inserAtFirst(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAtEnd method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testInsertAtEnd() {
        System.out.println("insertAtEnd");
        Object data = null;
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.insertAtEnd(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromTailToHead method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testFromTailToHead() {
        System.out.println("fromTailToHead");
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.fromTailToHead();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteByKey method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testDeleteByKey() {
        System.out.println("deleteByKey");
        Object key = null;
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.deleteByKey(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAtFirst method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testDeleteAtFirst() {
        System.out.println("deleteAtFirst");
        CircularDoublyLinkedList instance = new CircularDoublyLinkedList();
        instance.deleteAtFirst();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
