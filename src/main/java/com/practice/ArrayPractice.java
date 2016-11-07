package com.practice;

public class ArrayPractice {
    public int solution(int[] A) {

        int arrayLength = A.length;
        for (int index = 0; index < arrayLength; index++){
            boolean isNotPaired = true;
            for (int innerIndex = arrayLength-1; innerIndex >= 0; innerIndex--){
                if(index != innerIndex){
                    if((isNotPaired && innerIndex >= 0) && A[index] == A[innerIndex]){
                        isNotPaired = false;
                        break;
                    }
                }
            }
            if( isNotPaired){
                return A[index];
            }

        }

        return -1;
    }
}
