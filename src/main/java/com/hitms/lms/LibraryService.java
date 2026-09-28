package com.hitms.lms;

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

    /**
     * Adds copies of a title, or tops up a title that is already there.
     *
     * @param title the title to add
     * @param copies how many copies to add
     * @return the copies now available for the title
     */
    public int addBook(String title, int copies) {
        int total = catalogue.getOrDefault(title, 0) + copies;
        catalogue.put(title, total);
        return total;
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
     * Returns how many titles the library holds.
     *
     * @return the number of distinct titles in the catalogue
     */
    public int titleCount() {
        return catalogue.size();
    }
}