package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends Frame {

    static Button button, button2, logout;
    static  Label title, email, password, status, user;
    static TextField emailField, passwordField;



    public static void main(String[] args) {

        //Heading Panel
        Panel headingPanel = new Panel();
        headingPanel.setBounds(0, 20, 500, 50);
        headingPanel.setBackground(Color.green);
        Label heading = new Label("Heading");
        headingPanel.add(heading);

        //Content Panel
        Panel contentPanel = new Panel();
        contentPanel.setBounds(0, 70, 500, 400);
        contentPanel.setLayout(null);
        title = new Label("Login Form");
        title.setBounds(20, 10, 100, 30);

        email = new Label("Email");
        email.setBounds(20, 100, 100, 30);
        emailField = new TextField();
        emailField.setBounds(120, 100, 200, 30);

        password = new Label("Password");
        password.setBounds(20, 150, 100, 30);
        passwordField = new TextField();
        passwordField.setBounds(120, 150, 200, 30);

        button = new Button("Login");
        button.setActionCommand("Login");
        button.addActionListener(new ButtonClickSubmitHandler());
        button.setBackground(Color.blue);
        button.setBounds(20, 200, 100, 30);

        button2 = new Button("Clear");
        button2.setActionCommand("Clear");
        button2.addActionListener(new ButtonClickSubmitHandler());
        button2.setBackground(Color.red);
        button2.setBounds(180, 200, 100, 30);

        logout = new Button("Logout");
        logout.setActionCommand("Logout");
        logout.addActionListener(new ButtonClickSubmitHandler());
        logout.setBackground(Color.red);
        logout.setBounds(20, 200, 100, 30);
        logout.setVisible(false);

        status = new Label("Not logged in");
        status.setForeground(Color.red);
        status.setBounds(20, 250, 100, 30);

        user = new Label("");
        user.setBounds(20, 300, 500, 30);


        contentPanel.add(title);
        contentPanel.add(email);
        contentPanel.add(emailField);
        contentPanel.add(password);
        contentPanel.add(passwordField);
        contentPanel.add(button);
        contentPanel.add(button2);
        contentPanel.add(logout);
        contentPanel.add(status);
        contentPanel.add(user);


        //Footer Panel
        Panel footerPanel = new Panel();
        footerPanel.setBounds(0, 470, 500, 50);
        footerPanel.setBackground(Color.GREEN);
        Label footer = new Label("Footer");
        footerPanel.add(footer);

        Layout layout = new Layout();

        layout.setSize(500, 520);
        layout.setVisible(true);
        layout.setLayout(null);
        layout.setTitle("D.V.Bara");
        layout.setIconImage(Toolkit.getDefaultToolkit().getImage("src/com/company/icon.png"));

        layout.add(headingPanel);
        layout.add(contentPanel);
        layout.add(footerPanel);


        layout.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }

    static class ButtonClickSubmitHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Login")){
                status.setText("Logged in");
                status.setForeground(Color.green);

                user.setText("Logged in as " + emailField.getText() + " : " + passwordField.getText());

                button.setVisible(false);
                button2.setVisible(false);
                logout.setVisible(true);

            }else if(e.getActionCommand().equals("Clear")){
                emailField.setText("");
                passwordField.setText("");
            } else if(e.getActionCommand().equals("Logout")){
                status.setText("Logged out");
                status.setForeground(Color.red);
                button.setVisible(true);
                button2.setVisible(true);
                logout.setVisible(false);
                user.setText("");
            }
        }
    }
}

