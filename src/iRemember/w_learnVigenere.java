package iRemember;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JTextPane;

public class w_learnVigenere {

	private JFrame frmLearnVigenereCipher;
	private JTextField textField;
	private JTextField txtExamplekey;
	private JLabel image;
	private ImageIcon img;
	private JButton btnStage;
	private JButton btnStage_1;
	private JButton btnStage_2;
	private JButton btnStage_3;
	private JButton btnStage_4;
	private JLabel lbl;
	private JLabel label_2;
	private JTextPane textPane;
	/**
	 * Launch the application.
	 */
	public static void learnV() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnVigenere window = new w_learnVigenere();
					window.frmLearnVigenereCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_learnVigenere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnVigenereCipher = new JFrame();
		frmLearnVigenereCipher.setTitle("Learn Vigenere Cipher!");
		frmLearnVigenereCipher.setResizable(false);
		frmLearnVigenereCipher.getContentPane().setBackground(SystemColor.control);
		frmLearnVigenereCipher.setBounds(300, 100, 900, 600);
		frmLearnVigenereCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearnVigenereCipher.getContentPane().setLayout(null);
		frmLearnVigenereCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_learnEncryptionMenu a= new w_learnEncryptionMenu();
				a.class3frame();
				frmLearnVigenereCipher.dispose();
			}
		});
		btnBack.setBounds(10, 11,127, 50);
		frmLearnVigenereCipher.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(36, 191, 356, 20);
		frmLearnVigenereCipher.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtExamplekey = new JTextField();
		txtExamplekey.setText("exampleKey");
		txtExamplekey.setBounds(402, 191, 140, 20);
		frmLearnVigenereCipher.getContentPane().add(txtExamplekey);
		txtExamplekey.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\vCipherGrid.jpg"));
		label.setBounds(564, 166, 320, 331);
		frmLearnVigenereCipher.getContentPane().add(label);
		
		lbl = new JLabel("To begin, enter a message and a key to start learning!");
		lbl.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(20, 41, 534, 76);
		frmLearnVigenereCipher.getContentPane().add(lbl);
		
		btnStage = new JButton("Stage 1");
		btnStage.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage.setBackground(SystemColor.text);
		btnStage.setBounds(24, 236, 98, 51);
		frmLearnVigenereCipher.getContentPane().add(btnStage);
		btnStage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme1=textField.getText();
				String key1=txtExamplekey.getText();
				
				e_vigenereCipher c=new e_vigenereCipher();
				String stageone=c.teachv1(encryptme1,key1);
				String stageonetext="So in this encryption type, we take the first word and the keyword and compare them together.";


				lbl.setText(stageone);
				textPane.setText(stageonetext);
				
			
			}
		});
		
		btnStage_1 = new JButton("Stage 2");
		btnStage_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_1.setBackground(SystemColor.text);
		btnStage_1.setBounds(132, 236, 98, 51);
		frmLearnVigenereCipher.getContentPane().add(btnStage_1);
		btnStage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme2=textField.getText();
				String key2=txtExamplekey.getText();
				
				e_vigenereCipher c=new e_vigenereCipher();
				String stagetwo=c.teachv2(encryptme2,key2);
				String stagetwotext="And then we assign them to their ascii values and -96 so we can add them together without using high numbers";


				lbl.setText(stagetwo);
				textPane.setText(stagetwotext);
				
			
			}
		});
		
		btnStage_2 = new JButton("Stage 3");
		btnStage_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_2.setBackground(SystemColor.text);
		btnStage_2.setBounds(240, 236, 98, 51);
		frmLearnVigenereCipher.getContentPane().add(btnStage_2);
		btnStage_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme3=textField.getText();
				String key3=txtExamplekey.getText();
				
				e_vigenereCipher c=new e_vigenereCipher();
				String stagethree=c.teachv3(encryptme3,key3);
				String stagethreetext="Now we can + the two characters together to get our new value, after this we must - 1 to find our new encrypted value";


				lbl.setText(stagethree);
				textPane.setText(stagethreetext);
				
			
			}
		});
		
		btnStage_3 = new JButton("Stage 4");
		btnStage_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_3.setBackground(SystemColor.text);
		btnStage_3.setBounds(348, 236, 98, 51);
		frmLearnVigenereCipher.getContentPane().add(btnStage_3);
		btnStage_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme4=textField.getText();
				String key4=txtExamplekey.getText();
				
				e_vigenereCipher c=new e_vigenereCipher();
				String stagefour=c.teachv4(encryptme4,key4);
				String stagefourtext="Now we must quickly check to ensure that it is not bigger than z";


				lbl.setText(stagefour);
				textPane.setText(stagefourtext);
				
			
			}
		});
		
		btnStage_4 = new JButton("Stage 5");
		btnStage_4.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_4.setBackground(SystemColor.text);
		btnStage_4.setBounds(456, 236, 98, 51);
		frmLearnVigenereCipher.getContentPane().add(btnStage_4);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label_2.setBounds(722, 11, 152, 155);
		frmLearnVigenereCipher.getContentPane().add(label_2);
		btnStage_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme5=textField.getText();
				String key5=txtExamplekey.getText();
				
				e_vigenereCipher c=new e_vigenereCipher();
				String stagefive=c.teachv5(encryptme5,key5);
				String stagefivetext="Lastly, we +96 to get the ascii value and return it back as a character and assign it to a list";


				lbl.setText(stagefive);
				textPane.setText(stagefivetext);
				
			
			}
		});
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLearnVigenereCipher.dispose();
			}
		});
		btnExit.setBounds(736, 498, 138, 52);
		frmLearnVigenereCipher.getContentPane().add(btnExit);
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textPane.setBounds(30, 111, 524, 65);
		frmLearnVigenereCipher.getContentPane().add(textPane);
		
	}
}
