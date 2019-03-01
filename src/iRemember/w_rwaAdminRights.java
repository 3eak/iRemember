package iRemember;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class w_rwaAdminRights {

	private JFrame frmAdminRights;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void adminrights() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaAdminRights window = new w_rwaAdminRights();
					window.frmAdminRights.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaAdminRights() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminRights = new JFrame();
		frmAdminRights.setResizable(false);
		frmAdminRights.setTitle("Admin Rights");
		frmAdminRights.setBounds(300, 100, 900,400);
		frmAdminRights.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminRights.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmAdminRights.getContentPane().setLayout(null);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_1.setBounds(709, 11, 165, 164);
		frmAdminRights.getContentPane().add(label_1);
		
		
		
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTitleScreen b=new w_rwaTitleScreen();
				b.rwatitle();
				frmAdminRights.dispose();
				
			}
		});
		frmAdminRights.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmAdminRights.getContentPane().add(btnBack);
		
		JButton btnUploadUsernames = new JButton("Upload Usernames");
		btnUploadUsernames.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnUploadUsernames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser= new JFileChooser();
				chooser.showOpenDialog(null);
				File file=chooser.getSelectedFile();
				String aaa= file.getAbsolutePath();
				System.out.println(aaa);
				t_saveEditDeletePasswords aa=new t_saveEditDeletePasswords();
				aa.uploadSaveU(aaa);
				
				
			}
		});
		btnUploadUsernames.setBackground(SystemColor.text);
		btnUploadUsernames.setBounds(444, 136, 175, 71);
		frmAdminRights.getContentPane().add(btnUploadUsernames);
		
		JButton btnNewButton = new JButton("Upload Passwords");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser= new JFileChooser();
				chooser.showOpenDialog(null);
				File file=chooser.getSelectedFile();
				String aaa= file.getAbsolutePath();
				System.out.println(aaa);
				t_saveEditDeletePasswords aa=new t_saveEditDeletePasswords();
				aa.uploadSaveP(aaa);
				
				
				
				
				
				
			}
		});
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setBounds(259, 136, 175, 71);
		frmAdminRights.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit a Students Password");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaEditStudent c= new w_rwaEditStudent();
				c.rwaedit();
				frmAdminRights.dispose();
			}
		});
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.setBounds(547, 215, 175, 68);
		frmAdminRights.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete a Student");
		btnNewButton_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaDeleteStudent d=new w_rwaDeleteStudent();
				d.rwadel();
				frmAdminRights.dispose();
			}
		});
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.setBounds(169, 214, 175, 68);
		frmAdminRights.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add a New Student");
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w_rwaAddNewStudent a= new w_rwaAddNewStudent();
				a.rwanewS();
				frmAdminRights.dispose();
			}
		});
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.setBounds(354, 215, 175, 68);
		frmAdminRights.getContentPane().add(btnNewButton_3);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminRights.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmAdminRights.getContentPane().add(btnExit);
		
		JLabel lblAdminRights = new JLabel("Admin Rights");
		lblAdminRights.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRights.setFont(new Font("Myriad Pro", Font.BOLD, 24));
		lblAdminRights.setBounds(169, 29, 553, 32);
		frmAdminRights.getContentPane().add(lblAdminRights);
		
		JTextPane txtpnWarningTheUploading = new JTextPane();
		txtpnWarningTheUploading.setEditable(false);
		txtpnWarningTheUploading.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		txtpnWarningTheUploading.setBackground(Color.LIGHT_GRAY);
		txtpnWarningTheUploading.setText("WARNING! The uploading feature is primarily for example use, if you intend on uploading files. Ensure it is formatted to the same standard as this program. More info can be found in \"About this System\"");
		txtpnWarningTheUploading.setBounds(259, 284, 360, 66);
		frmAdminRights.getContentPane().add(txtpnWarningTheUploading);
		
		
		
		
		
	}
}
