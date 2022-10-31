package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserProfile implements ActionListener {
    JFrame frame = new JFrame();

    JButton Return = new JButton("Return");
    JLabel UserFirst = new JLabel();
    JLabel UserLast = new JLabel();

    JLabel UserPhar = new JLabel();
    JLabel UserInsur = new JLabel();
    JLabel UserAdd = new JLabel();

    JLabel Email = new JLabel();

    JButton Edit = new JButton("Edit");

    UserProfile(String email){

        Email.setText(email);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        if (email.equals("A")) {
            try {
                int i = 1;
                File user = new File("src/UserA.txt");
                Scanner myReader = new Scanner(user);
                String Pharmacy = null;
                String First = null;
                String Last = null;
                String Address = null;
                String Insurance = null;
                while (myReader.hasNextLine()) {
                    if (i == 1) {
                        First = myReader.nextLine();
                        UserFirst.setText("First Name: " + First);
                    }
                    if (i == 2) {
                        Last = myReader.nextLine();
                        UserLast.setText("Last Name: " + Last);
                    }
                    if (i == 3) {
                        Pharmacy = myReader.nextLine();
                        UserPhar.setText("Pharmacy: " + Pharmacy);
                    }
                    if (i == 4) {
                        Insurance = myReader.nextLine();
                        UserInsur.setText("Insurance: " + Insurance);
                    }
                    if (i == 5) {
                        Address = myReader.nextLine();
                        UserAdd.setText("Address: " + Address);
                    }
                    i++;
                }
                EmailsandPasswords logged = new EmailsandPasswords();
                logged.setEmail(email);
                logged.setPharmacy(Pharmacy);
                logged.setFirst(First);
                logged.setLast(Last);
                logged.setAddress(Address);
                logged.setInsurance(Insurance);
                myReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
        if (email.equals("D")) {
            try {
                int i = 1;
                File user = new File("src/UserB.txt");
                Scanner myReader = new Scanner(user);
                String Insurance = null;
                String Address = null;
                String Last = null;
                String First = null;
                String Pharmacy = null;
                while (myReader.hasNextLine()) {
                    if (i == 1) {
                        First = myReader.nextLine();
                        UserFirst.setText("First Name: " + First);
                    }
                    if (i == 2) {
                        Last = myReader.nextLine();
                        UserLast.setText("Last Name: " + Last);
                    }
                    if (i == 3) {
                        Pharmacy = myReader.nextLine();
                        UserPhar.setText("Pharmacy: " + Pharmacy);
                    }
                    if (i == 4) {
                        Insurance = myReader.nextLine();
                        UserInsur.setText("Insurance: " + Insurance);
                    }
                    if (i == 5) {
                        Address = myReader.nextLine();
                        UserAdd.setText("Address: " + Address);
                    }
                    i++;
                }
                EmailsandPasswords logged = new EmailsandPasswords();
                logged.setEmail(email);
                logged.setPharmacy(Pharmacy);
                logged.setFirst(First);
                logged.setLast(Last);
                logged.setAddress(Address);
                logged.setInsurance(Insurance);
                myReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
        if (email.equals("G")) {
            try {
                int i = 1;
                File user = new File("src/UserC.txt");
                Scanner myReader = new Scanner(user);
                String Pharmacy = null;
                String First = null;
                String Insurance = null;
                String Address = null;
                String Last = null;
                while (myReader.hasNextLine()) {
                    if (i == 1) {
                        First = myReader.nextLine();
                        UserFirst.setText("First Name: " + First);
                    }
                    if (i == 2) {
                        Last = myReader.nextLine();
                        UserLast.setText("Last Name: " + Last);
                    }
                    if (i == 3) {
                        Pharmacy = myReader.nextLine();
                        UserPhar.setText("Pharmacy: " + Pharmacy);
                    }
                    if (i == 4) {
                        Insurance = myReader.nextLine();
                        UserInsur.setText("Insurance: " + Insurance);
                    }
                    if (i == 5) {
                        Address = myReader.nextLine();
                        UserAdd.setText("Address: " + Address);
                    }
                    i++;
                }
                EmailsandPasswords logged = new EmailsandPasswords();
                logged.setEmail(email);
                logged.setPharmacy(Pharmacy);
                logged.setFirst(First);
                logged.setLast(Last);
                logged.setAddress(Address);
                logged.setInsurance(Insurance);
                myReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }

        Return.setFocusable(false);
        Return.addActionListener(this);

        Edit.setFocusable(false);
        Edit.addActionListener(this);

        frame.add(Return);
        frame.add(UserLast);
        frame.add(UserFirst);
        frame.add(UserAdd);
        frame.add(UserPhar);
        frame.add(UserInsur);
        frame.add(Edit);

        UserLast.setBounds(30,40,125,35);
        UserFirst.setBounds(30,20,125,35);
        UserPhar.setBounds(30,60,125,35);
        UserInsur.setBounds(30,80,125,35);
        UserAdd.setBounds(30,100,300 ,35);
        Return.setBounds(30,0,125,25);
        Edit.setBounds(175, 0, 125, 25);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = Email.getText();

        if (e.getSource() == Return)
        {
            frame.dispose();
            Home home = new Home(name);
        }
        if (e.getSource() == Edit)
        {
            frame.dispose();
            Edit edit = new Edit(name);
        }
    }
}
