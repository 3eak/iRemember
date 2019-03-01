package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Font;

public class w_testEncryptionMenu {

	private JFrame frmClass;

	/**
	 * Launch the application.
	 */
	public static void newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testEncryptionMenu window = new w_testEncryptionMenu();
					window.frmClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_testEncryptionMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClass = new JFrame();
		frmClass.setResizable(false);
		frmClass.setTitle("Choose an Encryption Type!");
		frmClass.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmClass.setBounds(300, 100, 900, 425);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClass.getContentPane().setLayout(null);
		
		JButton btnTest = new JButton("CaesarCipher");
		btnTest.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnTest.setBackground(SystemColor.text);
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				w_testCC zx=new w_testCC();
				zx.caesar1();
				frmClass.dispose();
			}
		});
		btnTest.setBounds(94, 171, 212, 62);
		frmClass.getContentPane().add(btnTest);
		
		JLabel lblChooseAnEncryption = new JLabel("Choose an Encryption Type!");
		lblChooseAnEncryption.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblChooseAnEncryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseAnEncryption.setBounds(94, 74, 656, 86);
		frmClass.getContentPane().add(lblChooseAnEncryption);
		
		JButton btnCaesarcipherKey = new JButton("CaesarCipher Multi");
		btnCaesarcipherKey.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnCaesarcipherKey.setBackground(SystemColor.text);
		btnCaesarcipherKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				w_testCCM zg=new w_testCCM();
				//caesarCipherMulti.caesar2();
				zg.caesar3();
				frmClass.dispose();
			}
		});
		btnCaesarcipherKey.setBounds(316, 171, 212, 62);
		frmClass.getContentPane().add(btnCaesarcipherKey);
		
		JButton btnVigenerecipher = new JButton("VigenereCipher");
		btnVigenerecipher.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnVigenerecipher.setBackground(SystemColor.text);
		btnVigenerecipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_testVigenere zz= new w_testVigenere();
				zz.vigenere();
				frmClass.dispose();
			}
		});
		btnVigenerecipher.setBounds(538, 171, 212, 62);
		frmClass.getContentPane().add(btnVigenerecipher);
		
		JButton btnAdlerHashing = new JButton("Adler32 Hashing");
		btnAdlerHashing.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnAdlerHashing.setBackground(SystemColor.text);
		btnAdlerHashing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_testAdler32 ac=new w_testAdler32();
				ac.adler();
				frmClass.dispose();
				
			}
		});
		btnAdlerHashing.setBounds(202, 244, 212, 62);
		frmClass.getContentPane().add(btnAdlerHashing);
		
		JButton btnAffineInspiredCipher = new JButton("Affine Inspired Cipher");
		btnAffineInspiredCipher.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnAffineInspiredCipher.setBackground(SystemColor.text);
		btnAffineInspiredCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_testAffine aab=new w_testAffine();
				aab.affine();
				frmClass.dispose();
				
				
			}
		});
		btnAffineInspiredCipher.setBounds(424, 244, 212, 61);
		frmClass.getContentPane().add(btnAffineInspiredCipher);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				w_titleMenu zy=new w_titleMenu();
				zy.windowone();
				frmClass.dispose();
				
			}
		});
		btnBack.setBounds(10, 11,127, 50);
		frmClass.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(721, 11, 153, 149);
		frmClass.getContentPane().add(label);
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmClass.dispose();
			}
		});
		btnExit.setBounds(736, 317, 138, 52);
		frmClass.getContentPane().add(btnExit);
	}

}
