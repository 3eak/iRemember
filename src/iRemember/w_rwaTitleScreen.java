package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class w_rwaTitleScreen {

	private JFrame frmRealWorldApplication;
	private JButton btnBack;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void rwatitle() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaTitleScreen window = new w_rwaTitleScreen();
					window.frmRealWorldApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaTitleScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRealWorldApplication = new JFrame();
		frmRealWorldApplication.setResizable(false);
		frmRealWorldApplication.setTitle("Real World Application");
		frmRealWorldApplication.setBounds(300, 100, 900, 400);
		frmRealWorldApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRealWorldApplication.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmRealWorldApplication.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_titleMenu b=new w_titleMenu();
				b.windowone();
				frmRealWorldApplication.dispose();
				
			}
		});
		frmRealWorldApplication.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmRealWorldApplication.getContentPane().add(btnBack);
		
		JButton btnAdminRights = new JButton("Admin Rights");
		btnAdminRights.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnAdminRights.setBackground(SystemColor.text);
		btnAdminRights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_rwaAdminRights a=new w_rwaAdminRights();
				a.adminrights();
				frmRealWorldApplication.dispose();
			}
		});
		btnAdminRights.setBounds(236, 153, 180, 80);
		frmRealWorldApplication.getContentPane().add(btnAdminRights);
		
		JButton btnTeacherRights = new JButton("Teacher Rights");
		btnTeacherRights.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnTeacherRights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTeacherRights b= new w_rwaTeacherRights();
				b.teacherrights();
				frmRealWorldApplication.dispose();
			}
		});
		btnTeacherRights.setBackground(SystemColor.text);
		btnTeacherRights.setBounds(236, 244, 180, 80);
		frmRealWorldApplication.getContentPane().add(btnTeacherRights);
		
		JButton btnNewButton = new JButton("About this System");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaAbout c=new w_rwaAbout();
				c.about();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBounds(426, 204, 180, 80);
		frmRealWorldApplication.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRealWorldApplication.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmRealWorldApplication.getContentPane().add(btnExit);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(709, 11, 165, 164);
		frmRealWorldApplication.getContentPane().add(label_1);
		
		JLabel lblRealWorldApplication = new JLabel("Real World Application");
		lblRealWorldApplication.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblRealWorldApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealWorldApplication.setBounds(236, 29, 382, 32);
		frmRealWorldApplication.getContentPane().add(lblRealWorldApplication);
		
		JLabel lblInThisPart = new JLabel("In this part of the program we are showing a basic schooling system in which encryption may be used");
		lblInThisPart.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblInThisPart.setHorizontalAlignment(SwingConstants.CENTER);
		lblInThisPart.setBounds(10, 72, 826, 32);
		frmRealWorldApplication.getContentPane().add(lblInThisPart);
		
				
		
	}
}
