package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class w_loginScreen {

	private JFrame frmLoginToMy;
	private JTextField textField;
	private JLabel label;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginScreen window = new w_loginScreen();
					window.frmLoginToMy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginToMy = new JFrame();
		frmLoginToMy.setTitle("Login to My Passwords!");
		frmLoginToMy.setResizable(false);
		frmLoginToMy.setBounds(300, 100, 900, 400);
		frmLoginToMy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginToMy.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
	
	JButton btnBack = new JButton("back");
	btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnBack.setBackground(SystemColor.text);
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			w_titleMenu b=new w_titleMenu();
			b.windowone();
			frmLoginToMy.dispose();
			
		}
	});
	frmLoginToMy.getContentPane().setLayout(null);
	btnBack.setBounds(10, 11, 127, 50);
	frmLoginToMy.getContentPane().add(btnBack);
	
	textField = new JTextField();
	textField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String user = textField.getText();
			String pass=passwordField.getText();
			//int key1=Integer.parseInt(key);
			t_login zb=new t_login();
			String loginCheck = zb.checkLogin(user,pass);
			label.setText(loginCheck);
			if (loginCheck=="success") {
				//System.out.println("gg");
				w_loginSuccess zd=new w_loginSuccess();
				zd.successfulLogin();
				frmLoginToMy.dispose();
			}
			
			
			
			
			
		}
	});
	textField.setBounds(175, 135, 497, 20);
	frmLoginToMy.getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblUsername = new JLabel("Username");
	lblUsername.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
	lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
	lblUsername.setBounds(175, 111, 497, 14);
	frmLoginToMy.getContentPane().add(lblUsername);
	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
	lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
	lblPassword.setBounds(175, 185, 497, 14);
	frmLoginToMy.getContentPane().add(lblPassword);
	
	label = new JLabel("");
	label.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setBounds(175, 318, 497, 32);
	frmLoginToMy.getContentPane().add(label);
	
	passwordField = new JPasswordField();
	passwordField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String user = textField.getText();
			String pass=passwordField.getText();
			//int key1=Integer.parseInt(key);
			t_login zb=new t_login();
			String loginCheck = zb.checkLogin(user,pass);
			label.setText(loginCheck);
			if (loginCheck=="success") {
				//System.out.println("gg");
				w_loginSuccess zd=new w_loginSuccess();
				zd.successfulLogin();
				frmLoginToMy.dispose();
			}
		}
	});
	passwordField.setBounds(175, 210, 497, 20);
	frmLoginToMy.getContentPane().add(passwordField);
	
	JButton btnExit = new JButton("exit");
	btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
	btnExit.setBackground(SystemColor.text);
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frmLoginToMy.dispose();
		}
	});
	btnExit.setBounds(736, 298, 138, 52);
	frmLoginToMy.getContentPane().add(btnExit);
	
	JButton btnNewButton = new JButton("Login!");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String user = textField.getText();
			String pass=passwordField.getText();
			//int key1=Integer.parseInt(key);
			t_login zb=new t_login();
			String loginCheck = zb.checkLogin(user,pass);
			label.setText(loginCheck);
			if (loginCheck=="success") {
				//System.out.println("gg");
				w_loginSuccess zd=new w_loginSuccess();
				zd.successfulLogin();
				frmLoginToMy.dispose();
			}
			
			
		}
	});
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
	btnNewButton.setBounds(348, 241, 159, 50);
	frmLoginToMy.getContentPane().add(btnNewButton);
	
	JButton btn = new JButton("Forgot Login?");
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			w_loginForgotPassword ze=new w_loginForgotPassword();
			ze.forgot();
			
			
		}
	});
	btn.setBackground(Color.WHITE);
	btn.setFont(new Font("Myriad Pro", Font.ITALIC, 14));
	btn.setBounds(10, 299, 159, 50);
	frmLoginToMy.getContentPane().add(btn);
	
	
	
	JLabel label_1 = new JLabel("");
	label_1.setIcon(new ImageIcon("D:\\A2 Level\\javakek\\iRemember\\bin\\images\\iRememberLogoSmall.png"));
	label_1.setBounds(721, 11, 153, 146);
	frmLoginToMy.getContentPane().add(label_1);
	
	JLabel lblLogInTo = new JLabel("Log in to My Passwords");
	lblLogInTo.setFont(new Font("Myriad Pro", Font.BOLD, 24));
	lblLogInTo.setHorizontalAlignment(SwingConstants.CENTER);
	lblLogInTo.setBounds(147, 29, 564, 38);
	frmLoginToMy.getContentPane().add(lblLogInTo);
	}
}
