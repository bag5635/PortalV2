package org.example;

import java.awt.event.ActionEvent;

	import java.awt.event.ActionListener;

	import javax.swing.JButton;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;




	public class medications implements ActionListener{

		JFrame frame = new JFrame();

		JButton Return = new JButton("Return");


		JLabel Email = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();

		JButton Meds = new JButton("View Medication");

		
		medications(String name){

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 400);
			frame.setLayout(null);
			frame.setVisible(true);

			Email.setText(name);
			
			/*make panels
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
	        JPanel panel4 = new JPanel();
	        JPanel panel5 = new JPanel();
	        
	        frame.add(label1);
			frame.add(label2);
			frame.add(label3);
			frame.add(label4);
			frame.add(label5);
			frame.add(button);*/

			frame.add(Meds);
			frame.add(Return);

			Return.setFocusable(false);
			Return.addActionListener(this);
			Meds.setFocusable(false);
			Meds.addActionListener(this);


			Return.setBounds(30,0,125,25);
			Meds.setBounds(175, 0, 125, 25);
	        
	        
	        
	        
	        //add text areas for their receipt and their order name to panels
	        //panel3.add(medicationsDisplay);
			      
	        
			//sets up the clear button
	       // JButton clearButton = new JButton("Clear");
	        //clearButton.addActionListener(this);
	       // panel5.add(clearButton);
	         
	        
	        //sets up the view medications button
	        //JRadioButton viewButton = new JRadioButton("View Medications");
	        //group.add(viewButton);
	        //viewButton.addActionListener(this);
	        //panel1.add(viewButton);

	        
	        
		}
		
		//set a reaction to an user engagement
		public void actionPerformed(ActionEvent e) {
			
			String name = Email.getText();

			//will later be converted into text files 
			String medication1 = "Robitussin"; 
			String prescription1 = "Prescribed by Dr Medicine to treat Acid reflux, take 2 times a day as directed on label"; 
			String sideEffects1 = "Side Effects: itchy throat, upset stomach, kidney stones, death";
			String warning = "If you start to experience severe reactions stop taking and call your doctor immediately";
			
			String medication2 = "CIBINQO"; 
			String prescription2 = "Prescribed by Dr Medicine to treat exzema, take once a day as directed on label"; 
			String sideEffects2 = "Side Effects: infections, blood clots, hives, death";

			frame.add(label1);
			frame.add(label2);
			frame.add(label3);
			frame.add(label4);
			frame.add(label5);
			frame.add(label6);
			frame.add(label7);
			frame.add(label4);



			label1.setBounds(30,20,500,35);
			label2.setBounds(30,30,500,35);
			label3.setBounds(30,40,500,35);
			label4.setBounds(30,50,500,35);
			label5.setBounds(30,70,500 ,35);
			label6.setBounds(30,80,500 ,35);
			label7.setBounds(30,90,500 ,35);
			label4.setBounds(30,100,500 ,35);

			if (e.getSource() == Meds) {

				label1.setText(medication1);
				label2.setText(prescription1);
				label3.setText(sideEffects1);
				label4.setText(warning);
				label5.setText(medication2);
				label6.setText(prescription2);
				label7.setText(sideEffects2);

			}
			//set up action for radio buttons 
			/*if (action.getActionCommand().equals("View Medications"))
			{
				medicationsDisplay.append("\n" + "   " + medication1 + "\n");
				medicationsDisplay.append("\n" + "        " + prescription1);
				medicationsDisplay.append("\n" + "        " + sideEffects1);
				medicationsDisplay.append("\n" + "        " + warning + "\n" + "\n");
				
				medicationsDisplay.append("\n" + "   " + medication2 + "\n");
				medicationsDisplay.append("\n" + "        " + prescription2);
				medicationsDisplay.append("\n" + "        " + sideEffects2);
				medicationsDisplay.append("\n" + "        " + warning + "\n" + "\n");
			}*/
			
			
			
			//will clear information on screen
			if (e.getSource() == Return)
			{
				frame.dispose();
				Home home = new Home(name);

			}
		}

	}
