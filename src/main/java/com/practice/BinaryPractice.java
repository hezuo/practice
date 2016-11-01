package com.practice;


import java.util.ArrayList;

public class BinaryPractice {

    public int solution(int N) {
        char[] binaryRepresentation =  Integer.toBinaryString(N).toCharArray();

        int index = 0;
        int tempZeroCounter = 0;
        int maxZeroGap = 0;
        boolean isBetweenGaps = false;
        for (char character: binaryRepresentation ) {
            boolean hasNext = (index+1) < binaryRepresentation.length;
            if(hasNext) {
                char next = binaryRepresentation[(index + 1)];
                if (!isBetweenGaps) {
                    if (character == '1' && (next == '0')) {
                        isBetweenGaps = true;
                        tempZeroCounter = 0;
                    }
                }
                if (isBetweenGaps) {
                    if (character == '0') {
                        tempZeroCounter++;
                        if (next == '1') {

                            isBetweenGaps = false;
                            if (maxZeroGap < tempZeroCounter) {
                                maxZeroGap = tempZeroCounter;
                            }
                        }
                    }
                }

            }
            index++;
        }

       return maxZeroGap;
    }
}
