/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.dispense.labojava;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gatien
 */
public class DispenseJavaIsibTest {
    
    public DispenseJavaIsibTest() {
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


    @Test
    public void testSmallestDivisor_0()
    {
        int nb = 0;
        
        int expected = 0;
        int result = DispenseJavaIsib.smallestDivisor(nb);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testSmallestDivisor_1()
    {
        int nb = 1;
        
        int expected = 1;
        int result = DispenseJavaIsib.smallestDivisor(nb);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testSmallestDivisor_2()
    {
        int nb = 36;
        
        int expected = 2;
        int result = DispenseJavaIsib.smallestDivisor(nb);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testSmallestDivisor_3()
    {
        int nb = -36;
        
        int expected = 2;
        int result = DispenseJavaIsib.smallestDivisor(nb);
        
        assertEquals(expected, result);
    }
    
    @Test(expected = java.lang.ArithmeticException.class)
    public void testPower_0()
    {
        int nb = 0;
        
        ArrayList list = DispenseJavaIsib.allDivisors(nb);
        
        HashMap expected = new HashMap();
        
        HashMap result = DispenseJavaIsib.powers(list);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testPower_1()
    {
        int nb = 1;
        
        ArrayList list = DispenseJavaIsib.allDivisors(nb);
        
        HashMap expected = new HashMap();
        expected.put(1,1);
        
        HashMap result = DispenseJavaIsib.powers(list);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testPower_2()
    {
        int nb = 36;
        
        ArrayList list = DispenseJavaIsib.allDivisors(nb);
        
        HashMap expected = new HashMap();
        expected.put(1,1);
        expected.put(2,2);
        expected.put(3,2);
        
        HashMap result = DispenseJavaIsib.powers(list);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testPower_3()
    {
        int nb = -36;
        
        ArrayList list = DispenseJavaIsib.allDivisors(nb);
        
        HashMap expected = new HashMap();
        expected.put(1,1);
        expected.put(2,2);
        expected.put(3,2);
        
        HashMap result = DispenseJavaIsib.powers(list);
        
        assertEquals(expected, result);
    }
}
