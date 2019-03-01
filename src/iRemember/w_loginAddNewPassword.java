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
import javax.swing.JPasswordField;

public class w_loginAddNewPassword {

	private JFrame frmAddANew;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void addNewPass() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginAddNewPassword window = new w_loginAddNewPassword();
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
	public w_loginAddNewPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddANew = new JFrame();
		frmAddANew.setResizable(false);
		frmAddANew.setTitle("Add a New Password!");
		frmAddANew.setBounds(300, 100, 900, 400);
		frmAddANew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddANew.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
	
	JButton btnBack = new JButton("back");
	btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnBack.setBackground(SystemColor.text);
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_loginSuccess b=new w_loginSuccess();
			b.successfulLogin();
			frmAddANew.dispose();
			
		}
	});
	frmAddANew.getContentPane().setLayout(null);
	btnBack.setBounds(10, 11, 127, 50);
	frmAddANew.getContentPane().add(btnBack);
	
	textField = new JTextField();
	textField.setBounds(127, 161, 505, 20);
	frmAddANew.getContentPane().add(textField);
	textField.setColumns(10);
	
	JButton btnAdd = new JButton("Add");
	btnAdd.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnAdd.setBackground(Color.WHITE);
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String note = textField.getText();
			e_affineInspired zb=new e_affineInspired();
			String password=passwordField.getText();
			String encryptedNote = zb.encryptAffine(note,2192);
			String encryptedPass = zb.encryptAffine(password,2192);
			t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
			zc.saveNewUsername(encryptedNote);
			zc.saveNewPassword(encryptedPass);
			
			
			//label.setText("Encrypted Message = "+ encrypted);
			
			
			
			
		}
	});
	btnAdd.setBounds(297, 287, 169, 63);
	frmAddANew.getContentPane().add(btnAdd);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
	label.setBounds(714, 11, 160, 165);
	frmAddANew.getContentPane().add(label);
	
	JLabel lblAddANote = new JLabel("Add a note for your password, you will need to remember this when retrieving your password.  (E.g Google)");
	lblAddANote.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	lblAddANote.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddANote.setBounds(65, 94, 639, 56);
	frmAddANew.getContentPane().add(lblAddANote);
	
	JLabel lblAddYourPassword = new JLabel("Add your password. This will be encrypted and found in a text file in the iRemember directory");
	lblAddYourPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	lblAddYourPassword.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddYourPassword.setBounds(65, 206, 639, 14);
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
	
	JLabel lblAddAPassword = new JLabel("Add a Password");
	lblAddAPassword.setFont(new Font("Myriad Pro", Font.BOLD, 18));
	lblAddAPassword.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddAPassword.setBounds(127, 55, 505, 28);
	frmAddANew.getContentPane().add(lblAddAPassword);
	
	passwordField = new JPasswordField();
	passwordField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String note = textField.getText();
			e_affineInspired zb=new e_affineInspired();
			String password=passwordField.getText();
			String encryptedNote = zb.encryptAffine(note,2192);
			String encryptedPass = zb.encryptAffine(password,2192);
			t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
			zc.saveNewUsername(encryptedNote);
			zc.saveNewPassword(encryptedPass);
		}
	});
	passwordField.setBounds(127, 237, 505, 20);
	frmAddANew.getContentPane().add(passwordField);
	
	}
}
