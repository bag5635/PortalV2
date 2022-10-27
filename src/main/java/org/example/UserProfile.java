package org.example;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserProfile {
    JFrame frame = new JFrame();
    JLabel UserLabel = new JLabel();

    UserProfile(String email){

        UserLabel.setBounds(0,100,300,35);

        UserLabel.setText("Hello, "+ email + " User Profile");

        frame.add(UserLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        try{
            File user = new File("src/UserA.txt");
            Scanner myReader = new Scanner(user);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }

}
