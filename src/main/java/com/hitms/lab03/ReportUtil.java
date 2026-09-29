package com.hitms.lab03;

/**
 * Splits the score-averaging block into two methods.
 */
public class ReportUtil {

    /**
     * Returns the average of an array of numeric scores.
     *
     * @param scores the scores to average
     * @return the mean of the scores
     */
    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return (double) total / scores.length;
    }

    /**
     * Prints a short summary for an array of scores.
     *
     * @param scores the scores to report on
     */
    public static void printReport(int[] scores) {
        System.out.println("Average: " + calculateAverage(scores));
    }

    /**
     * Runs the decomposed methods on a sample set of scores.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        int[] studentScores = {78, 92, 55, 88};
        printReport(studentScores);
    }
}