package com.algos.algos.binarysearch;

public class BinarySearchV3 {


    public static void main(String[] args) {

        int numberToFind = 9;
        int[] numberArray = {1, 3, 4, 7, 8, 9, 10, 11, 12, 17, 19, 20};

        int position = binarySearch(numberArray, numberToFind);
        System.out.println(position);
    }

    private static int binarySearch(int[] numberArray, int numberToFind) {
        int lowPointer = 0;
        int highPointer = numberArray.length -1;

        while(lowPointer <= highPointer) {
            int middlePosition = (lowPointer + highPointer) / 2;
            int middleValue = numberArray[middlePosition];

            if(middleValue == numberToFind) {
                return middlePosition;
            }

            if(numberToFind < middleValue) {
                highPointer = middlePosition -1;
            }

            else if(numberToFind > middleValue) {
                lowPointer = middleValue + 1;
            }
        }
        return -1;
    }

}
