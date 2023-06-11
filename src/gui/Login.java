/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.*;
import java.util.regex.Pattern;
import javax.swing.*;
import model.Account;
import model.SHA3;

/**
 *
 * @author Lenno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_Panel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        email_TextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        showPassword_CheckBox = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conceal");
        setIconImages(null);
        setResizable(false);

        login_Panel.setPreferredSize(new java.awt.Dimension(500, 500));

        descriptionLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        descriptionLabel.setText("The only safe and secure password manager");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        titleLabel.setText("Welcome to Conceal");

        emailLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        emailLabel.setText("Email");

        email_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_TextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        showPassword_CheckBox.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        showPassword_CheckBox.setText("Show Password");
        showPassword_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword_CheckBoxActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signUpButton.setText("Sign up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_PanelLayout = new javax.swing.GroupLayout(login_Panel);
        login_Panel.setLayout(login_PanelLayout);
        login_PanelLayout.setHorizontalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_PanelLayout.createSequentialGroup()
                            .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel)
                                .addComponent(passwordLabel)
                                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(login_PanelLayout.createSequentialGroup()
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(showPassword_CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField)
                                    .addComponent(email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(21, 21, 21))
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleLabel)
                        .addGap(37, 37, 37)))
                .addGap(43, 43, 43))
        );
        login_PanelLayout.setVerticalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel)
                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showPassword_CheckBox))
                    .addGroup(login_PanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(logo)))
                .addGap(18, 18, 18)
                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(signUpButton))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void showPassword_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword_CheckBoxActionPerformed
        // TODO add your handling code here:
        // To show the typed password if the checkbox is checked
        if (showPassword_CheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
        } else {
                passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassword_CheckBoxActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String emailText;
        String passText;
        emailText = email_TextField.getText();
        passText = passwordField.getText();

        // Check whether any field is blank or not
        if (emailText.isBlank() || passText.isBlank()) {
            email_TextField.setText("");
            passwordField.setText("");
            JOptionPane.showMessageDialog(this, "All fields are required", "Error!", JOptionPane.ERROR_MESSAGE);

        // Check whether the email is valid or not
        } else if (!isValid(emailText)) {
            email_TextField.setText("");
            email_TextField.setText("");
            passwordField.setText("");
            JOptionPane.showMessageDialog(this, "The email address you have entered is invalid", "Error!",
                            JOptionPane.ERROR_MESSAGE);

        // Check if the email and password correct or not
        } else if (isCorrect(emailText, passText)) {
            // If correct, open the Home window
            JOptionPane.showMessageDialog(this, "Login Successful", "Success!", JOptionPane.INFORMATION_MESSAGE);
            Account acc = new Account(getAccountHolderName(emailText, passText), emailText, passText);
            Home main = new Home(acc);
            main.setVisible(true);
            setVisible(false);
            dispose();
        } else {
            // If not correct, show a message dialog
            passwordField.setText("");
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error!",
                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void email_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_TextFieldActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        // Open SignUp window
        Signup signup = new Signup();
        signup.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    
    // Method to check if the inputted email valid or not
    public boolean isValid(String email) {
        // Define and compile regex for email validation.
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                              "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailPattern);

        // Validate email against regex pattern.
        return email != null && pattern.matcher(email).matches();
    }

    // Method to check if the informations the user inputted match the database or not
    private static boolean isCorrect(String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/file/accounts.txt"))) {
            String line;
            // Iterate through the file and check for email and password match.
            while ((line = reader.readLine()) != null) {
                String[] accountInfo = line.split(" ");
                String hashedPassword = SHA3.convertBytesToHex(SHA3.hash(accountInfo[3] + password));
                if (accountInfo[1].equals(email) && accountInfo[2].equals(hashedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to retrieves the name of the account holder for a given email and password.
    private static String getAccountHolderName(String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/file/accounts.txt"))) {
            String line;
            // Iterate through the file and retrieve the account holder's name.
            while ((line = reader.readLine()) != null) {
                String[] accountInfo = line.split(" ");
                String hashedPassword = SHA3.convertBytesToHex(SHA3.hash(accountInfo[3] + password));
                if (accountInfo[1].equals(email) && accountInfo[2].equals(hashedPassword)) {
                    return accountInfo[0];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField email_TextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel login_Panel;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showPassword_CheckBox;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}