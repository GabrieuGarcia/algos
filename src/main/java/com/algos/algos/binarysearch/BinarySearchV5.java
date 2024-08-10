package com.algos.algos.binarysearch;

public class BinarySearchV5 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numberToFind = 9;

       int position = binarySearch(array, numberToFind);
        System.out.println(position);
    }

    private static int binarySearch(int[] array, int numberToFind){
        int lowPointer = 0;
        int highPointer = array.length -1;

        while(lowPointer <= highPointer){
            int middlePosition = (lowPointer + highPointer) / 2;
            int numberValue = array[middlePosition];

            if(numberToFind == numberValue){
                return middlePosition;
            }

            if(numberToFind < numberValue){
                highPointer = middlePosition - 1;
            }

            if(numberToFind > numberValue){
                lowPointer = middlePosition + 1;
            }
        }
        return -1;
    }

}
