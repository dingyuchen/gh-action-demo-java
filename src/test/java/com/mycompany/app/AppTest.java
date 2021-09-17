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
        assertTrue(App.isOdd(2));
        assertFalse(App.isOdd(3));
    }
}
