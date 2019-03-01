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

public class w_aboutiRemember {

	private JFrame frmAboutIremember;

	/**
	 * Launch the application.
	 */
	public static void about() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_aboutiRemember window = new w_aboutiRemember();
					window.frmAboutIremember.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_aboutiRemember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutIremember= new JFrame();
		frmAboutIremember.setTitle("About iRemember");
		frmAboutIremember.setResizable(false);
		frmAboutIremember.setBounds(400, 150, 700, 350);
		frmAboutIremember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAboutIremember.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmAboutIremember.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAboutIremember.dispose();
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
		btnNewButton.setBounds(168, 252, 344, 58);
		frmAboutIremember.getContentPane().add(btnNewButton);
		
		JTextPane txtpnInThisSection = new JTextPane();
		txtpnInThisSection.setBackground(SystemColor.menu);
		txtpnInThisSection.setEditable(false);
		txtpnInThisSection.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		txtpnInThisSection.setText("iRemember is a student written Java project created in the intention of not only being a useful teaching and learning tool for encryption, but also to have some use in being about to store passwords securely. Although the program probably does not reach the standards of other competing password saving applications, it beats them out in a unique way as it doubles up as a teaching tool for newbies to encryption. Encryption is something that often becomes a problem for people to get their head around as it is often questioned for its use. iRemember can not only be useful for your average guy who wants to store passwords in a reliable and secure system, but also become incredibly useful for teachers and students alike who want to teach and learn encryption in schools. With its useful \"Real World Application\", you'll never question encryptions usefullness ever again!");
		txtpnInThisSection.setBounds(49, 35, 595, 193);
		frmAboutIremember.getContentPane().add(txtpnInThisSection);
	}
}
