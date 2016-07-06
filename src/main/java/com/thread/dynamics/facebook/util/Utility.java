package com.thread.dynamics.facebook.util;

import java.util.UUID;

/**
 * The Class Utility.
 */
public class Utility {

    /**
     * Generate random number.
     *
     * @return the string
     */
    public static String generateRandomNumber() {
        final UUID randomNumber = UUID.randomUUID();
        return randomNumber.toString();
    }

}
