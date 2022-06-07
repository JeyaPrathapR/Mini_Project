package mini_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class CancelWindow extends JFrame {

	private JPanel cancelWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelWindow cancelFrame = new CancelWindow();
					cancelFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CancelWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 600);
		cancelWindow = new JPanel();
		cancelWindow.setBackground(Color.RED);
		cancelWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cancelWindow);
		
		// CANCEL WINDOW BUITTON DIRECTED TO HOME
		JButton cancelBtnOne = new JButton("HOME");
		cancelBtnOne.setForeground(Color.BLACK);
		cancelBtnOne.setBackground(Color.CYAN);
		cancelBtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeWindow homeWindow = new HomeWindow();
				homeWindow.setVisible(true);
				dispose();
			}
		});
		cancelBtnOne.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		cancelBtnOne.setHorizontalAlignment(cancelBtnOne.CENTER);
		
		// CANCEL WINDOW LABEL ONE TO DISPLAY THANKYOU
		JLabel cancelLabelOne = new JLabel("Thankyou For Visiting..........");
		cancelLabelOne.setForeground(Color.BLACK);
		cancelLabelOne.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		cancelLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		cancelLabelOne.setHorizontalAlignment(cancelLabelOne.CENTER);
		
		// WITHDRAW WINDOW LABEL TWO TO DISPLAY BELOW MSG
		JLabel cancelLabelTwo = new JLabel("Come Back When Ever You Need Me.....");
		cancelLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
		cancelLabelTwo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		GroupLayout gl_cancelWindow = new GroupLayout(cancelWindow);
		gl_cancelWindow.setHorizontalGroup(
			gl_cancelWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cancelWindow.createSequentialGroup()
					.addGap(344)
					.addComponent(cancelBtnOne, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(359))
				.addGroup(gl_cancelWindow.createSequentialGroup()
					.addGap(56)
					.addComponent(cancelLabelOne, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
					.addGap(147))
				.addGroup(Alignment.TRAILING, gl_cancelWindow.createSequentialGroup()
					.addGap(203)
					.addComponent(cancelLabelTwo, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
		);
		gl_cancelWindow.setVerticalGroup(
			gl_cancelWindow.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cancelWindow.createSequentialGroup()
					.addGap(21)
					.addComponent(cancelLabelOne, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cancelLabelTwo, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(85)
					.addComponent(cancelBtnOne, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addGap(146))
		);
		cancelWindow.setLayout(gl_cancelWindow);
		

	}
}
