package com.practice;


import java.util.ArrayList;
import java.util.List;

public class BaseChanger {

    public int[] changeBase(int input, int base){
        List<Integer> numbers = new ArrayList<Integer>();
        int remainder = 0;
        int temp2 = input;

        while(temp2 != 0){
            remainder = temp2 % base;
            temp2 = (int)temp2 / base;

            if (remainder < 0)
            {
                remainder += base;
                temp2 += base-1;
            }
            numbers.add(remainder);
        }

        int[] tempArray = new int[numbers.size()];
        int index=1;
        for(Integer p: numbers){
            tempArray[numbers.size()-index] = (int)p;
            index++;
        }

        return tempArray;
    }
}
