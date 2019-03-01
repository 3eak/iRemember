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
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class w_loginDeletePassword {

	private JFrame frmDeleteAPassword;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void delete() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_loginDeletePassword window = new w_loginDeletePassword();
					window.frmDeleteAPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_loginDeletePassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteAPassword = new JFrame();
		frmDeleteAPassword.setTitle("Delete a Password");
		frmDeleteAPassword.setResizable(false);
		frmDeleteAPassword.setBounds(300, 100, 900, 400);
		frmDeleteAPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteAPassword.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmDeleteAPassword.getContentPane().setLayout(null);
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_loginSuccess a=new w_loginSuccess();
				a.successfulLogin();
				frmDeleteAPassword.dispose();
				
			}
		});
		frmDeleteAPassword.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmDeleteAPassword.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(198, 157, 403, 20);
		frmDeleteAPassword.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDeletePasswordAnd = new JButton("Delete Password and Note");
		btnDeletePasswordAnd.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnDeletePasswordAnd.setBackground(Color.WHITE);
		btnDeletePasswordAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String note = textField.getText();
				e_affineInspired zb=new e_affineInspired();
				//String password=textField_1.getText();
				String encryptedNote = zb.encryptAffine(note,2192);
				//String encryptedPass = zb.encryptAffine(password,2192);
				t_saveEditDeletePasswords zc=new t_saveEditDeletePasswords();
				try {
					String a=zc.deletePassword(encryptedNote);
					zc.deletePassword2(a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//zc.saveNewPassword(encryptedPass);
				
				
				
				
			}
		});
		btnDeletePasswordAnd.setBounds(288, 201, 210, 60);
		frmDeleteAPassword.getContentPane().add(btnDeletePasswordAnd);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 151);
		frmDeleteAPassword.getContentPane().add(label);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteAPassword.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmDeleteAPassword.getContentPane().add(btnExit);
		
		JLabel lblEnterTheNote = new JLabel("Enter the note for the password you want to delete");
		lblEnterTheNote.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblEnterTheNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheNote.setBounds(198, 95, 403, 50);
		frmDeleteAPassword.getContentPane().add(lblEnterTheNote);
		
		JLabel lblDeleteAPassword = new JLabel("Delete a Password");
		lblDeleteAPassword.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblDeleteAPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteAPassword.setBounds(198, 57, 403, 20);
		frmDeleteAPassword.getContentPane().add(lblDeleteAPassword);
	
	}
}
