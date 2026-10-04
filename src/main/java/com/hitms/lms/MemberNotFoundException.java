package com.hitms.lms;

/**
 * Checked exception raised when a member id is not on record.
 */
public class MemberNotFoundException extends Exception {

    /**
     * Creates the exception with a message naming the member id.
     *
     * @param memberId the id that could not be found
     */
    public MemberNotFoundException(int memberId) {
        super("No member is registered under id " + memberId + ".");
    }
}