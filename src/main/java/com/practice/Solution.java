package com.practice;

public class Solution {

    public int solution(int[] A) {
        int arrayLength = A.length -1;

        for(int index = 0; index < arrayLength; index++){
            int minSum = 0;
            int maxSum = 0;

            for( int indexDes = arrayLength; indexDes >=0; indexDes--){

                if(indexDes>index){
                    maxSum += A[indexDes];
                }
                if((arrayLength -indexDes)< index){
                    minSum += A[arrayLength-indexDes];
                }

            }
            if(minSum == maxSum){
                return index;
            }

        }

        return -1;
    }
}
