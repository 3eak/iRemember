package iRemember;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;

public class w_learnAdler32 {

	private JFrame frmLearnAdler;
	private JTextField textField;
	private JLabel lblToBeginEnter;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void learnadler() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnAdler32 window = new w_learnAdler32();
					window.frmLearnAdler.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_learnAdler32() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearnAdler = new JFrame();
		frmLearnAdler.setTitle("Learn Adler 32 Hashing!");
		frmLearnAdler.setResizable(false);
		frmLearnAdler.setBounds(300, 100, 900, 500);
		frmLearnAdler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearnAdler.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		frmLearnAdler.getContentPane().setLayout(null);
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w_learnEncryptionMenu a=new w_learnEncryptionMenu();
				a.class3frame();
				frmLearnAdler.dispose();
				
			}
		});
		frmLearnAdler.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmLearnAdler.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\javakek\\iRemember\\bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 23, 160, 144);
		frmLearnAdler.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("This encryption is very different to the others as it is a hashing checksum method which cannot be decrypted");
		lblNewLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 323, 701, 14);
		frmLearnAdler.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(38, 204, 574, 20);
		frmLearnAdler.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnStage = new JButton("Stage 1");
		btnStage.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage.setBackground(Color.WHITE);
		btnStage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String encryptme1=textField.getText();
				e_adlerHashing b=new e_adlerHashing();
				String stageone=b.teach1(encryptme1);
				String stageonetext="Firstly, we find the value of A from the method below";


				lblToBeginEnter.setText(stageonetext);
				textPane.setText(stageone);
				
			}
		});
		btnStage.setBounds(38, 259, 134, 53);
		frmLearnAdler.getContentPane().add(btnStage);
		
		JButton btnStage_1 = new JButton("Stage 4");
		btnStage_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnStage_1.setBackground(Color.WHITE);
		btnStage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme4=textField.getText();
				e_adlerHashing b=new e_adlerHashing();
				String stagefour=b.teach4(encryptme4);
				String stagefourtext="Lastly, we convert our new string into hex for simplicity";


				lblToBeginEnter.setText(stagefourtext);
				textPane.setText(stagefour);
			}
		});
		btnStage_1.setBounds(478, 259, 134, 53);
		frmLearnAdler.getContentPane().add(btnStage_1);
		
		JButton btnNewButton = new JButton("Stage 2");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme2=textField.getText();
				e_adlerHashing b=new e_adlerHashing();
				String stagetwo=b.teach2(encryptme2);
				String stagetwotext="Secondly, we find the value of B from the method below";


				lblToBeginEnter.setText(stagetwotext);
				textPane.setText(stagetwo);
				
				
				
			}
		});
		btnNewButton.setBounds(182, 259, 134, 53);
		frmLearnAdler.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stage 3");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme3=textField.getText();
				e_adlerHashing b=new e_adlerHashing();
				String stagethree=b.teach3(encryptme3);
				String stagethreetext="Then we work out what our string must return as using the final method below";


				lblToBeginEnter.setText(stagethreetext);
				textPane.setText(stagethree);
			}
		});
		btnNewButton_1.setBounds(341, 259, 127, 53);
		frmLearnAdler.getContentPane().add(btnNewButton_1);
		
		lblToBeginEnter = new JLabel("To begin, enter a message and press stage 1");
		lblToBeginEnter.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblToBeginEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblToBeginEnter.setBounds(38, 145, 574, 39);
		frmLearnAdler.getContentPane().add(lblToBeginEnter);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("bin\\images\\adlerMethod.png"));
		label_2.setBounds(38, 343, 784, 119);
		frmLearnAdler.getContentPane().add(label_2);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLearnAdler.dispose();
			}
		});
		btnExit.setBounds(736, 285, 138, 52);
		frmLearnAdler.getContentPane().add(btnExit);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(38, 72, 574, 62);
		frmLearnAdler.getContentPane().add(textPane);
		
		
		
		
		
		
		
	}
}
