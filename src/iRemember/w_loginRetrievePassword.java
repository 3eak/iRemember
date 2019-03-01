package iRemember;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class w_loginRetrievePassword {

	private JFrame frmRetrieveAPassword;
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblTypeTheNote;
	private JLabel lblRetrieveAPassword;
	/**
	 * Launch the application.
	 */
	public static void retrieve() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginRetrievePassword window = new w_loginRetrievePassword();
					window.frmRetrieveAPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginRetrievePassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRetrieveAPassword = new JFrame();
		frmRetrieveAPassword.setResizable(false);
		frmRetrieveAPassword.setTitle("Retrieve a Password!");
		frmRetrieveAPassword.setBounds(300, 100, 900, 400);
		frmRetrieveAPassword.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmRetrieveAPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRetrieveAPassword.getContentPane().setLayout(null);
		
		
		
		JButton btnAddNewPassword = new JButton("back");
		btnAddNewPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnAddNewPassword.setBackground(Color.WHITE);
		btnAddNewPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_loginSuccess a=new w_loginSuccess();
				a.successfulLogin();
				frmRetrieveAPassword.dispose();
				
				
			}
		});
		btnAddNewPassword.setBounds(10, 11, 157, 50);
		frmRetrieveAPassword.getContentPane().add(btnAddNewPassword);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String note = textField.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2969);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				String retrieve = zc.retrievePassword(encryptedNote);
				label.setText("Your password: "+retrieve);
				
				//zc.saveNewPassword(encryptedPass);
				
				
			}
		});
		textField.setBounds(209, 178, 439, 20);
		frmRetrieveAPassword.getContentPane().add(textField);
		textField.setColumns(10);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(31, 289, 486, 14);
		frmRetrieveAPassword.getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\javakek\\iRemember\\bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(709, 11, 165, 164);
		frmRetrieveAPassword.getContentPane().add(label_1);
		
		lblTypeTheNote = new JLabel("Type the note you assigned to your password when you added it into the system");
		lblTypeTheNote.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblTypeTheNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeTheNote.setBounds(182, 129, 497, 25);
		frmRetrieveAPassword.getContentPane().add(lblTypeTheNote);
		
		JButton btnNewButton = new JButton("Retrieve");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String note = textField.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2969);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				String retrieve = zc.retrievePassword(encryptedNote);
				label.setText("Your password: "+retrieve);
				
				
			}
		});
		btnNewButton.setBounds(336, 219, 200, 69);
		frmRetrieveAPassword.getContentPane().add(btnNewButton);
		
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRetrieveAPassword.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmRetrieveAPassword.getContentPane().add(btnExit);
		
		lblRetrieveAPassword = new JLabel("Retrieve a Password");
		lblRetrieveAPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetrieveAPassword.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblRetrieveAPassword.setBounds(209, 66, 439, 32);
		frmRetrieveAPassword.getContentPane().add(lblRetrieveAPassword);
	}
}
