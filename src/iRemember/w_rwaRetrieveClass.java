package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class w_rwaRetrieveClass {

	private JFrame frmRetrieveAClass;
	private JTextPane txtpnRetrieveAClass;
	private JTextPane textPane_1;

	/**
	 * Launch the application.
	 */
	public static void retcla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaRetrieveClass window = new w_rwaRetrieveClass();
					window.frmRetrieveAClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaRetrieveClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRetrieveAClass = new JFrame();
		frmRetrieveAClass.setResizable(false);
		frmRetrieveAClass.setTitle("Retrieve a Class!");
		frmRetrieveAClass.setBounds(300, 100, 900, 600);
		frmRetrieveAClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRetrieveAClass.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmRetrieveAClass.getContentPane().setLayout(null);
		JButton btnBack = new JButton("back");
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_rwaTeacherRights b=new w_rwaTeacherRights();
				b.teacherrights();
				frmRetrieveAClass.dispose();
				
			}
		});
		frmRetrieveAClass.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmRetrieveAClass.getContentPane().add(btnBack);
		
		txtpnRetrieveAClass = new JTextPane();
		txtpnRetrieveAClass.setEditable(false);
		txtpnRetrieveAClass.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnRetrieveAClass.setBounds(10, 75, 392, 422);
		frmRetrieveAClass.getContentPane().add(txtpnRetrieveAClass);
		
		textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane_1.setBounds(433, 75, 441, 422);
		frmRetrieveAClass.getContentPane().add(textPane_1);
		
		String a="12BA";
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String classa = (String)cb.getSelectedItem();
				t_retrieveChoices b= new t_retrieveChoices();
				String text=b.retrieveYear(classa);
				txtpnRetrieveAClass.setText(text);
				
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12SC", "12BA", "13NM", "13LO"}));
		comboBox.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(107, 502, 200, 50);
		//ItemListener b=null;
		frmRetrieveAClass.getContentPane().add(comboBox);
		
		
		
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBackground(Color.WHITE);
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String classa = (String)cb.getSelectedItem();
				t_retrieveChoices b= new t_retrieveChoices();
				String text;
				try {
					text = b.retrieveYearPasswords(classa);
					textPane_1.setText(text);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"12SC", "12BA", "13NM", "13LO"}));
		comboBox1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		comboBox1.setMaximumRowCount(4);
		comboBox1.setBounds(549, 502, 200, 50);
		//ItemListener b=null;
		frmRetrieveAClass.getContentPane().add(comboBox1);
		
		JLabel lblUsernames = new JLabel("Usernames");
		lblUsernames.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsernames.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblUsernames.setBounds(10, 36, 392, 25);
		frmRetrieveAClass.getContentPane().add(lblUsernames);
		
		JLabel lblPasswords = new JLabel("Passwords");
		lblPasswords.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswords.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblPasswords.setBounds(433, 36, 441, 25);
		frmRetrieveAClass.getContentPane().add(lblPasswords);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRetrieveAClass.dispose();
			}
		});
		btnExit.setBounds(736, 10, 138, 52);
		frmRetrieveAClass.getContentPane().add(btnExit);
		
		
		
	}
}
