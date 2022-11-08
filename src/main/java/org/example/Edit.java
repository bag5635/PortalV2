package org.example;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Edit implements ActionListener {

    JFrame frame = new JFrame();

    JLabel Pharm = new JLabel("Pharmacy: "); // Line - 3
    JLabel Add = new JLabel("Address: "); // Line - 5
    JLabel Insur = new JLabel("Insurance: "); // Line - 4
    JTextField userPharm= new JTextField("");
    JTextField userAdd= new JTextField("");
    JTextField userInsur= new JTextField("");
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

        Save.setEnabled(false);

        userInsur.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
        });
        userAdd.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
        });
        userPharm.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
        });

    }

    public void changed(){
        if(userAdd.getText().equals("")||userInsur.getText().equals("")||userPharm.getText().equals("")){
            Save.setEnabled(false);
        }
        else {
            Save.setEnabled(true);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = user.getText();
        String address = userAdd.getText();
        String pharm = userPharm.getText();
        String insur = userInsur.getText();

        if(e.getSource() == Save){

            message.setText("Change Request Submitted");

            Editsetget change = new Editsetget();
            change.setAddress(address);
            change.setInsurance(insur);
            change.setPharmacy(pharm);

            EditFile editFile = new EditFile(pharm, address, insur, name);

            try {
                editFile.copy();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
        if(e.getSource() == Return){
            UserProfile userP = new UserProfile(name);
            frame.dispose();
        }
    }
}
