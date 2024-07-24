package com.algos.algos.binarysearch;

public class BinarySearchV3 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int target = 7;
        int position = binarySearch(array, target);
        System.out.println(position);
    }

    private static int binarySearch(int[] array, int numberToFind) {
        int lowPointer = 0;
        int highPointer = array.length - 1;

        while(lowPointer <= highPointer) {
            int middlePosition = (lowPointer + highPointer) / 2;
            int middleValue = array[middlePosition];

            if(numberToFind == middleValue) {
                return middlePosition;
            }

            if(numberToFind < middleValue) {
                highPointer = middlePosition - 1;
            } else if(numberToFind > middleValue) {
                lowPointer = middlePosition + 1;
            }
        }
        return -1;
    }

}
