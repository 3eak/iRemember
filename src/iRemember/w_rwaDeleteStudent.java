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
import javax.swing.SwingConstants;
import java.awt.Font;

public class w_rwaDeleteStudent {

	private JFrame frmDeleteAStudent;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void rwadel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaDeleteStudent window = new w_rwaDeleteStudent();
					window.frmDeleteAStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaDeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteAStudent = new JFrame();
		frmDeleteAStudent.setResizable(false);
		frmDeleteAStudent.setTitle("Delete a Student");
		frmDeleteAStudent.setBounds(300, 100, 900, 350);
		frmDeleteAStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteAStudent.getContentPane().setLayout(null);
		frmDeleteAStudent.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaAdminRights a=new w_rwaAdminRights();
				a.adminrights();
				frmDeleteAStudent.dispose();
				
			}
		});
		frmDeleteAStudent.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmDeleteAStudent.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(279, 158, 340, 20);
		frmDeleteAStudent.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDeletePasswordAnd = new JButton("Delete Student");
		btnDeletePasswordAnd.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnDeletePasswordAnd.setBackground(Color.WHITE);
		btnDeletePasswordAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String note = textField.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2192);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				try {
					String a=zc.rwaDel(encryptedNote);
					zc.rwaDel2(a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//zc.saveNewPassword(encryptedPass);
				
				
				
				
			}
		});
		btnDeletePasswordAnd.setBounds(342, 189, 219, 60);
		frmDeleteAStudent.getContentPane().add(btnDeletePasswordAnd);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 151);
		frmDeleteAStudent.getContentPane().add(label);
		
		JLabel lblDeleteAStudent = new JLabel("Delete a Student");
		lblDeleteAStudent.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblDeleteAStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteAStudent.setBounds(279, 29, 340, 32);
		frmDeleteAStudent.getContentPane().add(lblDeleteAStudent);
		
		JLabel lblEnterTheUsername = new JLabel("Enter the username of the student");
		lblEnterTheUsername.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheUsername.setBounds(279, 118, 340, 14);
		frmDeleteAStudent.getContentPane().add(lblEnterTheUsername);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteAStudent.dispose();
			}
		});
		btnExit.setBounds(736, 248, 138, 52);
		frmDeleteAStudent.getContentPane().add(btnExit);
		
	
	}
}
