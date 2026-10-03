package com.hitms.lms;

/**
 * Entry point for the library management system.
 */
public class Main {

    /**
     * Runs a short demonstration of the library operations.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        LibraryLog.info("Starting the library session.");

        service.addBook("Clean Code", 3);
        LibraryLog.info("Copies of Clean Code: " + service.titleCount());

        try {
            service.issueBook("Clean Code");
        } catch (BookUnavailableException problem) {
            LibraryLog.warn(problem.getMessage());
        }

        LibraryLog.info("Library session finished.");
    }
}