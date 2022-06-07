package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class AtmWindowTwo extends JFrame {

	 JPanel atmWindowTwo; // light weight container
	 private static JTextField atmTwoTextFieldOne;
	 public static int amount = 0;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmWindowTwo frame = new AtmWindowTwo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AtmWindowTwo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		atmWindowTwo = new JPanel();
		atmWindowTwo.setForeground(Color.YELLOW);
		atmWindowTwo.setBackground(Color.MAGENTA);
		atmWindowTwo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(atmWindowTwo);
		
		//ATM WINDOW TWO WELCOME CUSTOMER 
		JLabel atmTwoLabelOne = new JLabel("Hello" +" " +AtmWindowOne.cName + " Welcome to Jeyaprathap Bank");
		atmTwoLabelOne.setBounds(23, 16, 1010, 73);
		atmTwoLabelOne.setForeground(Color.YELLOW);
		atmTwoLabelOne.setBackground(Color.BLACK);
		atmTwoLabelOne.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		atmTwoLabelOne.setHorizontalAlignment(atmTwoLabelOne.CENTER);
		
		
		//ATM WINDOW TWO ENTER AMOUNT LABEL
		JLabel atmTwoLabelTwo = new JLabel("Enter Amount:");
		atmTwoLabelTwo.setBounds(71, 104, 300, 44);
		atmTwoLabelTwo.setForeground(Color.YELLOW);
		atmTwoLabelTwo.setHorizontalAlignment(SwingConstants.RIGHT);
		atmTwoLabelTwo.setFont(new Font("Book Antiqua", Font.BOLD, 22));
		
		//ATM WINDOW TWO ENTER AMOUNT TEXTFIELD 
		atmTwoTextFieldOne = new JTextField();
		atmTwoTextFieldOne.setBounds(398, 100, 717, 56);
		atmTwoTextFieldOne.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		atmTwoTextFieldOne.setColumns(10);
		
		//ATM WINDOW TWO WITHDRAW VALIDATE AMOUNT AGAINST BALANCE VIA WITHDRAW BUTTON
		JButton atmTwoBtnOne = new JButton("Withdraw");
		atmTwoBtnOne.setBounds(126, 185, 220, 75);
		atmTwoBtnOne.setBackground(Color.ORANGE);
		atmTwoBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				amount = Integer.parseInt(atmTwoTextFieldOne.getText());
					
			 if(amount<=AtmWindowOne.balance) {							
				AtmWindowOne.balance =  AtmWindowOne.balance - amount;	
				WithdrawWindow withdrawWindow = new WithdrawWindow();
					withdrawWindow.setVisible(true);
			        dispose();
		       }
				else{
					JOptionPane.showMessageDialog(atmTwoBtnOne, "Please Enter valid amount or insufficient Balance");
				}
			}
		});
		
		atmTwoBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		//ATM WINDOW TWO DEPOSIT VALIDATE AMOUNT AGAINST BALANCE VIA DEPOSIT BUTTON
		JButton atmTwoBtnTwo = new JButton("Deposit");
		atmTwoBtnTwo.setBounds(126, 311, 220, 75);
		atmTwoBtnTwo.setBackground(Color.PINK);
		atmTwoBtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				amount = Integer.parseInt(atmTwoTextFieldOne.getText());
				
				if(amount>0) {
					AtmWindowOne.balance =  AtmWindowOne.balance + amount;
					DepositWindow depositWindow = new DepositWindow();
					depositWindow.setVisible(true);
					dispose();
		       }
				else {
					JOptionPane.showMessageDialog(atmTwoBtnOne, "Please Enter valid amount");
				}				
			}
		});
		atmTwoBtnTwo.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

		JButton atmTwoBtnFour = new JButton("Clear");
		atmTwoBtnFour.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		atmTwoBtnFour.setBackground(Color.ORANGE);
		atmTwoBtnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText("");
			}
		});
		atmTwoBtnFour.setBounds(868, 188, 230, 73);
		atmWindowTwo.add(atmTwoBtnFour);
		atmTwoBtnTwo.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
	
		//ATM WINDOW TWO CHECK BALANCE VIA BALANCE BUTTON
		JButton atmTwoBtnFive = new JButton("Balance");
		atmTwoBtnFive.setBounds(868, 310, 230, 75);
		atmTwoBtnFive.setBackground(Color.YELLOW);
		atmTwoBtnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
					     BalanceWindow balanceWindow = new BalanceWindow();
						 balanceWindow.setVisible(true);
						 dispose();			     
			}
		});
		atmTwoBtnFive.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		//ATM WINDOW TWO DIRECTED TO PREVIOUS WINDOW ATMWINDOWONE
		JButton atmTwoBtnThree = new JButton("Back");
		atmTwoBtnThree.setBounds(126, 437, 220, 73);
		atmTwoBtnThree.setBackground(Color.WHITE);
		atmTwoBtnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmWindowOne atmWindowOne = new AtmWindowOne();
				atmWindowOne.setVisible(true);
				dispose();
			}
		});
		atmTwoBtnThree.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		
		//ATM WINDOW TWO DIRECTED TO HOME WINDOW
		JButton atmTwoBtnSix = new JButton("Cancel");
		atmTwoBtnSix.setBounds(868, 437, 229, 73);
		atmTwoBtnSix.setBackground(Color.RED);
		atmTwoBtnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelWindow cancelWindow = new CancelWindow();
				cancelWindow.setVisible(true);
				dispose();
			}
		});
		atmTwoBtnSix.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		atmWindowTwo.setLayout(null);
		atmWindowTwo.add(atmTwoBtnThree);
		atmWindowTwo.add(atmTwoBtnSix);
		atmWindowTwo.add(atmTwoLabelOne);
		atmWindowTwo.add(atmTwoLabelTwo);
		atmWindowTwo.add(atmTwoBtnOne);
		atmWindowTwo.add(atmTwoBtnTwo);
		atmWindowTwo.add(atmTwoBtnFive);
		atmWindowTwo.add(atmTwoTextFieldOne);
				
		
		//ATM WINDOW TWO PRINT 1 IN TEXTFIELD
		JButton atmBtnOne = new JButton("1");
		atmBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt1) {
			atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "1");
				
		}
		});
		atmBtnOne.setFont(new Font("Script MT Bold", Font.PLAIN, 25));
		atmBtnOne.setBounds(436, 187, 79, 64);
		atmWindowTwo.add(atmBtnOne);
		
		//ATM WINDOW TWO PRINT 2 IN TEXTFIELD
		JButton atmBtnTwo = new JButton("2");
		atmBtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "2");
			}
		});
		atmBtnTwo.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnTwo.setBounds(557, 187, 79, 64);
		atmWindowTwo.add(atmBtnTwo);
		
		//ATM WINDOW TWO PRINT 3 IN TEXTFIELD
		JButton atmBtnThree = new JButton("3");		
		atmBtnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "3");
			}
		});
		atmBtnThree.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnThree.setBounds(688, 187, 79, 64);
		atmWindowTwo.add(atmBtnThree);
		
		//ATM WINDOW TWO PRINT 4 IN TEXTFIELD
		JButton atmBtnFour = new JButton("4");
		atmBtnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "4");
			}
		});
		atmBtnFour.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnFour.setBounds(436, 272, 79, 64);
		atmWindowTwo.add(atmBtnFour);
		
		//ATM WINDOW TWO PRINT 5 IN TEXTFIELD
		JButton atmBtnFive = new JButton("5");
		atmBtnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "5");
			}
		});
		atmBtnFive.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnFive.setBounds(557, 272, 79, 64);
		atmWindowTwo.add(atmBtnFive);
		
		//ATM WINDOW TWO PRINT 6 IN TEXTFIELD
		JButton atmBtnSix = new JButton("6");
		atmBtnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "6");
			}
		});
		atmBtnSix.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnSix.setBounds(688, 272, 79, 64);
		atmWindowTwo.add(atmBtnSix);
		
		//ATM WINDOW TWO PRINT 7 IN TEXTFIELD
		JButton atmBtnSeven = new JButton("7");
		atmBtnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "7");
			}
		});
		atmBtnSeven.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnSeven.setBounds(436, 360, 79, 64);
		atmWindowTwo.add(atmBtnSeven);
		
		//ATM WINDOW TWO PRINT 8 IN TEXTFIELD
		JButton atmBtnEight = new JButton("8");
		atmBtnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "8");
			}
		});
		atmBtnEight.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnEight.setBounds(557, 360, 79, 64);
		atmWindowTwo.add(atmBtnEight);
	
		//ATM WINDOW TWO PRINT SPACE IN TEXTFIELD
		JButton atmBtnNine = new JButton("Space");
		atmBtnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + " ");
			}
		});
		atmBtnNine.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		atmBtnNine.setBounds(436, 449, 79, 64);
		atmWindowTwo.add(atmBtnNine);
		
		//ATM WINDOW TWO PRINT 9 IN TEXTFIELD
		JButton atmBtnTen = new JButton("9");
		atmBtnTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "9");
			}
		});
		atmBtnTen.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnTen.setBounds(688, 360, 79, 64);
		atmWindowTwo.add(atmBtnTen);
		
		//ATM WINDOW TWO PRINT 0 IN TEXTFIELD
		JButton atmBtnEleven = new JButton("0");
		atmBtnEleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + "0");
			}
		});
		atmBtnEleven.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnEleven.setBounds(557, 446, 79, 64);
		atmWindowTwo.add(atmBtnEleven);
		
		//ATM WINDOW TWO PRINT . IN TEXTFIELD
		JButton atmBtnTwelve = new JButton(".");
		atmBtnTwelve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				atmTwoTextFieldOne.setText(atmTwoTextFieldOne.getText() + ".");		
			}
		});
		atmBtnTwelve.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		atmBtnTwelve.setBounds(688, 446, 79, 64);
		atmWindowTwo.add(atmBtnTwelve);
		
			
		
	}
}
