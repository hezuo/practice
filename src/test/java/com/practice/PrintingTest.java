package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PrintingTest {
    private Printing printing;

    @Before
    public void setup(){
        printing = new Printing();
    }
    @After
    public void tearDown(){
        printing = null;
    }

    @Test
    public void printTree(){
        String expectedResult = "* * * * * * *\n" +
                                "  * * * * *\n" +
                                "    * * *\n" +
                                "      *";
        String result = printing.printCentered(4);

        assertEquals(expectedResult, result);
    }

}