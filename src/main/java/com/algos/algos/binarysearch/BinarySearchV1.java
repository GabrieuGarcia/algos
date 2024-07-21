package com.algos.algos.binarysearch;

public class BinarySearchV1 {

    public static void main(String[] args) {
        int[] intArray = {0,1,3,4,6,8};
        int numberToFind = 7;
        int position = binarySearch(intArray, numberToFind);
        System.out.println(position);
    }

    private static int binarySearch(int[] intArray, int numberToFind) {
        int lowPointer = 0;
        int highPointer = intArray.length -1;

        while(lowPointer <= highPointer) {
            // setUp Number's value and position
            int numberPosition = (lowPointer + highPointer)/2;
            int numberValue = intArray[numberPosition];

            //validation
            if(numberToFind == numberValue) {
                return numberPosition;
            }

            // setUp Pointers based on Number's position
            if(numberToFind > numberValue) {
                lowPointer = numberPosition + 1;
            } else if(numberToFind < numberValue) {
                highPointer = numberPosition -1;
            }
        }

        //return -1 case number not found
        return -1;
    }

}
