/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import model.Account;

/**
 *
 * @author Lenno
 */

// Class for Edit Credential window

public class EditCredential extends javax.swing.JFrame implements Check{
    
    /**
     * Creates new form EditCredential
     */
    public EditCredential(Account a) {
        initComponents();
        retrieveAccountInfo(a);
    }
    
    private String accEmail;
    private String accName;
    private String accPass;

    void retrieveAccountInfo(Account a) {
        this.accEmail = a.getEmail();
        this.accName = a.getName();
        this.accPass = a.getPassword();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        descLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        curPasswordLabel = new javax.swing.JLabel();
        curPasswordField = new javax.swing.JPasswordField();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        confPasswordLabel = new javax.swing.JLabel();
        confPasswordField = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conceal - Edit Credential");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        titleLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        titleLabel.setText("Edit Credential");

        descLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        descLabel.setText("Fill in below's form to edit saved credential. After you have done,");

        descLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        descLabel2.setText("press the \"Save\" button.");

        nameLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        nameLabel.setText("Credential Name");

        nameTextField.setEditable(false);

        usernameLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        usernameLabel.setText("Username");

        usernameTextField.setEditable(false);

        curPasswordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        curPasswordLabel.setText("Current Password");

        newPasswordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        newPasswordLabel.setText("New Password");

        confPasswordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        confPasswordLabel.setText("Confirm New Password");

        showPasswordCheckBox.setText("Show Password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(titleLabel)
                            .addGap(183, 183, 183))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(descLabel)
                            .addGap(73, 73, 73)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(descLabel2)
                                .addComponent(nameLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(confPasswordLabel)
                                    .addComponent(newPasswordLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(nameTextField)
                                    .addComponent(curPasswordLabel)
                                    .addComponent(curPasswordField)
                                    .addComponent(newPasswordField)
                                    .addComponent(confPasswordField)
                                    .addComponent(showPasswordCheckBox))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(curPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if (showPasswordCheckBox.isSelected()) {
            curPasswordField.setEchoChar((char) 0);
            newPasswordField.setEchoChar((char) 0);
            confPasswordField.setEchoChar((char) 0);
        } else {
            curPasswordField.setEchoChar('*');
            newPasswordField.setEchoChar('*');
            confPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        // Checking if a field is empty and return a message for the user to fill all the fields.
        if (nameTextField.getText().isBlank() || usernameTextField.getText().isBlank()
            || curPasswordField.getText().isBlank() || newPasswordField.getText().isBlank()
            || confPasswordField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "All fields are required", "Error!", JOptionPane.ERROR_MESSAGE);

        // Checking if the inputted current password matches the password saved in the credential.txt file
        } else if (!curPasswordField.getText().equals(getCurrentPassword())) {
            curPasswordField.setText("");
            JOptionPane.showMessageDialog(this, "The current password is incorrect", "Error!",
                            JOptionPane.ERROR_MESSAGE);

        // Check if the input in the password field and the confirm password field the same
        } else if (!confPasswordField.getText().equals(newPasswordField.getText())) {
            newPasswordField.setText("");
            confPasswordField.setText("");
            JOptionPane.showMessageDialog(this, "The passwords don't match", "Error!", JOptionPane.ERROR_MESSAGE);

        // Replace the old credential information with the new one
        } else {
            overwriteCredLine(getCredentialLine());
            
            // Give "Weak password!" message if the new password is considered weak
            if (!isStrong(newPasswordField.getText())) {
                JOptionPane.showMessageDialog(this, "Weak Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
            
            // Notify the user that the edit is successful
            JOptionPane.showMessageDialog(this, "Your credential was edited successfully", "Edit Credential",JOptionPane.INFORMATION_MESSAGE);
            
            // Close the window
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        // Close the window if cancel button clicked
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Method to check the strength of a password input
    public boolean isStrong(String input) {
        
        // Initialize variables to track presence of different types of special characters
        int n = input.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                    Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        
        // Iterate over characters in the input to verify if it contains a lower case, upper case, number, and special character
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                    hasLower = true;
            if (Character.isUpperCase(i))
                    hasUpper = true;
            if (Character.isDigit(i))
                    hasDigit = true;
            if (set.contains(i))
                    specialChar = true;
        }
        
        // Return true if verified
        return hasDigit && hasLower && hasUpper && specialChar && (n >= 8);
    }

    // Method to initialize a FileReader object to read the credentials.txt file
    BufferedReader getFileReader() {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(new File("src/file/credentials/" + accName + ".txt")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return reader;
    }

    // Method to retrieve the current password of the credential
    public String getCurrentPassword() {
            String currentPass = null;
            try {
                BufferedReader reader = getFileReader();
                String delimiter = ":";
                String line;
                
                // Iterating over the file to find the requested data
                while ((line = reader.readLine()) != null) {
                    if (line.split(delimiter)[1].equals(nameTextField.getText())
                                && line.split(delimiter)[2].equals(usernameTextField.getText())) {
                        currentPass = line.split(delimiter)[3];
                        return currentPass;
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return currentPass;
    }

    // Method to find the line in the credentials text file that is to be replaced
    public String getCredentialLine() {
            try {
                BufferedReader reader = getFileReader();
                String delimiter = ":";
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.split(delimiter)[1].equals(nameTextField.getText())
                                && line.split(delimiter)[2].equals(usernameTextField.getText())) {
                        return line;
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return null;
    }

    // Method to overwrite a line in the credentials file after edited
    public void overwriteCredLine(String line) {
        File file = new File("src/file/credentials/" + accName + ".txt");
        
        // Initialize a scanner to read the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        
        // Read all lines from the file into a buffer
        StringBuffer buffer = new StringBuffer();
        while (scanner.hasNextLine()) {
            buffer.append(scanner.nextLine() + System.lineSeparator());
        }
        
        // Convert the buffer to a string and close the scanner
        String fileContents = buffer.toString();
        scanner.close();
        
        // Create the new line to replace the old one
        String oldLine = line;
        String newLine = accEmail + ":" + nameTextField.getText() + ":" + usernameTextField.getText() + ":"
                    + newPasswordField.getText();
        fileContents = fileContents.replaceAll(oldLine, newLine);
        
        // Initialize a FileWriter to write to the file
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
        // Append the modified file contents to the file
        try {
            writer.append(fileContents);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Flush the writer to ensure all changes are saved
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPasswordField confPasswordField;
    private javax.swing.JLabel confPasswordLabel;
    private javax.swing.JPasswordField curPasswordField;
    private javax.swing.JLabel curPasswordLabel;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
