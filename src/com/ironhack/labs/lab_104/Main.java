package com.ironhack.labs.lab_104;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // TASK ONE
        int difference = 0;
        int[] sampleArray = {1,8,5,4,9,-12,34,21,1,3,4,65};
        difference = returnDifference(sampleArray);
        System.out.println("The difference between the largest and smallest value of the Array is: ");
        System.out.print(difference);

    }

    private static int returnDifference(int[] sampleArray) {
        int result=0;
        // MODO LOOP
        int max = sampleArray[0];
        int min = sampleArray[0];
        for (int i = 0; i < sampleArray.length; i++) {
            if(sampleArray[i]<min){
                min = sampleArray[i];
            }
            if(sampleArray[i]>max){
                max = sampleArray[i];
            }
        }
        result = max - min;
        return result;
         /* MODO SORT
        Arrays.sort(sampleArray);
        result = sampleArray[sampleArray.length-1] - sampleArray[0];
        return result;
         */
    }
}
