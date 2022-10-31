package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");

    JTextField userEmailField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();

    JLabel userEmail = new JLabel("Email");
    JLabel userPasswordLabel = new JLabel("Password");

    JLabel messageLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        userEmail.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        userEmailField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        login.setBounds(125, 200,100,25);
        login.setFocusable(false);
        login.addActionListener(this);

        reset.setBounds(225, 200,100,25);
        reset.setFocusable(false);
        reset.addActionListener(this);

        frame.add(userEmail);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userEmailField);
        frame.add(userPasswordField);
        frame.add(login);
        frame.add(reset);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==reset){
            userEmailField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==login){
            String email = userEmailField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(email)){
                if(logininfo.get(email).equals(password)){
                    messageLabel.setText("Success!");
                    frame.dispose();
                    Home home = new Home(email);
                }
                else{
                    messageLabel.setText("Try Again");
                }
            }
        }
    }
}
