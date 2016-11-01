package com.practice;

public class Solution {

    public int solution(int[] A) {
        int arrayLength = A.length;

        for(int index = 0; index < arrayLength; index++){
            int minSum = 0;
            int maxSum = 0;

            int p = 0;
            while( p < arrayLength){
                if( p < index){
                    minSum += A[p];
                }

                if(p > index){
                    maxSum += A[p];
                }

                p++;
            }


            if(minSum == maxSum){
                return index;
            }

        }

        return -1;
    }
}
