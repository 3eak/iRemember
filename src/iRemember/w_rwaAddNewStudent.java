package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class w_rwaAddNewStudent {

	private JFrame frmAddANew;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void rwanewS() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaAddNewStudent window = new w_rwaAddNewStudent();
					window.frmAddANew.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaAddNewStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddANew = new JFrame();
		frmAddANew.setResizable(false);
		frmAddANew.setTitle("Add a New Student");
		frmAddANew.setBounds(300, 100, 900, 400);
		frmAddANew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddANew.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
	
	JButton btnBack = new JButton("back");
	btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnBack.setBackground(SystemColor.text);
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_rwaAdminRights b=new w_rwaAdminRights();
			b.adminrights();
			frmAddANew.dispose();
		}
	});
	frmAddANew.getContentPane().setLayout(null);
	btnBack.setBounds(10, 11, 127, 50);
	frmAddANew.getContentPane().add(btnBack);
	
	textField = new JTextField();
	textField.setBounds(20, 156, 639, 20);
	frmAddANew.getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(20, 238, 639, 20);
	frmAddANew.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JButton btnAdd = new JButton("Add");
	btnAdd.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnAdd.setBackground(Color.WHITE);
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String user = textField.getText();
			e_affineInspired zb=new e_affineInspired();
			String password=textField_1.getText();
			String encryptedUser = zb.encryptAffine(user,2192);
			String encryptedPass = zb.encryptAffine(password,2192);
			t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
			zc.rwaAddStudentU(encryptedUser);
			zc.rwaAddStudentP(encryptedPass);
		}
	});
	btnAdd.setBounds(255, 269, 160, 56);
	frmAddANew.getContentPane().add(btnAdd);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
	label.setBounds(714, 11, 160, 165);
	frmAddANew.getContentPane().add(label);
	
	JLabel lblAddANote = new JLabel("Student Username Addition: Make sure it is in the format (forename,surname,year,form)");
	lblAddANote.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	lblAddANote.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddANote.setBounds(20, 103, 639, 42);
	frmAddANew.getContentPane().add(lblAddANote);
	
	JLabel lblAddYourPassword = new JLabel("Add a password for the student. This will be encrypted and found in a text file in the iRemember directory");
	lblAddYourPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	lblAddYourPassword.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddYourPassword.setBounds(20, 201, 639, 26);
	frmAddANew.getContentPane().add(lblAddYourPassword);
	
	JButton btnExit = new JButton("exit");
	btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnExit.setBackground(SystemColor.text);
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frmAddANew.dispose();
		}
	});
	btnExit.setBounds(736, 298, 138, 52);
	frmAddANew.getContentPane().add(btnExit);
	
	}
}
