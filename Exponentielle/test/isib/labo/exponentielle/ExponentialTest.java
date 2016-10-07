/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.labo.exponentielle;

import java.math.BigDecimal;
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
public class ExponentialTest {

    public ExponentialTest() {
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
    public void testFactorielle_0() {
        int nb = 0;

        BigDecimal expResult = BigDecimal.valueOf(1);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_1() {
        int nb = 1;

        BigDecimal expResult = BigDecimal.valueOf(1);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_2() {
        int nb = 2;

        BigDecimal expResult = BigDecimal.valueOf(2);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_3() {
        int nb = 3;

        BigDecimal expResult = BigDecimal.valueOf(6);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_4() {
        int nb = 4;

        BigDecimal expResult = BigDecimal.valueOf(24);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_5() {
        int nb = 5;

        BigDecimal expResult = BigDecimal.valueOf(120);
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_6() {
        int nb = 14;

        BigDecimal expResult = new BigDecimal("87178291200");
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_7() {
        int nb = 20;

        BigDecimal expResult = new BigDecimal("2432902008176640000");
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testFactorielle_8() {
        int nb = -6;

        BigDecimal expResult = new BigDecimal("-720");
        BigDecimal result = Exponential.factorial(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testExponential_0() {
        int nb = 0;

        BigDecimal expResult = new BigDecimal("1.0000000000");
        BigDecimal result = Exponential.exponential(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testExponential_1() {
        int nb = 1;

        BigDecimal expResult = new BigDecimal("2.7182818286");
        BigDecimal result = Exponential.exponential(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testExponential_2() {
        int nb = 6;

        BigDecimal expResult = new BigDecimal("403.4287934925");
        BigDecimal result = Exponential.exponential(nb);

        assertEquals(expResult, result);
    }

    @Test
    public void testExponential_3() {
        int nb = -1;

        BigDecimal expResult = new BigDecimal("0.3678794412");
        BigDecimal result = Exponential.exponential(nb);

        assertEquals(expResult, result);
    }
}
