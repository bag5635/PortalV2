package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Edit implements ActionListener {

    JFrame frame = new JFrame();

    JLabel Pharm = new JLabel("Pharmacy: "); // Line - 3
    JLabel Add = new JLabel("Address: "); // Line - 5
    JLabel Insur = new JLabel("Insurance: "); // Line - 4
    JTextField userPharm= new JTextField();
    JTextField userAdd= new JTextField();
    JTextField userInsur= new JTextField();
    JButton Save = new JButton("Save");

    JButton Return = new JButton("Return");

    JLabel message = new JLabel("");

    JLabel user = new JLabel();
    Edit(String email){

        user.setText(email);

        Add.setBounds(50,50,75,25);
        userAdd.setBounds(50,75,200,25);

        Pharm.setBounds(50, 100, 200, 25);
        userPharm.setBounds(50, 125, 200, 25);

        Insur.setBounds(50, 150, 200, 25);
        userInsur.setBounds(50, 175, 200, 25);



        frame.add(message);
        frame.add(Save);
        frame.add(userAdd);
        frame.add(userPharm);
        frame.add(userInsur);
        frame.add(Add);
        frame.add(Pharm);
        frame.add(Insur);
        frame.add(Return);

        message.setBounds(125, 0, 200, 25);

        Save.setBounds(125, 250,100,25);
        Save.setFocusable(false);
        Save.addActionListener(this);

        Return.setBounds(125, 300,100,25);
        Return.setFocusable(false);
        Return.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = user.getText();

        if(e.getSource() == Save){
            message.setText("Change Request Submitted");
        }
        if(e.getSource() == Return){
            UserProfile userP = new UserProfile(name);
        }
    }
}
