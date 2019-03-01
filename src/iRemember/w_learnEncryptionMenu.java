package iRemember;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;

public class w_learnEncryptionMenu {

	private JFrame frmLearnEncryption;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void class3frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnEncryptionMenu window = new w_learnEncryptionMenu();
					window.frmLearnEncryption.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_learnEncryptionMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnEncryption = new JFrame();
		frmLearnEncryption.setResizable(false);
		frmLearnEncryption.setTitle("Learn Encryption!");
		frmLearnEncryption.getContentPane().setBackground(SystemColor.control);
		frmLearnEncryption.setBounds(300, 100, 900, 475);
		frmLearnEncryption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearnEncryption.getContentPane().setLayout(null);
		frmLearnEncryption.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_titleMenu b=new w_titleMenu();
				b.windowone();
				frmLearnEncryption.dispose();
				
			}
		});
		btnBack.setBounds(10, 11, 127, 50);
		frmLearnEncryption.getContentPane().add(btnBack);
		
		JButton btnCaesarCipher = new JButton("Caesar Cipher");
		btnCaesarCipher.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnCaesarCipher.setBackground(SystemColor.text);
		btnCaesarCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				w_learnCC a=new w_learnCC();
				a.caesar5();
				frmLearnEncryption.dispose();
				
				
			}
		});
		btnCaesarCipher.setBounds(127, 166, 215, 73);
		frmLearnEncryption.getContentPane().add(btnCaesarCipher);
		
		JLabel lblLearnAnEncryption = new JLabel("Learn an encryption type");
		lblLearnAnEncryption.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblLearnAnEncryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearnAnEncryption.setBounds(63, 68, 763, 50);
		frmLearnEncryption.getContentPane().add(lblLearnAnEncryption);
		
		btnNewButton = new JButton("Caesar Cipher Multi");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_learnCCM c=new w_learnCCM();
				c.caesarmulti();
				frmLearnEncryption.dispose();
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(352, 166, 215, 73);
		frmLearnEncryption.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vigenere Cipher");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_learnVigenere b=new w_learnVigenere();
				b.learnV();
				frmLearnEncryption.dispose();
			}
		});
		btnNewButton_1.setBounds(577, 166, 215, 73);
		frmLearnEncryption.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 143);
		frmLearnEncryption.getContentPane().add(label);
		
		JButton btnAffineInspired = new JButton("Affine Inspired");
		btnAffineInspired.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnAffineInspired.setBackground(SystemColor.text);
		btnAffineInspired.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_learnAffine d=new w_learnAffine();
				d.learnAffine();
				frmLearnEncryption.dispose();
				
			}
		});
		btnAffineInspired.setBounds(234, 250, 215, 73);
		frmLearnEncryption.getContentPane().add(btnAffineInspired);
		
		JButton btnNewButton_2 = new JButton("Adler 32 Checksum");
		btnNewButton_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_2.setBackground(Color.WHITE );
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_learnAdler32 f=new w_learnAdler32();
				f.learnadler();
				frmLearnEncryption.dispose();
				
				
			}
		});
		btnNewButton_2.setBounds(459, 250, 215, 73);
		frmLearnEncryption.getContentPane().add(btnNewButton_2);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLearnEncryption.dispose();
			}
		});
		btnExit.setBounds(736, 355, 138, 52);
		frmLearnEncryption.getContentPane().add(btnExit);
		
		JButton btnNewButton_3 = new JButton("What is Encryption?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_learnEncryption a=new w_learnEncryption();
				a.about();
			}
		});
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.setBounds(352, 334, 215, 73);
		frmLearnEncryption.getContentPane().add(btnNewButton_3);
	}
}
