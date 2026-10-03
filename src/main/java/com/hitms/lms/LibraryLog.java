package com.hitms.lms;

import java.util.logging.Logger;

/**
 * Single logger used across the library module.
 */
public final class LibraryLog {

    private static final Logger LOGGER = Logger.getLogger(LibraryLog.class.getName());

    private LibraryLog() {
    }

    /**
     * Records an informational message.
     *
     * @param message the message to record
     */
    public static void info(String message) {
        LOGGER.info(message);
    }

    /**
     * Records a warning message.
     *
     * @param message the message to record
     */
    public static void warn(String message) {
        LOGGER.warning(message);
    }
}