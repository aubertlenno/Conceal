package model;

import java.io.*;

public class Credential implements Storable{
    
    // Initializing variables
    
    private String userEmail;
    private String credentialName;
    private String username;
    private String password;
    private String name;
    
    public Credential(String userEmail, String credentialName, String username, String password, String name) {
        this.userEmail = userEmail;
        this.credentialName = credentialName;
        this.username = username;
        this.password = password;
        this.name = name;
    }
    
    // Getters and setters

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // toString method for file writing
    
    @Override
    public String toString() {
        return getUserEmail() + ":" + getCredentialName() + ":" + getUsername() + ":" + getPassword() + "\n";
    }
    
    // Method that write to the credential.txt file
    @Override
    public void saveToFile() {
        try (PrintWriter output = new PrintWriter(new FileWriter("src/file/credentials/" + name + ".txt", true))) {
            String credentialData = this.toString();
            output.append(credentialData);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}
