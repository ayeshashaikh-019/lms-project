package com.hitms.lms;

/**
 * Checked exception raised when a title has no copies left to issue.
 */
public class BookUnavailableException extends Exception {

    /**
     * Creates the exception with a message describing the title.
     *
     * @param message the detail message shown to the caller
     */
    public BookUnavailableException(String message) {
        super(message);
    }
}