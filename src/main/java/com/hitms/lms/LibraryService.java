package com.hitms.lms;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Holds the catalogue and the add, issue and return operations of the library.
 *
 * <p>Every method takes what it needs as an argument or returns the result, so
 * nothing here relies on shared static state.
 */
public class LibraryService {

    private final Map<String, Integer> catalogue = new LinkedHashMap<>();

    private final Map<Integer, String> members = new LinkedHashMap<>();

    /**
     * Registers a member under the given id.
     *
     * @param memberId the id to register the member under
     * @param name     the name of the member
     */
    public void registerMember(int memberId, String name) {
        members.put(memberId, name);
    }

    /**
     * Looks up the name of a registered member.
     *
     * @param memberId the id to look up
     * @return the name on record for that id
     * @throws MemberNotFoundException when the id is not registered
     */
    public String findMemberById(int memberId) throws MemberNotFoundException {
        String name = members.get(memberId);
        if (name == null) {
            throw new MemberNotFoundException(memberId);
        }
        return name;
    }

    /**
     * Adds copies of a title, or tops up a title that is already there.
     *
     * @param title the title to add
     * @param copies how many copies to add
     * @return the copies now available for the title
     * @throws IllegalArgumentException when copies is negative
     */
    public int addBook(String title, int copies) {
        if (copies < 0) {
            throw new IllegalArgumentException("Copies cannot be negative.");
        }
        int total = catalogue.getOrDefault(title, 0) + copies;
        catalogue.put(title, total);
        return total;
    }

    /**
     * Issues one copy of the given title and lowers the available copies by one.
     * The caller is told through the return value how many copies are left, and
     * BookUnavailableException is thrown when the last copy has already gone.
     *
     * @param title the title being issued
     * @return the copies left after the issue
     * @throws BookUnavailableException when no copies of the title are left
     */
    public int issueBook(String title) throws BookUnavailableException {
        int available = catalogue.getOrDefault(title, 0);
        if (available == 0) {
            throw new BookUnavailableException(
                    "No copies of '" + title + "' are available to issue.");
        }
        catalogue.put(title, available - 1);
        return available - 1;
    }

    /**
     * Extends the loan of a title by the given number of days.
     *
     * @param title the title being renewed
     * @param days  how many days to add to the loan
     * @return the new due date recorded for the loan
     * @throws IllegalArgumentException when days is not positive
     */
    public LocalDate renewBook(String title, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("A renewal needs at least one day.");
        }
        return LocalDate.now().plusDays(days);
    }

    /**
     * Returns a copy of a title to the shelf.
     *
     * @param title the title being returned
     * @return the copies now available for the title
     */
    public int returnBook(String title) {
        return catalogue.getOrDefault(title, 0) + 1;
    }

    /**
     * Returns whether at least one copy of the title is on the shelf.
     *
     * @param title the title to check
     * @return true when a copy can be issued, false otherwise
     */
    public boolean isAvailable(String title) {
        return catalogue.getOrDefault(title, 0) > 0;
    }

    /**
     * Returns the total copies on loan across every title in the catalogue.
     *
     * @return the sum of the available copies of all titles
     */
    public int outstanding() {
        int total = 0;
        for (int copies : catalogue.values()) {
            total += copies;
        }
        return total;
    }

    /**
     * Returns how many titles the library holds.
     *
     * @return the number of distinct titles in the catalogue
     */
    public int titleCount() {
        return catalogue.size();
    }
}