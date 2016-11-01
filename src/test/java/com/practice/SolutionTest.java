package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @After
    public void tearDown(){
        solution = null;
    }

    @Test
    public void solution() {
       int[] input = { -1, 3, -4, 5, 1, -6, 2, 1};
        int num = solution.solution(input);
        assertEquals(num, 1);
    }
    @Test
    public void solutionMax() {
       int[] input = { -2147483648, -1, 3, -4, 5, 1, -6, 2, 1,2147483647, 1};
        int num = solution.solution(input);
        assertEquals(num, 2);
    }
}
