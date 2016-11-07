package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayPracticeTest {

    private ArrayPractice arrayPractice;

    @Before
    public void setup(){
        arrayPractice = new ArrayPractice();
    }

    @After
    public void tearDown(){
        arrayPractice = null;
    }

    @Test
    public void solution(){
        int[] inputArray = {9, 3, 9, 3, 9, 7, 9 };
        int result = arrayPractice.solution(inputArray);
        assertEquals(7, result);
    }
}