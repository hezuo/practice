package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;


public class BaseChangerTest {
    @Test
    public void changeBase() throws Exception {
        int input = 343;
        BaseChanger baseChanger = new BaseChanger();
        int[] expected = {1, 0, 1, 0, 1, 0, 1, 1, 1};
        assertArrayEquals(expected, baseChanger.changeBase(input, 2));
    }

}