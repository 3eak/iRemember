package iRemember;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class w_rwaRetrieveYear {

	private JFrame frmRetrieveAYear;
	private JTextPane textPane;
	private JTextPane textPane_1;

	/**
	 * Launch the application.
	 */
	public static void retyr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaRetrieveYear window = new w_rwaRetrieveYear();
					window.frmRetrieveAYear.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaRetrieveYear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRetrieveAYear = new JFrame();
		frmRetrieveAYear.setResizable(false);
		frmRetrieveAYear.setTitle("Retrieve a Year");
		frmRetrieveAYear.setBounds(300, 100, 900, 600);
		frmRetrieveAYear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRetrieveAYear.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmRetrieveAYear.getContentPane().setLayout(null);
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTeacherRights b=new w_rwaTeacherRights();
				b.teacherrights();
				frmRetrieveAYear.dispose();
				
			}
		});
		frmRetrieveAYear.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmRetrieveAYear.getContentPane().add(btnBack);
		JRadioButton rdbtnYearUsernames = new JRadioButton("Year 12 Usernames");
		rdbtnYearUsernames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_retrieveChoices a = new t_retrieveChoices();
				String text=a.retrieveYear("12");
				textPane.setText(text);
				
				
				
				
				
			}
		});
		rdbtnYearUsernames.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYearUsernames.setBounds(10, 504, 213, 50);
		frmRetrieveAYear.getContentPane().add(rdbtnYearUsernames);
		
		JRadioButton rdbtnYearUsernames_1 = new JRadioButton("Year 13 Usernames");
		rdbtnYearUsernames_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_retrieveChoices a = new t_retrieveChoices();
				String text=a.retrieveYear("13");
				textPane.setText(text);
				
			}
		});
		rdbtnYearUsernames_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYearUsernames_1.setBounds(208, 504, 194, 50);
		frmRetrieveAYear.getContentPane().add(rdbtnYearUsernames_1);
		
		JRadioButton rdbtnYearPasswords = new JRadioButton("Year 12 Passwords");
		rdbtnYearPasswords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_retrieveChoices a = new t_retrieveChoices();
				try {
					String text=a.retrieveYearPasswords("12");
					textPane_1.setText(text);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		rdbtnYearPasswords.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYearPasswords.setBounds(433, 504, 226, 50);
		frmRetrieveAYear.getContentPane().add(rdbtnYearPasswords);
		
		JRadioButton rdbtnYearPasswords_1 = new JRadioButton("Year 13 Passwords");
		rdbtnYearPasswords_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_retrieveChoices a = new t_retrieveChoices();
				try {
					String text=a.retrieveYearPasswords("13");
					textPane_1.setText(text);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		rdbtnYearPasswords_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYearPasswords_1.setBounds(661, 504, 213, 50);
		frmRetrieveAYear.getContentPane().add(rdbtnYearPasswords_1);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane.setBounds(10, 75, 392, 422);
		frmRetrieveAYear.getContentPane().add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textPane_1.setBounds(433, 75, 441, 422);
		frmRetrieveAYear.getContentPane().add(textPane_1);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRetrieveAYear.dispose();
			}
		});
		btnExit.setBounds(736, 10, 138, 52);
		frmRetrieveAYear.getContentPane().add(btnExit);
	
	}

}
