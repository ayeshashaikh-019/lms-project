package com.hitms.lms;

import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;

/**
 * Driver that imports the util module and exercises the library service.
 */
public class Main {

    /**
     * Calls both util helpers, then runs one issue and one return.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println(LibraryUtils.formatTitle(" the great gatsby "));
        System.out.println(LibraryUtils.daysBetween(
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));

        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 3);
        try {
            System.out.println("Copies left: " + service.issueBook("Clean Code"));
            System.out.println("Copies left: " + service.issueBook("The Pragmatic Programmer"));
        } catch (BookUnavailableException problem) {
            System.out.println("Issue failed: " + problem.getMessage());
        }
    }
}