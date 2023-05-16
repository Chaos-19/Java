/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack.Projects;

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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDigit method, of class Calculator.
     */
    @Test
    public void testIsDigit() {
        System.out.println("isDigit");
        String in = "";
        Calculator instance = new Calculator();
        boolean expResult = false;
        boolean result = instance.isDigit(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of precedence method, of class Calculator.
     */
    @Test
    public void testPrecedence() {
        System.out.println("precedence");
        String opra = "";
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.precedence(opra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of infinixToPostfixConverter method, of class Calculator.
     */
    @Test
    public void testInfinixToPostfixConverter() {
        System.out.println("infinixToPostfixConverter");
        String infinxExpression = "";
        Calculator instance = new Calculator();
        String[] expResult = null;
        String[] result = instance.infinixToPostfixConverter(infinxExpression);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of postfixCalculator method, of class Calculator.
     */
    @Test
    public void testPostfixCalculator() {
        System.out.println("postfixCalculator");
        String[] postfixExpression = null;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.postfixCalculator(postfixExpression);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
