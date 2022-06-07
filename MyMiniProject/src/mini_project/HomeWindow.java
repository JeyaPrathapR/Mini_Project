package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HomeWindow extends JFrame {

	private JPanel homeFrame; //Only used with in class

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeWindow homeFrame = new HomeWindow();
					homeFrame.setVisible(true);	//show or hide Window depend upon parametrer
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	/**
	 * Create the frame.
	 */
	public HomeWindow() {
		// home main Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		homeFrame = new JPanel(); //Creates a new JPanel.
		homeFrame.setBackground(Color.CYAN);
		homeFrame.setForeground(Color.YELLOW);
		setContentPane(homeFrame);	//contentPane the contentPane object for this frame
		
		//Home label one
		JLabel homeLabelOne = new JLabel("WELCOME TO JEYAPRATHAP ATM SERVICE"); //display text or image
		homeLabelOne.setForeground(Color.RED);
		homeLabelOne.setBackground(Color.YELLOW);
		homeLabelOne.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		homeLabelOne.setHorizontalAlignment(homeLabelOne.CENTER);
		
		//Home label two
		JLabel homeLabelTwo = new JLabel("Select the service .....");
		homeLabelTwo.setForeground(Color.BLACK);
		homeLabelTwo.setFont(new Font("Times New Roman", Font.BOLD, 35));
		homeLabelTwo.setHorizontalAlignment(homeLabelTwo.CENTER);
		
		//Home Button One
		JButton homeBtnOne = new JButton("ATM SERVICE"); // An implementation of a "push" button. 
		homeBtnOne.setBackground(Color.BLUE);
		homeBtnOne.setForeground(Color.WHITE);
		homeBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmWindowOne awo = new AtmWindowOne();
				awo.setVisible(true);
				dispose();
			}
		});
		homeBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		GroupLayout gl_homeFrame = new GroupLayout(homeFrame);
		gl_homeFrame.setHorizontalGroup(
			gl_homeFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_homeFrame.createSequentialGroup()
					.addGap(142)
					.addComponent(homeLabelTwo, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
					.addGap(174))
				.addGroup(gl_homeFrame.createSequentialGroup()
					.addGap(285)
					.addComponent(homeBtnOne, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
					.addGap(319))
				.addGroup(gl_homeFrame.createSequentialGroup()
					.addGap(27)
					.addComponent(homeLabelOne, GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
					.addGap(24))
		);
		gl_homeFrame.setVerticalGroup(
			gl_homeFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_homeFrame.createSequentialGroup()
					.addGap(26)
					.addComponent(homeLabelOne, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(homeLabelTwo, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(58)
					.addComponent(homeBtnOne, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(145))
		);
		homeFrame.setLayout(gl_homeFrame);
		
				
		
		
	}
}
