package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class w_testAdler32 {

	private JFrame frmTestAdler;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void adler() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_testAdler32 window = new w_testAdler32();
					window.frmTestAdler.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
	private JLabel label;
	private JLabel label_1;
	
	
	public w_testAdler32() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestAdler = new JFrame();
		frmTestAdler.setTitle("Test Adler-32!");
		frmTestAdler.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmTestAdler.setResizable(false);
		frmTestAdler.setBounds(300, 100, 900, 400);
		frmTestAdler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestAdler.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_testEncryptionMenu aa=new w_testEncryptionMenu();
				aa.newscreen();
				frmTestAdler.dispose();
			}
		});
		btnBack.setBounds(10, 11, 127, 50);
		frmTestAdler.getContentPane().add(btnBack);
		
		JLabel lblHashAString = new JLabel("Hash a String:");
		lblHashAString.setFont(new Font("Myriad Pro", Font.ITALIC, 18));
		lblHashAString.setHorizontalAlignment(SwingConstants.CENTER);
		lblHashAString.setBounds(190, 158, 500, 36);
		frmTestAdler.getContentPane().add(lblHashAString);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hashMe = textField.getText();
				e_adlerHashing zb=new e_adlerHashing();
				String encrypted = zb.saveNewPassFourAdler32(hashMe);
				label.setText("Hashed Message = " +encrypted);
				
				
			}
		});
		textField.setBounds(190, 205, 500, 20);
		frmTestAdler.getContentPane().add(textField);
		textField.setColumns(10);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(157, 317, 574, 14);
		frmTestAdler.getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(706, 11, 168, 147);
		frmTestAdler.getContentPane().add(label_1);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTestAdler.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmTestAdler.getContentPane().add(btnExit);
		
		JButton btnHash = new JButton("Hash!");
		btnHash.setBackground(Color.WHITE);
		btnHash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hashMe = textField.getText();
				e_adlerHashing zb=new e_adlerHashing();
				String encrypted = zb.saveNewPassFourAdler32(hashMe);
				label.setText("Hashed Message = " +encrypted);
				
			}
		});
		btnHash.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
		btnHash.setBounds(363, 236, 153, 70);
		frmTestAdler.getContentPane().add(btnHash);
	}
}
