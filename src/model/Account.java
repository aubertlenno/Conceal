package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Account implements Storable{

    // Initializing variables

    private String accountName;
    private String accountEmail;
    private String accountPassword;
    private String hashedPassword;
    private String salt;

    // There are two constructors: one that holds the hashed account details and another 
    // that holds the raw account details for internal purposes

    public Account(String accountName, String accountEmail, String accountPassword) {
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
    }

    public Account(String accountName, String accountEmail, String hashedPassword, String salt) {
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.hashedPassword = hashedPassword;
        this.salt = salt;
    }

    // Getters and setters

    public String getName() {
        return accountName;
    }

    public void setName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return accountEmail;
    }

    public void setEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getPassword() {
        return accountPassword;
    }

    public void setPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    // Two toString methods are provided. One is for the constructor that deals with hashing and the other
    // is for the constructor without hashing

    @Override
    public String toString() {
        return getName() + " " + getEmail() + " " + getPassword() + "\n";
    }

    public String toStringSecure() {
        return getName() + " " + getEmail() + " " + getHashedPassword() + " " + getSalt() + "\n";
    }

    // Two methods that write to the accounts.txt file, each corresponding to a different constructor 
    // (one with hashing and one without), utilizing the above toString methods
    @Override
    public void saveToFile() {
        try {
            Writer output = null;
            String accountData = this.toString();
            File file = new File("src/file/accounts.txt");
            output = new PrintWriter(new FileWriter(file, true));
            output.append(accountData);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAccountSecure() {
        try {
            Writer output = null;
            String secureAccountData = this.toStringSecure();
            File file = new File("src/file/accounts.txt");
            output = new PrintWriter(new FileWriter(file, true));
            output.append(secureAccountData);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
