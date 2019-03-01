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
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class w_rwaEditStudent {

	private JFrame frmEditAStudents;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label_1;
	private JLabel lblEnterTheStudents;
	private JLabel lblEnterTheNew;

	/**
	 * Launch the application.
	 */
	public static void rwaedit() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaEditStudent window = new w_rwaEditStudent();
					window.frmEditAStudents.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaEditStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditAStudents = new JFrame();
		frmEditAStudents.setTitle("Edit a Students Password");
		frmEditAStudents.setResizable(false);
		frmEditAStudents.setBounds(300, 100, 900, 400);
		frmEditAStudents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditAStudents.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmEditAStudents.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaAdminRights a=new w_rwaAdminRights();
				a.adminrights();
				frmEditAStudents.dispose();
				
			}
		});
		
		
		frmEditAStudents.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmEditAStudents.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(219, 127, 433, 20);
		frmEditAStudents.getContentPane().add(textField);
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
					String a=zc.rwaDel(encryptedNote);
					zc.rwaDel2(a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//zc.saveNewPassword(encryptedPass);
				//zc.saveNewUsername(encryptedNote);
				//String encryptedPass = zb.encryptAffine(pass,2192);
				//zc.saveNewPassword(encryptedPass);
				
				zc.rwaAddStudentU(encryptedNote);
				String encryptedPass = zb.encryptAffine(pass,2192);
				zc.rwaAddStudentP(encryptedPass);
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(305, 234, 254, 59);
		frmEditAStudents.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(219, 190, 433, 20);
		frmEditAStudents.getContentPane().add(passwordField);
		
		JLabel lblEditAStudents = new JLabel("Edit a Students Password");
		lblEditAStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditAStudents.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblEditAStudents.setBounds(219, 47, 433, 33);
		frmEditAStudents.getContentPane().add(lblEditAStudents);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEditAStudents.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmEditAStudents.getContentPane().add(btnExit);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(709, 11, 165, 164);
		frmEditAStudents.getContentPane().add(label_1);
		
		lblEnterTheStudents = new JLabel("Enter the students username:");
		lblEnterTheStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheStudents.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheStudents.setBounds(219, 91, 433, 14);
		frmEditAStudents.getContentPane().add(lblEnterTheStudents);
		
		lblEnterTheNew = new JLabel("Enter the NEW password:");
		lblEnterTheNew.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheNew.setBounds(219, 158, 433, 14);
		frmEditAStudents.getContentPane().add(lblEnterTheNew);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
