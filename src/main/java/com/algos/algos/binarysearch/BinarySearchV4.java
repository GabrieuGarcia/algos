package com.algos.algos.binarysearch;

public class BinarySearchV4 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 8;

        int position = binarySearch(arr, target);
        System.out.println(position);
    }

    private static int binarySearch(int[] array, int target) {
        int lowPointer = 0;
        int highPointer = array.length -1;

        while(lowPointer <= highPointer) {
            int middlePosition = (lowPointer + highPointer) / 2;
            int middleValue = array[middlePosition];

            if(middleValue == target) {
                return middlePosition;
            }

            if(middleValue < target) {
                highPointer = middlePosition -1;
            }

            if(middleValue > target) {
                lowPointer = middlePosition + 1;
            }
         }
        return -1;
    }
}
