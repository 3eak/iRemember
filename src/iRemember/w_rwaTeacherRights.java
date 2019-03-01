package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class w_rwaTeacherRights {

	private JFrame frmTeacherRights;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void teacherrights() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaTeacherRights window = new w_rwaTeacherRights();
					window.frmTeacherRights.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaTeacherRights() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTeacherRights = new JFrame();
		frmTeacherRights.setTitle("Teacher Rights");
		frmTeacherRights.setResizable(false);
		frmTeacherRights.setBounds(300, 100, 900, 400);
		frmTeacherRights.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTeacherRights.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmTeacherRights.getContentPane().setLayout(null);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(709, 11, 165, 164);
		frmTeacherRights.getContentPane().add(label_1);
		
		
		
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTitleScreen b=new w_rwaTitleScreen();
				b.rwatitle();
				frmTeacherRights.dispose();
				
			}
		});
		frmTeacherRights.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmTeacherRights.getContentPane().add(btnBack);
		
		JButton btnUploadUsernames = new JButton("Retrieve Passwords by Year");
		btnUploadUsernames.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnUploadUsernames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_rwaRetrieveYear b= new w_rwaRetrieveYear();
				b.retyr();
				frmTeacherRights.dispose();
				
				
			}
		});
		btnUploadUsernames.setBackground(SystemColor.text);
		btnUploadUsernames.setBounds(339, 202, 212, 66);
		frmTeacherRights.getContentPane().add(btnUploadUsernames);
		
		JButton btnNewButton = new JButton("Retrieve Passwords by Class");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_rwaRetrieveClass a= new w_rwaRetrieveClass();
				a.retcla();
				frmTeacherRights.dispose();
				
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setBounds(117, 202, 212, 66);
		frmTeacherRights.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Retrieve Passwords by User");
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_rwaRetrieveUsername a= new w_rwaRetrieveUsername();
				a.retus();
				frmTeacherRights.dispose();
			}
		});
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.setBounds(561, 202, 212, 66);
		frmTeacherRights.getContentPane().add(btnNewButton_3);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTeacherRights.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmTeacherRights.getContentPane().add(btnExit);
		
		JLabel lblTeacherRights = new JLabel("Teacher Rights");
		lblTeacherRights.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherRights.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblTeacherRights.setBounds(117, 72, 657, 43);
		frmTeacherRights.getContentPane().add(lblTeacherRights);
		
		
		
	}
}
