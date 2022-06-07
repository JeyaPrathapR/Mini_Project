package mini_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AtmWindowOne extends JFrame {

	public static Object sOne = ""; //accessed globally
	public static Object sTwo = "";	
	public static String cName = "";
	public static int balance = 0;	
	
	JPanel atmWindowOne; // light weight container
	private JTextField atmOneTextFieldOne;
	private JPasswordField atmOneTextFieldTwo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmWindowOne atmFrameOne = new AtmWindowOne();
					atmFrameOne.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AtmWindowOne() {
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		atmWindowOne = new JPanel();
		atmWindowOne.setBackground(Color.GREEN);
		atmWindowOne.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(atmWindowOne);
		
		//ATM WINDOW ONE COMMON LABEL 
		JLabel atmOneLabelOne = new JLabel("WELCOME TO JP BANK "); //Jlabel display text
		atmOneLabelOne.setBounds(44, 0, 1072, 76);
		atmOneLabelOne.setForeground(Color.BLACK);
		atmOneLabelOne.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		atmOneLabelOne.setHorizontalAlignment(atmOneLabelOne.CENTER);
		
		
		//ATM WINDOW ONE CARD NO LABEL 
		JLabel atmOneLabelTwo = new JLabel("Card Number :");
		atmOneLabelTwo.setBounds(130, 87, 341, 58);
		atmOneLabelTwo.setForeground(Color.BLACK);
		atmOneLabelTwo.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		atmOneLabelTwo.setHorizontalAlignment(atmOneLabelTwo.CENTER);
		
		//ATM WINDOW ONE CARD NO TEXTFIELD
		atmOneTextFieldOne = new JTextField();
		atmOneTextFieldOne.setBounds(481, 87, 519, 64);
		atmOneTextFieldOne.setForeground(Color.BLACK);
		atmOneTextFieldOne.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		atmOneTextFieldOne.setColumns(10);
		
		//ATM WINDOW ONE PASSWORD LABEL
		JLabel atmOneLabelThree = new JLabel("Password:");
		atmOneLabelThree.setBounds(130, 166, 341, 64);
		atmOneLabelThree.setForeground(Color.BLACK);
		atmOneLabelThree.setHorizontalAlignment(SwingConstants.CENTER);
		atmOneLabelThree.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		
		//ATM WINDOW PASSWORD FIELD
		atmOneTextFieldTwo = new JPasswordField();
		atmOneTextFieldTwo.setBounds(481, 168, 519, 64);
		atmOneTextFieldTwo.setEchoChar('*');
		atmOneTextFieldTwo.setColumns(10);
		atmOneTextFieldTwo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		//ATM WINDOW VALIDATE PASSWORD AND CARNO ENTER BUTTON
		JButton atmOneBtnOne = new JButton("Enter");
		atmOneBtnOne.setBounds(212, 306, 277, 81);
		atmOneBtnOne.setBackground(Color.MAGENTA);
		atmOneBtnOne.setForeground(new Color(0, 0, 0));
		atmOneBtnOne.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				 sOne = atmOneTextFieldOne.getText(); //stored in the normal text field in object sOne
				 sTwo = atmOneTextFieldTwo.getText(); //stored in the password text field in object sOne
				
				 //Check for the card no and password validation
				 
				if(sOne.equals("123 456 789") && sTwo.equals("789")) {
					
					balance = 3000;
					cName = "HARI";
					JOptionPane.showMessageDialog(atmOneBtnOne, "Password Entered successfully");
					AtmWindowTwo atmWindowTwo = new AtmWindowTwo();
					atmWindowTwo.setVisible(true);
					dispose();
				}
				
				else if(sOne.equals("987 654 321") && sTwo.equals("321"))
				{
					balance = 5000;
					cName = "SAJITHA";
					JOptionPane.showMessageDialog(atmOneBtnOne, "Password Entered successfully");
					AtmWindowTwo atmWindowTwo = new AtmWindowTwo();
					atmWindowTwo.setVisible(true);
					dispose();
				}
				else
				{
					//Pop up standard dialogue box
					JOptionPane.showMessageDialog(atmOneBtnOne, "Please Enter valid Card Number or Password");
				}
				
				
			}
		});
		atmOneBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		//ATM WINDOW ONE CLEAR TEXT FIELD
		JButton atmOneBtnTwo = new JButton("Clear");
		atmOneBtnTwo.setBounds(813, 306, 260, 81);
		atmOneBtnTwo.setBackground(Color.ORANGE);
		atmOneBtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmOneTextFieldOne.setText("");
			}
		});
		atmOneBtnTwo.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		//ATM WINDOW ONE BACK BUTTON TO DIRECTED BEFORE WINDOW
		JButton atmOneBtnThree = new JButton("Back");
		atmOneBtnThree.setBounds(212, 450, 277, 81);
		atmOneBtnThree.setBackground(Color.WHITE);
		atmOneBtnThree.setForeground(new Color(0, 0, 0));
		atmOneBtnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeWindow homeWindow = new HomeWindow();
				homeWindow.setVisible(true);
				dispose();
			}
		});
		atmOneBtnThree.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
	
		
		//ATM WINDOW ONE CANCEL DIRECTED TO HOME WINDOW
		JButton atmOneBtnFour = new JButton("Cancel");
		atmOneBtnFour.setBounds(813, 450, 260, 81);
		atmOneBtnFour.setBackground(Color.RED);
		atmOneBtnFour.setForeground(new Color(0, 0, 0));
		atmOneBtnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelWindow cancelWindow = new CancelWindow();
				cancelWindow.setVisible(true);
				dispose();
			}
		});
		atmOneBtnFour.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		atmWindowOne.setLayout(null);
		atmWindowOne.add(atmOneLabelOne);
		atmWindowOne.add(atmOneBtnOne);
		atmWindowOne.add(atmOneBtnTwo);
		atmWindowOne.add(atmOneBtnThree);
		atmWindowOne.add(atmOneBtnFour);
		atmWindowOne.add(atmOneLabelThree);
		atmWindowOne.add(atmOneTextFieldTwo);
		atmWindowOne.add(atmOneLabelTwo);
		atmWindowOne.add(atmOneTextFieldOne);
		
						
	}
}
