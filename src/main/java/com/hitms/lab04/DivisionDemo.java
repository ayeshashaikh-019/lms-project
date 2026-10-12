package com.hitms.lab04;

/**
 * Shows an unchecked ArithmeticException being caught instead of crashing.
 */
public class DivisionDemo {

    /**
     * Divides two integers.
     *
     * @param numerator   the value being divided
     * @param denominator the value to divide by
     * @return the whole-number quotient
     */
    public static int safeDivide(int numerator, int denominator) {
        return numerator / denominator;
    }

    /**
     * Divides twice, catching the failure when the denominator is zero.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + safeDivide(10, 2));
            System.out.println("Result: " + safeDivide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Division task finished.");
        }
    }
}