package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Shared helper methods for the library module.
 */
public class LibraryUtils {

    /**
     * Returns a title in Title Case with surrounding whitespace removed.
     *
     * @param title the raw title to format
     * @return the title in Title Case
     */
    public static String formatTitle(String title) {
        String trimmed = title.strip().toLowerCase();
        String[] words = trimmed.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                result.append(Character.toUpperCase(w.charAt(0)))
                      .append(w.substring(1)).append(" ");
            }
        }
        return result.toString().strip();
    }

    /**
     * Returns the number of whole days between two dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     * @return the whole days between the two dates
     */
    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}