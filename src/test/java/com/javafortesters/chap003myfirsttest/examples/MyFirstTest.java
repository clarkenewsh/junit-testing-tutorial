package com.javafortesters.chap003myfirsttest.examples;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Tutorial on creating a JUnit Test
public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {

        int answer = 2+2;

        assertEquals("2+2=4", 4, answer);

    }

    //    Exercises - chapter 3
    @Test
    public void canMinusTwoMinusTwo() {
        int answer = 2-2;

        assertEquals("2-2=0", 0, answer);
    }

    //    Exercises - chapter 3
    @Test
    public void canDivideTwoNumbers() {
        int answer = 4/2;

        assertEquals("4/2=2", 2, answer);
    }

    //    Exercises - chapter 3
    @Test
    public void canMultiplyTwoNumbers() {
        int answer = 2*2;

        assertEquals("2*2=4", 4, answer);
    }
}
