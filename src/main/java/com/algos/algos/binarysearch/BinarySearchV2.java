package com.algos.algos.binarysearch;

public class BinarySearchV2 {

    public static void main(String[] args) {
        int[] intArray = {2,5,8,9};
        int numberToFind = 2;

        int position = binarySearch(intArray, numberToFind);
        System.out.println(position);
    }

    private static int binarySearch(int[] intArray, int numberToFind) {
        int lowPointer = 0;
        int highPointer = intArray.length -1;

        while(lowPointer <= highPointer) {
            int numberPosition = (lowPointer + highPointer) / 2;
            int numberValue = intArray[numberPosition];

            if(numberToFind == numberValue) {
                return numberPosition;
            }

            if(numberToFind > numberValue) {
                lowPointer = numberPosition + 1;
            } else if(numberToFind < numberValue){
                highPointer = numberPosition -1;
            }
        }
        return -1;
    }
}
