package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryPracticeTest {



    private BinaryPractice binaryPractice;

    @Before
    public void setup(){
        binaryPractice = new BinaryPractice();
    }

    @After
    public void tearDown(){
        binaryPractice = null;
    }

    @Test
    public void solution() {
        int gaps = binaryPractice.solution(529);
        assertEquals(gaps, 4);
    }

    @Test
    public void solution1Gaps() {
        int gaps = binaryPractice.solution(9);
        assertEquals(gaps, 2);
    }
    @Test
    public void solutionNoGaps() {
        int gaps = binaryPractice.solution(15);
        assertEquals(gaps, 0);
    }
    @Test
    public void solutionMax() {
        int gaps = binaryPractice.solution(20);
        assertEquals(gaps, 1);
    }
    @Test
    public void solution5() {
        int gaps = binaryPractice.solution(1041);
        assertEquals(gaps, 5);
    }
}
