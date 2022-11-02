package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Home implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    JButton UserP = new JButton("User Profile");
    JButton Appointment = new JButton("Appointments");
    JButton Medication = new JButton("Medications");

    JLabel user = new JLabel("");


    Home(String email){


        welcomeLabel.setBounds(0,100,300,35);
        Appointment.setBounds(0,0,125,35);
        UserP.setBounds(125,0,125,35);
        Medication.setBounds(250,0,125,35);

        UserP.setFocusable(false);
        UserP.addActionListener(this);
        Appointment.setFocusable(false);
        Appointment.addActionListener(this);
        Medication.setFocusable(false);
        Medication.addActionListener(this);

        user.setText(email);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = user.getText();

        if (e.getSource() == UserP)
        {
            frame.dispose();
            UserProfile userP = new UserProfile(name);
        }
        if (e.getSource() == Appointment)
        {
            frame.dispose();

            //example of the code needed to go to the new page and send the user logged in.
            // Appointments app = new Appointments(name);
        }
        if (e.getSource() == Medication)
        {
            frame.dispose();
            //example of the code needed to go to the new page and send the user logged in.
            // Medications meds = new Medications(name);
        }
    }
}
