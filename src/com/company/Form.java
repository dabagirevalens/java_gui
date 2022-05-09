package com.company;

import java.awt.*;

public class Form extends Frame {
    Label title, email, password;
    TextField emailField, passwordField;

    public Form() {
        title = new Label("Login");

        email = new Label("Email");
        email.setBounds(250, 100, 100, 30);
        emailField = new TextField();
        emailField.setBounds(350, 100, 200, 30);

        password = new Label("Password");
        password.setBounds(250, 150, 100, 30);
        passwordField = new TextField();
        passwordField.setBounds(350, 150, 200, 30);

        add(title);
        add(email);
        add(emailField);
        add(password);
        add(passwordField);
    }
}
