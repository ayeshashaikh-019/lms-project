package com.hitms.lab04;

/**
 * Finds the largest number in an array.
 */
public class FindMax {

    /**
     * Returns the largest number in the array.
     *
     * @param numbers the values to search
     * @return the largest value in the array
     */
    public static int findMax(int[] numbers) {
        int maxValue = numbers[0]; // start from the first number, not 0
        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    /**
     * Runs findMax on an all-negative array, the case the bug used to break.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        int[] numbers = {-5, -2, -9};
        System.out.println("Largest value: " + findMax(numbers));
    }
}