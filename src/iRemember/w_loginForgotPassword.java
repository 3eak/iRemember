package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class w_loginForgotPassword {

	private JFrame frmForgottenYourDetails;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void forgot() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginForgotPassword window = new w_loginForgotPassword();
					window.frmForgottenYourDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginForgotPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmForgottenYourDetails = new JFrame();
		frmForgottenYourDetails.setTitle("Forgotten your Details?");
		frmForgottenYourDetails.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmForgottenYourDetails.setResizable(false);
		frmForgottenYourDetails.setBounds(475, 125, 550, 350);
		frmForgottenYourDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmForgottenYourDetails.getContentPane().setLayout(null);
		
		JLabel lblToKeepYour = new JLabel("To keep YOUR DATA secure, we reset your passwords when you reset your password!");
		lblToKeepYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblToKeepYour.setFont(new Font("Myriad Pro", Font.BOLD, 14));
		lblToKeepYour.setBounds(10, 42, 524, 14);
		frmForgottenYourDetails.getContentPane().add(lblToKeepYour);
		
		textField = new JTextField();
		textField.setBounds(140, 101, 273, 20);
		frmForgottenYourDetails.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 155, 273, 20);
		frmForgottenYourDetails.getContentPane().add(passwordField);
		
		JLabel lblEnterNewUsername = new JLabel("Enter New Username");
		lblEnterNewUsername.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterNewUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNewUsername.setBounds(140, 76, 273, 14);
		frmForgottenYourDetails.getContentPane().add(lblEnterNewUsername);
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password");
		lblEnterNewPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNewPassword.setBounds(140, 132, 273, 14);
		frmForgottenYourDetails.getContentPane().add(lblEnterNewPassword);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_login a = new t_login();
				String user=textField.getText();
				String pass=passwordField.getText();
				a.createLogin(user, pass);
				frmForgottenYourDetails.dispose();
				
			}
		});
		btnReset.setBackground(Color.WHITE);
		btnReset.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnReset.setBounds(213, 186, 125, 39);
		frmForgottenYourDetails.getContentPane().add(btnReset);
		
		JLabel lblReminderThisWill = new JLabel("REMINDER! THIS WILL DELETE ALL EXISTING PASSWORDS AND NOTES!");
		lblReminderThisWill.setHorizontalAlignment(SwingConstants.CENTER);
		lblReminderThisWill.setFont(new Font("Myriad Pro", Font.BOLD, 16));
		lblReminderThisWill.setBounds(10, 236, 524, 39);
		frmForgottenYourDetails.getContentPane().add(lblReminderThisWill);
		
		JButton btnNewButton = new JButton("close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmForgottenYourDetails.dispose();
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(415, 271, 119, 39);
		frmForgottenYourDetails.getContentPane().add(btnNewButton);
	}
}
