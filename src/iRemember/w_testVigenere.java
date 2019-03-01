package iRemember;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;

public class w_testVigenere {

	private JFrame frmTestVigenereCipher;
	private JTextField textField;
	private JLabel label;
	private JTextField textField_1;
	private JLabel lblDecryptAWord;
	private JLabel label_1;
	private JTextField txtExamplekey_1;
	private JLabel lblKey;
	private JTextField txtExamplekey;
	private JLabel lblKey_1;
	private JLabel label_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void vigenere() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testVigenere window = new w_testVigenere();
					window.frmTestVigenereCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_testVigenere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestVigenereCipher = new JFrame();
		frmTestVigenereCipher.setTitle("Test Vigenere Cipher!");
		frmTestVigenereCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmTestVigenereCipher.setResizable(false);
		frmTestVigenereCipher.setBounds(300, 100, 900, 400);
		frmTestVigenereCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestVigenereCipher.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_testEncryptionMenu ab=new w_testEncryptionMenu();
				ab.newscreen();
				frmTestVigenereCipher.dispose();
			}
		});
		btnBack.setBounds(10, 21,127, 50);
		frmTestVigenereCipher.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptMe = textField.getText();
				e_vigenereCipher zb=new e_vigenereCipher();
				String key1=txtExamplekey.getText();
				String encrypted = zb.saveNewPassThree(encryptMe,key1);
				label.setText("Encrypted Message = "+ encrypted);
				
			}
		});
		textField.setBounds(24, 134, 269, 20);
		frmTestVigenereCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEncryptAWord = new JLabel("Encrypt a Message!");
		lblEncryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblEncryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncryptAWord.setBounds(24, 109, 269, 14);
		frmTestVigenereCipher.getContentPane().add(lblEncryptAWord);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(34, 165, 380, 14);
		frmTestVigenereCipher.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decryptMe = textField_1.getText();
				e_vigenereCipher zc=new e_vigenereCipher();
				String key=txtExamplekey_1.getText();
				String decrypted = zc.decryptNewPassThreeTeach(decryptMe,key);
				label_1.setText("Decrypted Message = "+ decrypted);
				
				
			}
		});
		textField_1.setBounds(24, 227, 269, 20);
		frmTestVigenereCipher.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblDecryptAWord = new JLabel("Decrypt a word");
		lblDecryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblDecryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecryptAWord.setBounds(24, 202, 269, 14);
		frmTestVigenereCipher.getContentPane().add(lblDecryptAWord);
		
		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(24, 266, 397, 14);
		frmTestVigenereCipher.getContentPane().add(label_1);
		
		txtExamplekey_1 = new JTextField();
		txtExamplekey_1.setText("examplekey");
		txtExamplekey_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		txtExamplekey_1.setBounds(302, 227, 153, 20);
		frmTestVigenereCipher.getContentPane().add(txtExamplekey_1);
		txtExamplekey_1.setColumns(10);
		
		lblKey = new JLabel("Enter a Key!");
		lblKey.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey.setBounds(303, 202, 152, 14);
		frmTestVigenereCipher.getContentPane().add(lblKey);
		
		txtExamplekey = new JTextField();
		txtExamplekey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtExamplekey.setText("examplekey");
		txtExamplekey.setBounds(303, 134, 152, 20);
		frmTestVigenereCipher.getContentPane().add(txtExamplekey);
		txtExamplekey.setColumns(10);
		
		lblKey_1 = new JLabel("Enter a Key!");
		lblKey_1.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblKey_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey_1.setBounds(302, 109, 153, 14);
		frmTestVigenereCipher.getContentPane().add(lblKey_1);
		
		label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_2.setBounds(722, 11, 152, 160);
		frmTestVigenereCipher.getContentPane().add(label_2);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTestVigenereCipher.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmTestVigenereCipher.getContentPane().add(btnExit);
		
		btnNewButton = new JButton("Encrypt!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = textField.getText();
				e_vigenereCipher zb=new e_vigenereCipher();
				String key1=txtExamplekey.getText();
				String encrypted = zb.saveNewPassThree(encryptMe,key1);
				label.setText("Encrypted Message = "+ encrypted);
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBounds(465, 105, 127, 74);
		frmTestVigenereCipher.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Decrypt!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String decryptMe = textField_1.getText();
				e_vigenereCipher zc=new e_vigenereCipher();
				String key=txtExamplekey_1.getText();
				String decrypted = zc.decryptNewPassThreeTeach(decryptMe,key);
				label_1.setText("Decrypted Message = "+ decrypted);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBounds(465, 198, 127, 74);
		frmTestVigenereCipher.getContentPane().add(btnNewButton_1);
		
	}
}
