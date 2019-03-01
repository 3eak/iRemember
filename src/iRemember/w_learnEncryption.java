package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class w_learnEncryption {

	private JFrame frmLearnEncryption;

	/**
	 * Launch the application.
	 */
	public static void about() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnEncryption window = new w_learnEncryption();
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
	public w_learnEncryption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnEncryption= new JFrame();
		frmLearnEncryption.setTitle("Learn Encryption");
		frmLearnEncryption.setResizable(false);
		frmLearnEncryption.setBounds(400, 150, 700, 350);
		frmLearnEncryption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearnEncryption.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmLearnEncryption.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLearnEncryption.dispose();
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
		btnNewButton.setBounds(168, 252, 344, 58);
		frmLearnEncryption.getContentPane().add(btnNewButton);
		
		JTextPane txtpnInThisSection = new JTextPane();
		txtpnInThisSection.setBackground(SystemColor.menu);
		txtpnInThisSection.setEditable(false);
		txtpnInThisSection.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		txtpnInThisSection.setText("Encrpytion is something that goes through you every day all the time, most of which probably without you even knowing. Every time you send an iMessage, a WhatsApp message, type your username, enter your password or do anything of any remote importance is likely to involve encryption somewhere. Encryption is the core behind keeping your information yours. Without encryption, credit cards, passwords and privacy would become obsolete as everyone and anyone would be able to see your sensitive information. In this program we will go through just a couple of simple encryption methods and a couple of more complex ones. You can go through these to see how each one is unique and manipulates the data to hide the information. Encryption primarily works off of the basis that it can be decrypted in some sort of way, i have included a hashing method in \"Adler-32\". This type of encryption is a checksum hashing method, this differs to the others as it cannot be decrypted. Websites like google, facebook and anything that includes password saving will use a type of hashing to store YOUR passwords securely. When you enter your password into the site, it doesnt need to be decrypted, it will just hash your password and check it against their passwords stored in the database. There is a lot to learn with encryption, i hope iRemember will however be able to teach the basics and give you a stepping stone into the complextity and the hugeness of encryption.");
		txtpnInThisSection.setBounds(48, 5, 595, 246);
		frmLearnEncryption.getContentPane().add(txtpnInThisSection);
	}
}
