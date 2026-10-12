package com.hitms.lab03;

import java.util.ArrayList;
import java.util.List;

/**
 * Version B of the catalogue example: the catalogue is passed in as an
 * argument instead of being held in a shared static field.
 */
public class Catalogue {

    /**
     * Adds a title to the given catalogue and returns it.
     *
     * @param catalogue the catalogue to add to
     * @param title     the title to add
     * @return the same catalogue, now including the new title
     */
    public static List<String> addItem(List<String> catalogue, String title) {
        catalogue.add(title);
        return catalogue;
    }

    /**
     * Returns the number of titles in the given catalogue.
     *
     * @param catalogue the catalogue to count
     * @return how many titles the catalogue holds
     */
    public static int itemCount(List<String> catalogue) {
        return catalogue.size();
    }

    /**
     *Runs the parameterised version on a local list.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        List<String> catalogue = new ArrayList<>();
        addItem(catalogue, "Clean Code");
        addItem(catalogue, "The Pragmatic Programmer");
        System.out.println("Items in the catalogue: " + itemCount(catalogue));
    }
}