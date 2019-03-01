package iRemember;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JTextPane;



//for simplicity i have used the term CCM for CaesarCipherMulti


public class w_learnCCM {

	private JFrame frmLearnCaesarCipher;
	private JTextField textField;
	private JTextField txtExamplekey;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void caesarmulti() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnCCM window = new w_learnCCM();
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
	public w_learnCCM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnCaesarCipher = new JFrame();
		frmLearnCaesarCipher.setTitle("Learn Caesar Cipher Multi!");
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
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(177, 182, 394, 20);
		frmLearnCaesarCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtExamplekey = new JTextField();
		txtExamplekey.setText("exampleKey");
		txtExamplekey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtExamplekey.setBounds(581, 182, 154, 20);
		frmLearnCaesarCipher.getContentPane().add(txtExamplekey);
		txtExamplekey.setColumns(10);
		
		lblNewLabel_1 = new JLabel("To begin, enter a message in the text boxes below and press stage 1!");
		lblNewLabel_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(177, 124, 558, 29);
		frmLearnCaesarCipher.getContentPane().add(lblNewLabel_1);
		
		btnNewButton = new JButton("Stage 1");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme1=textField.getText();
				String key1=txtExamplekey.getText();
				
				e_caesarCipherMulti c=new e_caesarCipherMulti();
				String stageone=c.teach11(encryptme1,key1);
				String stageonetext="Firstly, we seperate each character from the key and the message";


				textPane.setText(stageone);
				lblNewLabel_1.setText(stageonetext);
				
				
			}
		});
		btnNewButton.setBounds(138, 213, 116, 64);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Stage 2");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme2=textField.getText();
				String key2=txtExamplekey.getText();
				
				e_caesarCipherMulti c=new e_caesarCipherMulti();
				String stagetwo=c.teach22(encryptme2,key2);
				String stagetwotext="Then we convert them to their appropiate ascii values and -96 to make it more managable";


				textPane.setText(stagetwo);
				lblNewLabel_1.setText(stagetwotext);
				
				
				
			}
		});
		btnNewButton_1.setBounds(268, 213, 116, 64);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Stage 5");
		btnNewButton_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptme5=textField.getText();
				String key5=txtExamplekey.getText();
				
				e_caesarCipherMulti c=new e_caesarCipherMulti();
				String stagefive=c.teach55(encryptme5,key5);
				String stagefivetext="After this, we add together the two corresponding ascii values";


				textPane.setText(stagefive);
				lblNewLabel_1.setText(stagefivetext);
				
				
				
			}
		});
		btnNewButton_2.setBounds(646, 213, 116, 64);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Stage 4");
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String encryptme4=textField.getText();
				String key4=txtExamplekey.getText();
				
				e_caesarCipherMulti c=new e_caesarCipherMulti();
				String stagefour=c.teach44(encryptme4,key4);
				String stagefourtext="Now we must check whether the value is past 'z'; if so we -26";


				textPane.setText(stagefour);
				lblNewLabel_1.setText(stagefourtext);
			}
		});
		btnNewButton_3.setBounds(520, 213, 116, 64);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Stage 3");
		btnNewButton_4.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_4.setBackground(SystemColor.text);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptme3=textField.getText();
				String key3=txtExamplekey.getText();
				
				e_caesarCipherMulti c=new e_caesarCipherMulti();
				String stagethree=c.teach33(encryptme3,key3);
				String stagethreetext="And lastly we add 96 and convert it back to their normal characters";


				textPane.setText(stagethree);
				lblNewLabel_1.setText(stagethreetext);
			}
		});
		btnNewButton_4.setBounds(394, 213, 116, 64);
		frmLearnCaesarCipher.getContentPane().add(btnNewButton_4);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(708, 11, 166, 142);
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
		textPane.setBounds(177, 11, 558, 97);
		frmLearnCaesarCipher.getContentPane().add(textPane);
	}
}
