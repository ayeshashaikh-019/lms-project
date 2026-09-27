package com.hitms.lms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    static String fmtt(String title) {
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

    static long db(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }

    public static void main(String[] args) {
        System.out.println("LMS starting...");
    }
}