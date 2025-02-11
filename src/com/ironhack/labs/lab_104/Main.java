package com.ironhack.labs.lab_104;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // TASK ONE
        int difference = 0;
        int[] sampleArray = {1,8,5,4,9,-12,34,21,0,3,4,65};
        difference = returnDifference(sampleArray);
        System.out.println("The difference between the largest and smallest value of the Array is: " + difference);

        // TASK TWO
        printTwoSmallest(sampleArray);

        // TASK THREE
        int x = 25;
        int y = 13;
        double res = 0;
        res = calculateMathematicalExpression(x,y);
        System.out.println("The result of the Mathematical Expression when x="+x+" and y="+y+" is equal to: "+res);

    }

    private static double calculateMathematicalExpression(int x, int y) {
        double res = 0;
        res = Math.pow(x,2)+Math.pow((4*(double)y/5) - (double)x,2);
        return res;
    }

    private static void printTwoSmallest(int[] sampleArray) {
        int min1 = sampleArray[0];
        int min2 = sampleArray[1];
        //MODO LOOP
        for (int i = 0; i < sampleArray.length; i++) {
            if(sampleArray[i]<min1){ // SMALLER THAN THE SMALLEST, MUST SHIFT BOTH
                min2 = min1;
                min1 = sampleArray[i];
            }else if(sampleArray[i]<min2){ // SMALLER THAN SECOND SMALLEST, JUST SWITCH
                min2 = sampleArray[i];
            }
        }

        /*MODO SORT
        Arrays.sort(sampleArray);
        min1 = sampleArray[0];
        min2 = sampleArray[1];
        */
        System.out.println("The smallest element is: "+ min1 +" and the second smallest element is: "+ min2);

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
