package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;


//for simplicity i have used the term CCM for CaesarCipherMulti

public class w_testCCM {

	private JFrame frame1;
	private JTextField textField;
	private JTextField txtExampleKey;
	private JLabel lblNewLabel; 
	private JLabel lblCheck;
	private JTextField textField_1;
	private JTextField txtExamplekey;
	private JLabel lblNewLabel_1;
	private JLabel lblEnterAKey_1;
	private JLabel label;
	private JLabel label_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void caesar3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testCCM window1 = new w_testCCM();
					window1.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_testCCM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setTitle("Test Caesar Cipher Multi!");
		frame1.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frame1.setResizable(false);
		frame1.getContentPane().setBackground(SystemColor.control);
		frame1.setBounds(300, 100, 900, 400);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_testEncryptionMenu za=new w_testEncryptionMenu();
				za.newscreen();
				frame1.dispose();
			}
		});
		btnBack.setBounds(10, 11,127, 50);
		frame1.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = textField.getText();
				String key=txtExampleKey.getText();
				e_caesarCipherMulti zb=new e_caesarCipherMulti();
				String encrypted = zb.savenewpasstwo(encryptMe,key);
				lblNewLabel.setText("Encrypted Message = " +encrypted);
				
				
				
				
			}
		});
		textField.setBounds(24, 138, 268, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtExampleKey = new JTextField();
		txtExampleKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		txtExampleKey.setText("exampleKey");
		txtExampleKey.setBounds(316, 138, 123, 20);
		frame1.getContentPane().add(txtExampleKey);
		txtExampleKey.setColumns(10);
		
		JLabel lblEncrypytAMessage = new JLabel("Encrypyt a Message!");
		lblEncrypytAMessage.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblEncrypytAMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncrypytAMessage.setBounds(24, 104, 268, 14);
		frame1.getContentPane().add(lblEncrypytAMessage);
		
		JLabel lblEnterAKey = new JLabel("Enter a Key!");
		lblEnterAKey.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblEnterAKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAKey.setBounds(315, 208, 124, 14);
		frame1.getContentPane().add(lblEnterAKey);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 169, 414, 28);
		frame1.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decryptMe = textField_1.getText();
				String key=txtExamplekey.getText();
				e_caesarCipherMulti ze=new e_caesarCipherMulti();
				String decrypted = ze.decryptNewPassTwoTeach(decryptMe,key);
				label.setText("Decrypted Message = " +decrypted);
				
				
				
			}
		});
		textField_1.setBounds(24, 239, 268, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtExamplekey = new JTextField();
		txtExamplekey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtExamplekey.setText("exampleKey");
		txtExamplekey.setBounds(315, 239, 123, 20);
		frame1.getContentPane().add(txtExamplekey);
		txtExamplekey.setColumns(10);
		
		JLabel lblDecryptAMessage = new JLabel("Decrypt a Message!");
		lblDecryptAMessage.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblDecryptAMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecryptAMessage.setBounds(24, 208, 268, 14);
		frame1.getContentPane().add(lblDecryptAMessage);
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(315, 214, 123, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		
		lblCheck = new JLabel("");
		lblCheck.setBounds(31, 215, 393, 14);
		frame1.getContentPane().add(lblCheck);
		
		lblEnterAKey_1 = new JLabel("Enter a Key!");
		lblEnterAKey_1.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblEnterAKey_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAKey_1.setBounds(315, 104, 123, 14);
		frame1.getContentPane().add(lblEnterAKey_1);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(45, 270, 393, 14);
		frame1.getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(716, 11, 158, 164);
		frame1.getContentPane().add(label_1);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frame1.getContentPane().add(btnExit);
		
		btnNewButton = new JButton("Encrypt!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String encryptMe = textField.getText();
				String key=txtExampleKey.getText();
				e_caesarCipherMulti zb=new e_caesarCipherMulti();
				String encrypted = zb.savenewpasstwo(encryptMe,key);
				lblNewLabel.setText("Encrypted Message = " +encrypted);
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(467, 104, 138, 74);
		frame1.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Decrypt!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decryptMe = textField_1.getText();
				String key=txtExamplekey.getText();
				e_caesarCipherMulti ze=new e_caesarCipherMulti();
				String decrypted = ze.decryptNewPassTwoTeach(decryptMe,key);
				label.setText("Decrypted Message = " +decrypted);
			}
		});
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(467, 208, 138, 74);
		frame1.getContentPane().add(btnNewButton_1);
	}
}
