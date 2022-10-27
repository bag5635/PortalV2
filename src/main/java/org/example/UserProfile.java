package org.example;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserProfile {
    JFrame frame = new JFrame();


    JLabel UserFirst = new JLabel();
    JLabel UserLast = new JLabel();

    JLabel UserPhar = new JLabel();
    JLabel UserInsur = new JLabel();
    JLabel UserAdd = new JLabel();

    UserProfile(String email){






        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        if (email.equals("A")) {

            try {
                int i = 1;
                File user = new File("src/UserA.txt");
                Scanner myReader = new Scanner(user);
                while (myReader.hasNextLine()) {

                    if (i == 1) {
                        String First = myReader.nextLine();
                        UserFirst.setText("First Name: " + First);
                    }
                    if (i == 2) {
                        String Last = myReader.nextLine();
                        UserLast.setText("Last Name: " + Last);
                    }
                    if (i == 3) {
                        String Pharmacy = myReader.nextLine();
                        UserPhar.setText("Pharmacy: " + Pharmacy);
                    }
                    if (i == 4) {
                        String Insurance = myReader.nextLine();
                        UserInsur.setText("Insurance: " + Insurance);
                    }
                    if (i == 5) {
                        String Address = myReader.nextLine();
                        UserAdd.setText("Address: " + Address);
                    }
                    i++;
                }
                myReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }


        frame.add(UserLast);
        frame.add(UserFirst);
        frame.add(UserAdd);
        frame.add(UserPhar);
        frame.add(UserInsur);

        UserLast.setBounds(30,40,125,35);
        UserFirst.setBounds(30,20,125,35);
        UserPhar.setBounds(30,60,125,35);
        UserInsur.setBounds(30,80,125,35);
        UserAdd.setBounds(30,100,300 ,35);


    }

}
