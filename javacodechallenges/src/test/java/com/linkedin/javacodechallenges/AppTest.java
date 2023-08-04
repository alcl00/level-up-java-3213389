package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // Tests for code challenge 1 isEven()
    @Test
    public void isEven_true() {
        assertTrue(App.isEven(0));
        assertTrue(App.isEven(2));
        assertTrue(App.isEven(4));
        assertTrue(App.isEven(6));
        assertTrue(App.isEven(8));
        assertTrue(App.isEven(-20));
        assertTrue(App.isEven(100));
        assertTrue(App.isEven(-46));
    }

    @Test
    public void isEven_false() {
        assertFalse(App.isEven(1));
        assertFalse(App.isEven(3));
        assertFalse(App.isEven(5));
        assertFalse(App.isEven(7));
        assertFalse(App.isEven(9));
        assertFalse(App.isEven(-11));
        assertFalse(App.isEven(93));
        assertFalse(App.isEven(-75));
    }

    // Tests for code challenge 2 password complexity
    @Test
    public void isPasswordComplex_true() {
        assertTrue(App.isPasswordComplex("Happy12"));
        assertTrue(App.isPasswordComplex("1SarahL ength"));
        assertTrue(App.isPasswordComplex("Password12"));
        assertTrue(App.isPasswordComplex("2PassW@ord1"));
        assertTrue(App.isPasswordComplex("01Sall#y9"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(App.isPasswordComplex("12aB "));
        assertFalse(App.isPasswordComplex("Ab112"));
        assertFalse(App.isPasswordComplex("happy"));
        assertFalse(App.isPasswordComplex("happy_1"));
        assertFalse(App.isPasswordComplex("p assword12"));
        assertFalse(App.isPasswordComplex("Sur18"));
        assertFalse(App.isPasswordComplex(""));
    }
}
