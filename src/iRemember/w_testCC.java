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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;



//for simplicity i have used the term CC for CaesarCipher

public class w_testCC {

	private JFrame frmTestCaesarCipher;
	private JTextField txtEnterYourText;
	private JLabel lblMessage;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void caesar1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testCC window = new w_testCC();
					window.frmTestCaesarCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_testCC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestCaesarCipher = new JFrame();
		frmTestCaesarCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmTestCaesarCipher.setTitle("Test Caesar Cipher!");
		frmTestCaesarCipher.setResizable(false);
		frmTestCaesarCipher.getContentPane().setBackground(SystemColor.control);
		frmTestCaesarCipher.setBounds(300, 100, 900, 400);
		frmTestCaesarCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestCaesarCipher.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_testEncryptionMenu za=new w_testEncryptionMenu();
				za.newscreen();
				frmTestCaesarCipher.dispose();
			}
		});
		btnBack.setBounds(10, 25, 127, 50);
		frmTestCaesarCipher.getContentPane().add(btnBack);
		
		txtEnterYourText = new JTextField();
		txtEnterYourText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = txtEnterYourText.getText();
				e_caesarCipher zb=new e_caesarCipher();
				String encrypted = zb.savenewpassone(encryptMe);
				lblMessage.setText("Encrypted Message = "+ encrypted);
			}
		});
		//String encryptMe = txtEnterYourText.getText();
		
		
		
		
		txtEnterYourText.setBounds(28, 154, 372, 20);
		frmTestCaesarCipher.getContentPane().add(txtEnterYourText);
		txtEnterYourText.setColumns(10);
		
		lblMessage = new JLabel("");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(10, 185, 414, 29);
		frmTestCaesarCipher.getContentPane().add(lblMessage);
		
		JLabel lblEncryptAWord = new JLabel("Encrypt a Message!");
		lblEncryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 16));
		lblEncryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncryptAWord.setBounds(28, 100, 370, 41);
		frmTestCaesarCipher.getContentPane().add(lblEncryptAWord);
		
		
		
		
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String decryptMe = textField.getText();
				e_caesarCipher zc=new e_caesarCipher();
				String decrypted = zc.decryptNewPassOneTeach(decryptMe);
				lblNewLabel.setText("Decrypted Message = "+decrypted);
				///lblMess.setText("Message = "+ decrypted);
				
				/*
				t_login gg=new t_login();
				String go= gg.checkLogin("test","run");
				lblNewLabel.setText("Message = "+ go);
				*/
				
			}
		});
		textField.setBounds(26, 270, 378, 20);
		frmTestCaesarCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDecryptAWord = new JLabel("Decrypt a Message!");
		lblDecryptAWord.setFont(new Font("Myriad Pro", Font.ITALIC, 16));
		lblDecryptAWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecryptAWord.setBounds(27, 225, 372, 34);
		frmTestCaesarCipher.getContentPane().add(lblDecryptAWord);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 315, 381, 35);
		frmTestCaesarCipher.getContentPane().add(lblNewLabel);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(712, 13, 156, 145);
		frmTestCaesarCipher.getContentPane().add(label);
		
		btnNewButton = new JButton("Encrypt!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptMe = txtEnterYourText.getText();
				e_caesarCipher zb=new e_caesarCipher();
				String encrypted = zb.savenewpassone(encryptMe);
				lblMessage.setText("Encrypted Message = "+ encrypted);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBounds(429, 125, 145, 83);
		frmTestCaesarCipher.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Decrypt!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String decryptMe = textField.getText();
				e_caesarCipher zc=new e_caesarCipher();
				String decrypted = zc.decryptNewPassOneTeach(decryptMe);
				lblNewLabel.setText("Decrypted Message = "+decrypted);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBounds(428, 249, 146, 85);
		frmTestCaesarCipher.getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTestCaesarCipher.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmTestCaesarCipher.getContentPane().add(btnExit);

	}
}
