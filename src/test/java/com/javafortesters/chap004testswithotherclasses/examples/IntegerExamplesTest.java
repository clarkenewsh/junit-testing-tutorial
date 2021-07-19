package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration() {

        Integer four = new Integer(4);

        // Add a new statement which asserts that intValue returns an int with the value 4.
        assertEquals("intValue return int 4", 4, four.intValue());


    }
}
