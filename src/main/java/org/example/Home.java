package org.example;

import javax.swing.*;

public class Home {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    JButton UserP = new JButton("User Profile");
    JButton Appointment = new JButton("Appointments");
    JButton Medication = new JButton("Medications");


    Home(String email){

        welcomeLabel.setBounds(0,100,300,35);
        Appointment.setBounds(0,0,125,35);
        UserP.setBounds(125,0,125,35);
        Medication.setBounds(250,0,125,35);

        welcomeLabel.setText("Hello, "+ email + " welcome to the health portal system.");

        frame.add(UserP);
        frame.add(Appointment);
        frame.add(welcomeLabel);
        frame.add(Medication);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
