package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Appointments implements ActionListener {
    JFrame frame = new JFrame();
    JLabel user = new JLabel();

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    JLabel label5 = new JLabel();

    JButton Return = new JButton("Return");
    JButton Submit = new JButton("Submit");
    JButton Refresh = new JButton("Refresh");

    JRadioButton app1 = new JRadioButton("January 1st, 2023, Dr. Smith, 10:00 AM");
    JRadioButton app2 = new JRadioButton("January 11th, 2023, Dr. Jones, 10:30 AM");
    JRadioButton app3 = new JRadioButton("January 20th, 2023, Dr. Jones, 11:30 AM");
    JRadioButton app4 = new JRadioButton("January 25th, 2023, Dr. John, 12:00 PM");
    JRadioButton app5 = new JRadioButton("February 3rd, 2023, Dr. Smith, 10:00 AM");
    JRadioButton app6 = new JRadioButton("February 5th, 2023, Dr. Smith, 11:00 AM");

    Appointments(String name){

        user.setText(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        label1.setText("Available Appointments");
        label2.setText("Current Appointment:");


        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.add(Return);
        frame.add(Submit);
        frame.add(Refresh);

        frame.add(app1);
        frame.add(app2);
        frame.add(app3);
        frame.add(app4);
        frame.add(app5);
        frame.add(app6);

        Return.setBounds(30,0,125,25);
        Refresh.setBounds(175, 0, 125, 25);
        Submit.setBounds(100, 280, 125, 25);

        label1.setBounds(30, 60, 170, 25);
        label2.setBounds(30, 220, 125, 25);
        label3.setBounds(50, 240, 275, 25);

        app1.setBounds(30, 80, 270, 25);
        app2.setBounds(30, 100, 270, 25);
        app3.setBounds(30, 120, 270, 25);
        app4.setBounds(30, 140, 270, 25);
        app5.setBounds(30, 160, 270, 25);
        app6.setBounds(30, 180, 270, 25);

        app1.setFocusable(false);
        app1.addActionListener(this);
        app2.setFocusable(false);
        app2.addActionListener(this);
        app3.setFocusable(false);
        app3.addActionListener(this);
        app4.setFocusable(false);
        app4.addActionListener(this);
        app5.setFocusable(false);
        app5.addActionListener(this);
        app6.setFocusable(false);
        app6.addActionListener(this);

        Return.setFocusable(false);
        Return.addActionListener(this);

        Submit.setFocusable(false);
        Submit.addActionListener(this);

        Refresh.setFocusable(false);
        Refresh.addActionListener(this);

        try {
            File user = new File("src/Appointments.txt");
            Scanner myReader = new Scanner(user);
            String App = null;
            while (myReader.hasNextLine()) {
                App = myReader.nextLine();
                label3.setText(App);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = user.getText();
        PrintWriter outputStream = null;
        if(app1.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app1.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(app2.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app2.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(app3.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app3.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(app4.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app4.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(app5.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app5.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(app6.isSelected() && e.getSource() == Submit) {
            System.out.println("Test");
            try {
                outputStream = new PrintWriter(new FileWriter("src/Appointments.txt"));
                outputStream.println(app6.getText());
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource()== Refresh) {
            frame.dispose();
            Appointments app = new Appointments(name);
        }
        if(e.getSource()==Return) {
            frame.dispose();
            Home home = new Home(name);
        }
    }



}
