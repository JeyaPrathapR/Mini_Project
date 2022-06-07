package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class BalanceWindow extends JFrame {

	private JPanel balanceWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalanceWindow frame = new BalanceWindow();
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
	public BalanceWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		balanceWindow = new JPanel();
		balanceWindow.setBackground(Color.YELLOW);
		balanceWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(balanceWindow);
		
		// BALANCE WINDOW LABEL ONE TO DISPLAY BALANCE
		JLabel balanceWindowLabelOne = new JLabel("Your Current Balance is" + " : " + AtmWindowOne.balance);
		balanceWindowLabelOne.setForeground(Color.RED);
		balanceWindowLabelOne.setFont(new Font("Times New Roman", Font.BOLD, 30));
		balanceWindowLabelOne.setHorizontalAlignment(balanceWindowLabelOne.CENTER);
		
		// BALANCE WINDOW DIERECTED BACK TO PREVIOUS WINDOW
		JButton balanceBtnOne = new JButton("Back");
		balanceBtnOne.setBackground(Color.WHITE);
		balanceBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmWindowTwo atmWindowTwo = new AtmWindowTwo();
				atmWindowTwo.setVisible(true);
				dispose();
			}
		});
		balanceBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		// BALANCE WINDOW DIERECTED TO HOMW WINDOW
		JButton balanceBtnTwo = new JButton("Cancel");
		balanceBtnTwo.setBackground(Color.RED);
		balanceBtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelWindow cancelWindow = new CancelWindow();
				cancelWindow.setVisible(true);
				dispose();
			}
		});
		balanceBtnTwo.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		GroupLayout gl_balanceWindow = new GroupLayout(balanceWindow);
		gl_balanceWindow.setHorizontalGroup(
			gl_balanceWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_balanceWindow.createSequentialGroup()
					.addGap(92)
					.addComponent(balanceWindowLabelOne, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
					.addGap(108))
				.addGroup(gl_balanceWindow.createSequentialGroup()
					.addGap(163)
					.addComponent(balanceBtnOne, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addGap(208)
					.addComponent(balanceBtnTwo, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(173))
		);
		gl_balanceWindow.setVerticalGroup(
			gl_balanceWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_balanceWindow.createSequentialGroup()
					.addGap(58)
					.addComponent(balanceWindowLabelOne, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(92)
					.addGroup(gl_balanceWindow.createParallelGroup(Alignment.BASELINE)
						.addComponent(balanceBtnTwo, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
						.addComponent(balanceBtnOne, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
					.addGap(175))
		);
		balanceWindow.setLayout(gl_balanceWindow);
		
		
	}
}

