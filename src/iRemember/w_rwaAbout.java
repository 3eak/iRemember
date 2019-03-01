package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class w_rwaAbout {

	private JFrame frmAboutThisSystem;

	/**
	 * Launch the application.
	 */
	public static void about() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_rwaAbout window = new w_rwaAbout();
					window.frmAboutThisSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_rwaAbout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutThisSystem = new JFrame();
		frmAboutThisSystem.setTitle("About this System");
		frmAboutThisSystem.setResizable(false);
		frmAboutThisSystem.setBounds(400, 120, 700, 350);
		frmAboutThisSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAboutThisSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmAboutThisSystem.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAboutThisSystem.dispose();
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
		btnNewButton.setBounds(168, 252, 344, 58);
		frmAboutThisSystem.getContentPane().add(btnNewButton);
		
		JTextPane txtpnInThisSection = new JTextPane();
		txtpnInThisSection.setBackground(SystemColor.menu);
		txtpnInThisSection.setEditable(false);
		txtpnInThisSection.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		txtpnInThisSection.setText("In this section of the iRemember program you will learn about how encryption can be used in the real world. I have set up a very basic schooling system which is based upon different permissions. For simplicity, I have allowed the user to roam wherever you want to check out what does what. This system has been specifically written for the formatting of usernames to be in \"first name\"+\"last name\" + \"year\" + \"form\". I have set the system to run through these certain search locations when you look for certain classes and years. If you intend on trying to upload your own usernames, it will erase the usernames i have selected there and will effectively make this part of the program useless. However I have also set up a reset button which should reinstall these text files into their locations. There is lots to look at in this section so make sure you know what is happening with each part before moving on. ");
		txtpnInThisSection.setBounds(49, 35, 595, 193);
		frmAboutThisSystem.getContentPane().add(txtpnInThisSection);
	}
}
