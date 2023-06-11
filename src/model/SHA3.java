package model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Class for the hashing feature

public class SHA3 {

    // Method to hash the given string using SHA3-256 hash algorithm
    public static byte[] hash(String input) {
        MessageDigest hasher = null;
        try {
            // Getting the instance of SHA3-256 hashing algorithm
            hasher = MessageDigest.getInstance("SHA3-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hasher.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    // Method to create a unique salt of given size for each password to ensure unique hash
    public static String getSalt(int saltSize) {
        byte[] salt = new byte[saltSize];
        new SecureRandom().nextBytes(salt);
        return convertBytesToHex(salt);
    }

    // Method to convert a byte array into a hexadecimal string
    public static String convertBytesToHex(byte[] byteArray) {
        // Initializing the StringBuilder for the hex value
        StringBuilder hexValue = new StringBuilder(2 * byteArray.length);
        for (byte element : byteArray) {
            // Converting each byte into a hexadecimal string
            String hexDigit = Integer.toHexString(0xff & element);
            if (hexDigit.length() == 1) {
                hexValue.append('0');
            }
            hexValue.append(hexDigit);
        }
        return hexValue.toString();
    }
}