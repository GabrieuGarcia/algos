package com.algos.algos.binarysearch;


public class BinarySearchV7 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;

        int position = binarySearch(array, target);
        System.out.println(position);

    }

    private static int binarySearch(int[] array, int target) {
        int minPosition = 0;
        int maxPosition = array.length - 1;

        while (minPosition <= maxPosition) {
            int middlePosition = (minPosition + maxPosition) / 2;
            int middleValue = array[middlePosition];


            if (middleValue == target) return middlePosition;

            if (target > middleValue) {
                minPosition = middlePosition + 1;
            } else if (target < middleValue) {
                maxPosition = middlePosition - 1;
            }

        }
        return -1;
    }
}
