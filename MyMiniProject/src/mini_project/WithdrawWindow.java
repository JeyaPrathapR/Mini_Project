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

public class WithdrawWindow extends JFrame {

	private JPanel withdrawWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawWindow withdrawFrame = new WithdrawWindow();
					withdrawFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WithdrawWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		withdrawWindow = new JPanel();
		withdrawWindow.setBackground(Color.ORANGE);
		withdrawWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(withdrawWindow);
		
		// WITHDRAW WINDOW LABEL ONE TO DISPLAY DEPOSIT AMOUNT
		JLabel withdrawWindowLabelOne = new JLabel("You Withdrawn " +AtmWindowTwo.amount + " Successfully");
		withdrawWindowLabelOne.setForeground(Color.BLACK);
		withdrawWindowLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		withdrawWindowLabelOne.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		// WITHDRAW WINDOW DIRECTED TO PREVIOUS WINDOW
		JButton withdrawBtnOne = new JButton("Back");
		withdrawBtnOne.setBackground(Color.WHITE);
		withdrawBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmWindowTwo atmWindowTwo = new AtmWindowTwo();
				atmWindowTwo.setVisible(true);
				dispose();
			}
		});
		withdrawBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		GroupLayout gl_withdrawWindow = new GroupLayout(withdrawWindow);
		gl_withdrawWindow.setHorizontalGroup(
			gl_withdrawWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_withdrawWindow.createSequentialGroup()
					.addGap(90)
					.addComponent(withdrawWindowLabelOne, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
					.addGap(110))
				.addGroup(gl_withdrawWindow.createSequentialGroup()
					.addGap(348)
					.addComponent(withdrawBtnOne, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(350))
		);
		gl_withdrawWindow.setVerticalGroup(
			gl_withdrawWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_withdrawWindow.createSequentialGroup()
					.addGap(71)
					.addComponent(withdrawWindowLabelOne, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(116)
					.addComponent(withdrawBtnOne, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addGap(138))
		);
		withdrawWindow.setLayout(gl_withdrawWindow);
		
	}

}
