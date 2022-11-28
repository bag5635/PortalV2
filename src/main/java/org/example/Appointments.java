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

    JButton Return = new JButton("Return");
    JButton Submit = new JButton("Submit");
    JButton Refresh = new JButton("Refresh");

    JRadioButton app1 = new JRadioButton("January 10th 2023 @ 11am with Dr.Jones");
    JRadioButton app2 = new JRadioButton("February 1st 2023 @ 1pm with Dr.Hank");
    JRadioButton app3 = new JRadioButton("January 20th 2023 @ 4pm with Dr.Smith");

    Appointments(String name){

        user.setText(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        label1.setText("Available Appointments");
        label2.setText("Current Appointment");

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(Return);
        frame.add(Submit);
        frame.add(Refresh);
        frame.add(app1);
        frame.add(app2);
        frame.add(app3);

        Return.setBounds(30,0,125,25);
        Refresh.setBounds(175, 0, 125, 25);
        Submit.setBounds(100, 300, 125, 25);
        label1.setBounds(30, 30, 200, 25);
        label2.setBounds(30, 170, 125, 25);
        label3.setBounds(30, 200, 300,25);
        app1.setBounds(30, 60, 300, 25);
        app2.setBounds(30, 80, 300, 25);
        app3.setBounds(30, 100, 300, 25);


        app1.setFocusable(false);
        app1.addActionListener(this);
        app2.setFocusable(false);
        app2.addActionListener(this);
        app3.setFocusable(false);
        app3.addActionListener(this);

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
