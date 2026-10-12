package com.hitms.lab01;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.ansi;

import org.fusesource.jansi.AnsiConsole;

/**
 * Prints the greeting in colour using the Jansi package.
 */
public class Colors {

    /**
     * Prints the greeting in green text.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        System.out.println(ansi().fg(GREEN).a("Hello, Software Construction!").reset());
        AnsiConsole.systemUninstall();
    }
}