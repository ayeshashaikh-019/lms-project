package com.hitms.lab02;

/**
 * Computes the area of a rectangle.
 *
 * <p>The original class was named {@code calc} with a method {@code fn} and
 * parameters {@code x}, {@code y} and {@code z}. Every one of those names was
 * renamed so the code explains itself.
 */
public class AreaCalculator {

    /**
     * Returns the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @return the area of the rectangle
     */
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    /**
     * Runs the renamed method to show the refactor still compiles and runs.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(7, 5));
    }
}