package com.hitms.lab02;

/**
 * Totals and averages a list of item prices.
 */
public class PriceUtils {

    /**
     * Returns the sum of a list of item prices.
     *
     * @param prices the item prices
     * @return the total of all prices
     */
    public static double total(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price; // accumulate running total
        }
        return sum;
    }

    /**
     * Returns the average of a list of item prices.
     *
     * @param prices the item prices
     * @return the mean price
     */
    public static double average(double[] prices) {
        return total(prices) / prices.length;
    }

    /**
     * Prints a total and an average so the class can be run on its own.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        double[] prices = {19.99, 24.50, 7.25};
        System.out.printf("Total: %.2f%n", total(prices));
        System.out.printf("Average: %.2f%n", average(prices));
    }
}