package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;

public class w_titleMenu {

	private JFrame frmWelcomeToIremember;

	/**
	 * Launch the application.
	 */
	public static void windowone() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_titleMenu window = new w_titleMenu();
					window.frmWelcomeToIremember.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_titleMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToIremember = new JFrame();
		frmWelcomeToIremember.setTitle("Welcome to iRemember!");
		frmWelcomeToIremember.setResizable(false);
		frmWelcomeToIremember.getContentPane().setBackground(SystemColor.control);
		frmWelcomeToIremember.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmWelcomeToIremember.getContentPane().setForeground(Color.CYAN);
		frmWelcomeToIremember.setBounds(300, 100, 900, 475);
		frmWelcomeToIremember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToIremember.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToIremember = new JLabel("Welcome to iRemember!");
		lblWelcomeToIremember.setIcon(new ImageIcon("bin\\images\\iRememberTitleLogo.png"));
		lblWelcomeToIremember.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToIremember.setBounds(30, 11, 844, 175);
		frmWelcomeToIremember.getContentPane().add(lblWelcomeToIremember);
		
		JButton btnLearnEncryption = new JButton("Test The Encryption Types");
		btnLearnEncryption.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnLearnEncryption.setBackground(Color.WHITE);
		btnLearnEncryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_testEncryptionMenu za=new w_testEncryptionMenu();
				za.newscreen();
				frmWelcomeToIremember.dispose();
				
			}
		});
		btnLearnEncryption.setBounds(10, 220, 223, 52);
		frmWelcomeToIremember.getContentPane().add(btnLearnEncryption);
		
		JButton btnNewButton = new JButton("Learn Encryption");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_learnEncryptionMenu zb=new w_learnEncryptionMenu();
				zb.class3frame();
				frmWelcomeToIremember.dispose();
			}
		});
		btnNewButton.setBounds(651, 220, 223, 52);
		frmWelcomeToIremember.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWelcomeToIremember.dispose();
			}
		});
		btnExit.setBounds(736, 360, 138, 52);
		frmWelcomeToIremember.getContentPane().add(btnExit);
		
		JButton btnNewButton_1 = new JButton("Log In To My Passwords");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_loginScreen zc= new w_loginScreen();
				zc.login();
				frmWelcomeToIremember.dispose();
			}
		});
		btnNewButton_1.setBounds(339, 220, 223, 52);
		frmWelcomeToIremember.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Real World Application");
		btnNewButton_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				w_rwaTitleScreen zd=new w_rwaTitleScreen();
				zd.rwatitle();
				frmWelcomeToIremember.dispose();
			}
		});
		btnNewButton_2.setBounds(179, 295, 223, 52);
		frmWelcomeToIremember.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("About iRemember");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_aboutiRemember a=new w_aboutiRemember();
				a.about();
			}
		});
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(490, 295, 223, 52);
		frmWelcomeToIremember.getContentPane().add(btnNewButton_3);
	}
}
