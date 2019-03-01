package iRemember;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class w_rwaRetrieveUsername {

	
	private JLabel label_1;
	private JFrame frmRetrieveACertain;
	private JLabel label;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_2;
	private JLabel lblRetrieveASpecific;
	private JButton btnRetrieve;
	
	
	/**
	 * Launch the application.
	 */
	public static void retus() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaRetrieveUsername window = new w_rwaRetrieveUsername();
					window.frmRetrieveACertain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaRetrieveUsername() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRetrieveACertain = new JFrame();
		frmRetrieveACertain.setResizable(false);
		frmRetrieveACertain.setTitle("Retrieve a Certain Students Password");
		frmRetrieveACertain.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmRetrieveACertain.setBounds(300, 100, 900, 400);
		frmRetrieveACertain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRetrieveACertain.getContentPane().setLayout(null);
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTeacherRights b=new w_rwaTeacherRights();
				b.teacherrights();
				frmRetrieveACertain.dispose();
				
			}
		});
		frmRetrieveACertain.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmRetrieveACertain.getContentPane().add(btnBack);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String note = textField_1.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2969);
				t_retrieveChoices zc=new t_retrieveChoices();
				String retrieve = zc.retrieveStudent(encryptedNote);
				label_1.setText(note +"'s passwords is "+retrieve);
				
			}
		});
		textField_1.setBounds(202, 164, 465, 20);
		frmRetrieveACertain.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		label_1 = new JLabel("");
		label_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(202, 272, 465, 50);
		frmRetrieveACertain.getContentPane().add(label_1);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRetrieveACertain.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmRetrieveACertain.getContentPane().add(btnExit);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_2.setBounds(709, 11, 165, 164);
		frmRetrieveACertain.getContentPane().add(label_2);
		
		lblRetrieveASpecific = new JLabel("Retrieve a Specific Usernames Password");
		lblRetrieveASpecific.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetrieveASpecific.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblRetrieveASpecific.setBounds(202, 72, 465, 32);
		frmRetrieveACertain.getContentPane().add(lblRetrieveASpecific);
		
		btnRetrieve = new JButton("Retrieve!");
		btnRetrieve.setBackground(Color.WHITE);
		btnRetrieve.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String note = textField_1.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2969);
				t_retrieveChoices zc=new t_retrieveChoices();
				String retrieve = zc.retrieveStudent(encryptedNote);
				label_1.setText(note +"'s passwords is "+retrieve);
				
				
			}
		});
		btnRetrieve.setBounds(342, 195, 172, 47);
		frmRetrieveACertain.getContentPane().add(btnRetrieve);
		
	}
}
	
	
		
		
