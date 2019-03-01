package iRemember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;

public class w_startMenu {

	private JFrame frmClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_startMenu window = new w_startMenu();
					window.frmClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_startMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClass = new JFrame();
		frmClass.setResizable(false);
		frmClass.getContentPane().setBackground(SystemColor.control);
		frmClass.setIconImage(Toolkit.getDefaultToolkit().getImage("bin/images/iRememberLogoSmall.png"));
		frmClass.setTitle("Let's Start!");
		frmClass.setBounds(100, 100, 450, 300);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClass.getContentPane().setLayout(null);
		
		JButton btnLearnEncryption = new JButton("Let's Start!");
		btnLearnEncryption.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnLearnEncryption.setBackground(SystemColor.text);
		btnLearnEncryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_titleMenu nw= new w_titleMenu();
				nw.windowone();
				frmClass.dispose();
				
				
				
				
			}
		});
		btnLearnEncryption.setBounds(134, 186, 176, 38);
		frmClass.getContentPane().add(btnLearnEncryption);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(134, 11, 176, 150);
		frmClass.getContentPane().add(label);
	}
}
