package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isEvenTest() {
        assertTrue(App.isEven(2));
        assertFalse(App.isEven(3));
    }

    @Test
    public void isOddTest() {
        assertFalse(App.isOdd(2));
        assertTrue(App.isOdd(3));
    }
}
