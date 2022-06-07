package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class DepositWindow extends JFrame {

	private JPanel depositWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositWindow frame = new DepositWindow();
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
	public DepositWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		depositWindow = new JPanel();
		depositWindow.setForeground(Color.MAGENTA);
		depositWindow.setBackground(Color.PINK);
		depositWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(depositWindow);
		
		// DEPOSIT WINDOW LABEL ONE TO DISPLAY WITHDRAWN AMOUNT
		JLabel depositLabelOne = new JLabel("You Deposit " +AtmWindowTwo.amount + " Successfully");
		depositLabelOne.setForeground(Color.YELLOW);
		depositLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		depositLabelOne.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		// DEPOSIT WINDOW DIRECTED BACK TO PREVIOUS WINDOW
		JButton depositBtnOne = new JButton("Back");
		depositBtnOne.setBackground(Color.WHITE);
		depositBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmWindowTwo atmWindowTwo = new AtmWindowTwo();
				atmWindowTwo.setVisible(true);
				dispose();
			}
		});
		depositBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		GroupLayout gl_depositWindow = new GroupLayout(depositWindow);
		gl_depositWindow.setHorizontalGroup(
			gl_depositWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_depositWindow.createSequentialGroup()
					.addGap(90)
					.addComponent(depositLabelOne, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
					.addGap(110))
				.addGroup(gl_depositWindow.createSequentialGroup()
					.addGap(341)
					.addComponent(depositBtnOne, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(357))
		);
		gl_depositWindow.setVerticalGroup(
			gl_depositWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_depositWindow.createSequentialGroup()
					.addGap(71)
					.addComponent(depositLabelOne, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(101)
					.addComponent(depositBtnOne, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addGap(153))
		);
		depositWindow.setLayout(gl_depositWindow);
		
		
		
		
	}

}
