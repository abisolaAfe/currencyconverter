import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;



   public class farme extends JFrame implements ActionListener {
	ImageIcon myImage = new ImageIcon("Smiley.png");
	JButton button; 
	ConversionClass list = new ConversionClass();
	JComboBox comboBox;
	JComboBox comboBox2;
	 JTextField textfield;
	JLabel label;
	JPanel panel;
	 //Currency NewA;
	//Currency NewB;
	 int num;
	
	 Currency[ ]  temp = new Currency [2] ;
	 int [ ]  textF = new int  [1] ;
	
	 
	 public farme(){
		 panel = new JPanel();
		 panel.setPreferredSize(new Dimension(750,750));
		 panel.setLayout(null);
		
		 panel.setBackground(new Color(110,50,157));
		 button 	= new JButton();
		 button.setBounds(350, 400, 100, 50);
		 //button.setPreferredSize(new Dimension(100,50));
		 button.addActionListener(this);
		 button.setText("Convert");
		 button.setFocusable(false);
		 button.setForeground(new Color(100,200,80));
		 textfield = new JTextField();
		 
		// textfield.setPreferredSize(new Dimension(250,40));
		 textfield.setText("Enter Amount");
		textfield.setBounds(350, 200, 100, 50);
		textfield.setFont(new Font("Comic Sans", Font.BOLD,15));
		 textfield.addActionListener(this);
		  label = new JLabel();
		 label.setBounds(320, 500, 250, 50);
		 label.setFont(new Font( "Comic Sans", Font.BOLD,30));
		 label.setForeground(new Color(90,205,80));
		//label.addActionListener(this);
		 this.setDefaultCloseOperation(farme.EXIT_ON_CLOSE);
		this.setSize(750, 750);
		this.setVisible(true); 
		this.setIconImage(myImage .getImage());
		this.setTitle("This is a currency converter application ");
		this.setFont(new Font( "Comic Sans", Font.BOLD,45));
		this.getContentPane().setBackground(new Color(100,50,157));
		
		//this.setLayout(new FlowLayout());
		panel.add(button);
		panel.add(textfield);
		panel.add(label);
		this.add(panel);
		//this.pack();
		this.setVisible(true);
		this.pack();
		//this.setLayout(null);
		//this.add(button);
		//this.add(textfield);
		//this.setVisible(true); 
		//this.add(label);
		
		//this.setVisible(true); 
		//this.pack();
		String[ ] notes =  {"Naira","JPY","EUR","POUND","AUD","BAM","CAD",
				"RUPEE","MYR","NOK","KGS","FRANC","PESO","RIYAL","BND",
				"RAND","CEDI","NAD","HAF","JMD"} ;
		String[ ] notes2 =  {"Naira","JPY","EUR","POUND","AUD","BAM","CAD",
				"RUPEE","MYR","NOK","KGS","FRANC","PESO","RIYAL","BND",
				"RAND","CEDI","NAD","HAF","JMD"} ;
		 comboBox = new JComboBox(notes);
		 comboBox.setEditable(true);
		 //comboBox.setPreferredSize(new Dimension(100,50));
		 comboBox.setBounds(350, 100, 100, 50);
		 comboBox2 = new JComboBox(notes2);
		 comboBox2.setBounds(350, 300, 100, 50);
		 comboBox2.setPreferredSize(new Dimension(100,50));
		 comboBox2.setEditable(true);
		this.add(comboBox);
		panel.add(comboBox);
		panel.setVisible(true);
		this.setVisible(true); 
		comboBox.addActionListener(this);
		panel.add(comboBox2);
		panel.setVisible(true);
		this.setVisible(true); 
		comboBox2.addActionListener(this);
		//this.pack();
		
		
		
		//ArrayList<Currency > temp = new ArrayList<Currency>();
		//Action X = textfield.getAction();
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox ) {
    	  String S =  (String) comboBox.getSelectedItem();
    	    temp[0] = list.getCurrency(S);
    	  //System.out.println(temp[0].toString());
        }
	   
        if (e.getSource()==comboBox2) {
    	 String S2 =  (String) comboBox2.getSelectedItem()	; 
    	   temp[1] = list.getCurrency(S2);
    	//System.out.println(temp[1].toString());
        } 
		
        if (e.getSource()== button) {
      textF[0]	=  Integer.parseInt(textfield.getText());
      //System.out.println (textF[0]);
        }
	
        if (e.getSource()== button) {	
        Currency Have = temp[0];
        Currency Want = temp[1];
       int N = textF[0]; 
       double x =   (   list.convertcurrencies(Have,Want,N));
    	String XX = (" " + x);
    	label.setText(XX);
    	label.setVisible(true);
    	//this.setVisible(true);
    	}
		//System.out.println (	textF[0]);
	}
        
		
        }
