package iRemember;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;


//for simplicity i have used the term CC for CaesarCipher

public class w_learnCC {

	private JFrame frmLearnCaesarCipher;
	private JTextField textField;
	private JButton btnStage;
	private JButton btnStage_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblToBeginLets;
	private JLabel label;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void caesar5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnCC window = new w_learnCC();
					window.frmLearnCaesarCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_learnCC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnCaesarCipher = new JFrame();
		frmLearnCaesarCipher.setTitle("Learn Caesar Cipher!");
		frmLearnCaesarCipher.setResizable(false);
		frmLearnCaesarCipher.getContentPane().setBackground(SystemColor.control);
		frmLearnCaesarCipher.setBounds(300, 100, 900, 400);
		frmLearnCaesarCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearnCaesarCipher.getContentPane().setLayout(null);
		frmLearnCaesarCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_learnEncryptionMenu a=new w_learnEncryptionMenu();
				a.class3frame();
				frmLearnCaesarCipher.dispose();
			}
		});
		btnBack.setBounds(10, 11, 127, 50);
		frmLearnCaesarCipher.getContentPane().add(btnBack);
		
		//JLabel lblToBeginLets = new JLabel("to begin, lets type a word/message below");
		lblToBeginLets=new JLabel("to begin, lets type a word/message below");
		lblToBeginLets.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblToBeginLets.setHorizontalAlignment(SwingConstants.CENTER);
		lblToBeginLets.setBounds(113, 11, 671, 82);
		frmLearnCaesarCipher.getContentPane().add(lblToBeginLets);
		
		textField = new JTextField();
		textField.setBounds(271, 188, 373, 20);
		frmLearnCaesarCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnStage = new JButton("Stage 1");
		btnStage.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage.setBackground(SystemColor.text);
		btnStage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme1=textField.getText();
				e_caesarCipher b=new e_caesarCipher();
				String stageone=b.teach1(encryptme1);
				String stageonetext="Firstly, we split each char and convert it to their respective ascii number";


				lblToBeginLets.setText(stageone);
				textPane.setText(stageonetext);
				
				
				
				
			}
		});
		btnStage.setBounds(190, 227, 123, 50);
		frmLearnCaesarCipher.getContentPane().add(btnStage);
		
		btnStage_1 = new JButton("Stage 2");
		btnStage_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_1.setBackground(SystemColor.text);
		btnStage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme2=textField.getText();
				e_caesarCipher c=new e_caesarCipher();
				String stagetwo=c.teach2(encryptme2);
				String stagetwotext="Next, we add 5 to each ascii value to encrypt it";


				lblToBeginLets.setText(stagetwo);
				textPane.setText(stagetwotext);
				
				
				
				
			}
		});
		btnStage_1.setBounds(323, 227, 123, 50);
		frmLearnCaesarCipher.getContentPane().add(btnStage_1);
		
		btnNewButton = new JButton("Stage 3");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptme3=textField.getText();
				e_caesarCipher d=new e_caesarCipher();
				String stagethree=d.teach3(encryptme3);
				String stagethreetext="Thirdly, we ensure the value is below z on the ascii chart";


				lblToBeginLets.setText(stagethree);
				textPane.setText(stagethreetext);
			}
		});
		btnNewButton.setBounds(456, 227, 123, 50);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Stage 4");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptme4=textField.getText();
				e_caesarCipher f=new e_caesarCipher();
				String stagefour=f.teach4(encryptme4);
				String stagefourtext="Lastly, we convert the new ascii values to their characters";


				lblToBeginLets.setText(stagefour);
				textPane.setText(stagefourtext);
			}
		});
		btnNewButton_1.setBounds(589, 227, 123, 50);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 149);
		frmLearnCaesarCipher.getContentPane().add(label);
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLearnCaesarCipher.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmLearnCaesarCipher.getContentPane().add(btnExit);
		
		textPane = new JTextPane();
		textPane.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(151, 104, 549, 73);
		frmLearnCaesarCipher.getContentPane().add(textPane);
		
	}
}
