package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class w_loginSuccess {

	private JFrame frmWelcomeToMy;

	/**
	 * Launch the application.
	 */
	public static void successfulLogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginSuccess window = new w_loginSuccess();
					window.frmWelcomeToMy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginSuccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToMy = new JFrame();
		frmWelcomeToMy.setTitle("Welcome to My Passwords!");
		frmWelcomeToMy.setResizable(false);
		frmWelcomeToMy.setBounds(300, 100, 900, 400);
		frmWelcomeToMy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToMy.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
	
	
	JButton btnBack = new JButton("back");
	btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnBack.setBackground(SystemColor.text);
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_titleMenu b=new w_titleMenu();
			b.windowone();
			frmWelcomeToMy.dispose();
			
		}
	});
	frmWelcomeToMy.getContentPane().setLayout(null);
	btnBack.setBounds(10, 11, 127, 50);
	frmWelcomeToMy.getContentPane().add(btnBack);
	
	JButton btnAddNewPassword = new JButton("Add New Password");
	btnAddNewPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnAddNewPassword.setBackground(Color.WHITE);
	btnAddNewPassword.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			w_loginAddNewPassword a=new w_loginAddNewPassword();
			a.addNewPass();
			frmWelcomeToMy.dispose();
			
			
		}
	});
	btnAddNewPassword.setBounds(174, 149, 157, 50);
	frmWelcomeToMy.getContentPane().add(btnAddNewPassword);
	
	JButton btnEditAPassword = new JButton("Edit A Password");
	btnEditAPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnEditAPassword.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_loginEditPassword a=new w_loginEditPassword();
			a.edit();
			frmWelcomeToMy.dispose();
			
		}
	});
	btnEditAPassword.setBackground(Color.WHITE);
	btnEditAPassword.setBounds(508, 149, 157, 50);
	frmWelcomeToMy.getContentPane().add(btnEditAPassword);
	
	JButton btnDeleteAPassword = new JButton("Delete A Password");
	btnDeleteAPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnDeleteAPassword.setBackground(Color.WHITE);
	btnDeleteAPassword.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_loginDeletePassword a=new w_loginDeletePassword();
			a.delete();
			frmWelcomeToMy.dispose();
			
			
		}
	});
	btnDeleteAPassword.setBounds(341, 149, 157, 50);
	frmWelcomeToMy.getContentPane().add(btnDeleteAPassword);
	
	JButton btnRetrievePassword = new JButton("Retrieve a Password");
	btnRetrievePassword.setFont(new Font("Myriad Pro", Font.BOLD, 14));
	btnRetrievePassword.setBackground(Color.WHITE);
	btnRetrievePassword.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_loginRetrievePassword ab=new w_loginRetrievePassword();
			ab.retrieve();
			frmWelcomeToMy.dispose();
			
			
			
			
		}
	});
	btnRetrievePassword.setBounds(277, 210, 287, 98);
	frmWelcomeToMy.getContentPane().add(btnRetrievePassword);
	
	JLabel lblWelcomeToMy = new JLabel("Welcome to My Passwords");
	lblWelcomeToMy.setHorizontalAlignment(SwingConstants.CENTER);
	lblWelcomeToMy.setFont(new Font("Myriad Pro", Font.BOLD, 24));
	lblWelcomeToMy.setBounds(174, 32, 491, 50);
	frmWelcomeToMy.getContentPane().add(lblWelcomeToMy);
	
	JLabel lblNewLabel = new JLabel("Here you can store your passwords securely and safely!");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
	lblNewLabel.setBounds(174, 93, 491, 50);
	frmWelcomeToMy.getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon("D:\\A2 Level\\javakek\\iRemember\\bin\\images\\iRememberLogoSmall.png"));
	lblNewLabel_1.setBounds(724, 11, 160, 150);
	frmWelcomeToMy.getContentPane().add(lblNewLabel_1);
	
	JButton btnExit = new JButton("exit");
	btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnExit.setBackground(SystemColor.text);
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frmWelcomeToMy.dispose();
		}
	});
	btnExit.setBounds(736, 298, 138, 52);
	frmWelcomeToMy.getContentPane().add(btnExit);
	}
}
