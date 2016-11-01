package com.practice;

public class Solution {

    public int solution(int[] A) {
        int arrayLength = A.length;

        for(int index = 0; index < arrayLength; index++){
            int minSum = 0;
            int maxSum = 0;

            int p = 0;
            while(p >= 0 && p<index ){
                minSum += A[p];
                p++;
            }

            p = index +1;
            while( p < arrayLength){
                maxSum += A[p];
                p++;
            }

            if(minSum == maxSum){
                return index;
            }

        }

        return -1;
    }
}
