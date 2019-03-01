package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;

public class w_loginEditPassword {

	private JFrame frmEditAPassword;
	private JTextField textField;
	private JLabel lblEnterTheNote;
	private JLabel lblEnterTheNew;
	private JLabel lblEditAPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void edit() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginEditPassword window = new w_loginEditPassword();
					window.frmEditAPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginEditPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditAPassword = new JFrame();
		frmEditAPassword.setResizable(false);
		frmEditAPassword.setTitle("Edit a Password!");
		frmEditAPassword.setBounds(300, 100, 900, 400);
		frmEditAPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditAPassword.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmEditAPassword.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_loginSuccess a=new w_loginSuccess();
				a.successfulLogin();
				frmEditAPassword.dispose();
				
			}
		});
		frmEditAPassword.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmEditAPassword.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(193, 145, 416, 20);
		frmEditAPassword.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Edit Password");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				String note = textField.getText();
				String pass=textField_1.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String ePass = zb.encryptAffine(pass,2192);
				//String encryptedPass = zb.encryptAffine(password,2192);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				String a=zc.editPassword(note,ePass);
				//zc.deletePassword2(a);
				*/
				String note = textField.getText();
				String pass=passwordField.getText();
				e_affineInspired zb=new e_affineInspired();
				String encryptedNote = zb.encryptAffine(note,2192);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				try {
					String a=zc.deletePassword(encryptedNote);
					zc.deletePassword2(a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//zc.saveNewPassword(encryptedPass);
				zc.saveNewUsername(encryptedNote);
				String encryptedPass = zb.encryptAffine(pass,2192);
				zc.saveNewPassword(encryptedPass);
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(273, 279, 254, 59);
		frmEditAPassword.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 165);
		frmEditAPassword.getContentPane().add(label);
		
		lblEnterTheNote = new JLabel("Enter the note of the password you want to change");
		lblEnterTheNote.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheNote.setBounds(193, 84, 416, 50);
		frmEditAPassword.getContentPane().add(lblEnterTheNote);
		
		lblEnterTheNew = new JLabel("Enter the new password you are editing");
		lblEnterTheNew.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheNew.setBounds(193, 176, 416, 50);
		frmEditAPassword.getContentPane().add(lblEnterTheNew);
		
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEditAPassword.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmEditAPassword.getContentPane().add(btnExit);
		
		lblEditAPassword = new JLabel("Edit a Password");
		lblEditAPassword.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblEditAPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditAPassword.setBounds(193, 47, 416, 26);
		frmEditAPassword.getContentPane().add(lblEditAPassword);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String note = textField.getText();
				String pass=passwordField.getText();
				e_affineInspired zb=new e_affineInspired();
				String encryptedNote = zb.encryptAffine(note,2192);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				try {
					String a=zc.deletePassword(encryptedNote);
					zc.deletePassword2(a);
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
				//zc.saveNewPassword(encryptedPass);
				zc.saveNewUsername(encryptedNote);
				String encryptedPass = zb.encryptAffine(pass,2192);
				zc.saveNewPassword(encryptedPass);
			}
		});
		passwordField.setBounds(193, 231, 416, 26);
		frmEditAPassword.getContentPane().add(passwordField);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
