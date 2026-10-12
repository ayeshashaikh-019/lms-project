package com.hitms.lab04;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Writes progress to a logger instead of straight to the console.
 */
public class AppLogger {

    private static final Logger LOGGER = Logger.getLogger(AppLogger.class.getName());

    /**
     * Adds a file handler that appends to app.log, then logs the progress.
     *
     * @param args not used
     * @throws IOException if app.log cannot be opened
     */
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Starting process...");
        for (int step = 1; step <= 3; step++) {
            LOGGER.info("Step completed: " + step + " of 3");
        }
        LOGGER.info("Process finished.");
    }
}