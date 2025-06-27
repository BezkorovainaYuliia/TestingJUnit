package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void summeZero() {
        int expectedSum = 0;
        int a = 0;
        int b = 0;
        assertEquals(expectedSum, Main.summe(a, b));
    }

    @Test
    void summeKleiner() {
        int expectedSum = 2;
        int a = -2;
        int b = 4;
        assertEquals(expectedSum, Main.summe(a, b));
    }

    @Test
    void summeGroesser() {
        int expectedSum = 10;
        int a = 6;
        int b = 4;
        assertEquals(expectedSum, Main.summe(a, b));
    }

    @Test
    void summeFalseSumma() {
        int expectedSum = -10;
        int a = 6;
        int b = 4;
        assertNotEquals(expectedSum, Main.summe(a, b));
    }

    @Test
    void isEvenZero() {
        int zahl = 0;
        boolean expected = true;
        assertEquals(expected, Main.isEven(zahl));
    }

    @Test
    void isMinusEven() {
        int zahl = -4;
        boolean expected = true;
        assertEquals(expected, Main.isEven(zahl));
    }

    @Test
    void isNichtEven() {
        int zahl = 3;
        boolean expected = false;
        assertEquals(expected, Main.isEven(zahl));
    }

    @Test
    void isEvenNormal() {
        int zahl = 6;
        boolean expected = true;
        assertEquals(expected, Main.isEven(zahl));
    }

    @Test
    void multiplyByZero() {
        int zahl1 = 0;
        int zahl2 = 10;
        int expected = 0;
        assertEquals(expected, Main.multiply(zahl1, zahl2));
    }

    @Test
    void multiplyByMinus1() {
        int zahl1 = -1;
        int zahl2 = 10;
        int expected = -10;
        assertEquals(expected, Main.multiply(zahl1, zahl2));
    }

    @Test
    void multiplyByMinuses() {
        int zahl1 = -2;
        int zahl2 = -5;
        int expected = 10;
        assertEquals(expected, Main.multiply(zahl1, zahl2));
    }

    @Test
    void multiplyPositiven() {
        int zahl1 = 8;
        int zahl2 = 3;
        int expected = 24;
        assertEquals(expected, Main.multiply(zahl1, zahl2));
    }


    @Test
    void getUpperCase() {
        String beforString = "hallo";
        String afterString = "HALLO";
        assertEquals(afterString, Main.getUpperCase(beforString));
    }

    @Test
    void getUpperCaseLeer() {
        String beforString = "";
        String afterString = "";
        assertEquals(afterString, Main.getUpperCase(beforString));
    }

    @Test
    void getUpperCaseMitZahlen() {
        String beforString = "hallo123";
        String afterString = "HALLO123";
        assertEquals(afterString, Main.getUpperCase(beforString));
    }

    @Test
    void getUpperCaseNurZahlen() {
        String beforString = "147893";
        String afterString = "147893";
        assertEquals(afterString, Main.getUpperCase(beforString));
    }

    @Test
    void getUpperCaseSymbolen() {
        String beforString = "!@#$%^&*";
        String afterString = "!@#$%^&*";
        assertEquals(afterString, Main.getUpperCase(beforString));
    }

    @Test
    void getUpperCaseReturnNULL() {
        String beforString = "abc";
        assertNotNull(Main.getUpperCase(beforString));
    }

    @Test
    void isPositivZahlZero() {
        int zahl = 0;
        boolean expected = false;
        assertEquals(expected, Main.isPositivZahl(zahl));
    }

    @Test
    void isPositivZahlMinus() {
        int zahl = -2;
        boolean expected = false;
        assertEquals(expected, Main.isPositivZahl(zahl));
    }

    @Test
    void isPositivZahlPlus() {
        int zahl = 2;
        boolean expected = true;
        assertEquals(expected, Main.isPositivZahl(zahl));
    }

}