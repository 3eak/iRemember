package iRemember;

import java.awt.EventQueue;

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
import java.awt.Font;
import java.awt.Color;

public class w_testAffine {

	private JFrame frmTestAffineCipher;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void affine() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testAffine window = new w_testAffine();
					window.frmTestAffineCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_testAffine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestAffineCipher = new JFrame();
		frmTestAffineCipher.setResizable(false);
		frmTestAffineCipher.setTitle("Test Affine Cipher!");
		frmTestAffineCipher.getContentPane().setBackground(SystemColor.control);
		frmTestAffineCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmTestAffineCipher.setBounds(300, 100, 900, 400);
		frmTestAffineCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestAffineCipher.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_testEncryptionMenu aaa=new w_testEncryptionMenu();
				aaa.newscreen();
				frmTestAffineCipher.dispose();
				
			}
		});
		btnBack.setBounds(10, 11, 127, 50);
		frmTestAffineCipher.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = textField.getText();
				String key=textField_1.getText();
				int key1=Integer.parseInt(key);
				e_affineInspired zb=new e_affineInspired();
				String encrypted = zb.encryptAffine(encryptMe,key1);
				label.setText("Encrypted Message = " +encrypted);
				
				
				
			}
		});
		textField.setBounds(28, 139, 327, 20);
		frmTestAffineCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEncryptAWord = new JLabel("Encrypt a Message!");
		lblEncryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblEncryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncryptAWord.setBounds(28, 103, 327, 25);
		frmTestAffineCipher.getContentPane().add(lblEncryptAWord);
		
		textField_1 = new JTextField();
		textField_1.setText("2329");
		textField_1.setBounds(385, 139, 121, 20);
		frmTestAffineCipher.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblKey = new JLabel("Enter a Integer Key (Must Be Prime)!");
		lblKey.setFont(new Font("Myriad Pro", Font.ITALIC, 12));
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey.setBounds(350, 103, 195, 25);
		frmTestAffineCipher.getContentPane().add(lblKey);
		
		label = new JLabel("");
		label.setBounds(90, 179, 381, 14);
		frmTestAffineCipher.getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(718, 11, 156, 165);
		frmTestAffineCipher.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				e_affineInspired zc=new e_affineInspired();
				int a= 2023;
				String b="test";
				System.out.println(zc.decryptAffine(b));
				*/
				
				String decryptMe1 = textField_2.getText();
				String key1=textField_3.getText();
				int key2=Integer.parseInt(key1);
				e_affineInspired zc=new e_affineInspired();
				String decrypted = zc.decryptAffine(decryptMe1,key2);
				label_2.setText("Decrypted Message = " +decrypted);
				
				
			}
		});
		textField_2.setBounds(28, 258, 327, 20);
		frmTestAffineCipher.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("2329");
		textField_3.setBounds(385, 258, 121, 20);
		frmTestAffineCipher.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDecryptAWord = new JLabel("Decrypt a Message!");
		lblDecryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		lblDecryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecryptAWord.setBounds(28, 218, 327, 29);
		frmTestAffineCipher.getContentPane().add(lblDecryptAWord);
		
		JLabel lblKey_1 = new JLabel("Enter a Integer Key (Must Be Prime)!");
		lblKey_1.setFont(new Font("Myriad Pro", Font.ITALIC, 12));
		lblKey_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey_1.setBounds(350, 218, 195, 29);
		frmTestAffineCipher.getContentPane().add(lblKey_1);
		
		label_2 = new JLabel("");
		label_2.setBounds(90, 298, 381, 14);
		frmTestAffineCipher.getContentPane().add(label_2);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTestAffineCipher.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmTestAffineCipher.getContentPane().add(btnExit);
		
		btnNewButton = new JButton("Encrypt!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = textField.getText();
				String key=textField_1.getText();
				int key1=Integer.parseInt(key);
				e_affineInspired zb=new e_affineInspired();
				String encrypted = zb.encryptAffine(encryptMe,key1);
				label.setText("Encrypted Message = " +encrypted);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBounds(555, 103, 138, 72);
		frmTestAffineCipher.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Decrypt!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decryptMe1 = textField_2.getText();
				String key1=textField_3.getText();
				int key2=Integer.parseInt(key1);
				e_affineInspired zc=new e_affineInspired();
				String decrypted = zc.decryptAffine(decryptMe1,key2);
				label_2.setText("Decrypted Message = " +decrypted);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBounds(555, 221, 138, 72);
		frmTestAffineCipher.getContentPane().add(btnNewButton_1);
	}
}
