package iRemember;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class w_learnAffine {

	private JFrame frmLearn;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblToBeginEnter;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void learnAffine() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					w_learnAffine window = new w_learnAffine();
					window.frmLearn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public w_learnAffine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLearn = new JFrame();
		frmLearn.setTitle("Learn Affine Cipher!");
		frmLearn.setResizable(false);
		frmLearn.setBounds(300, 100, 900, 400);
		frmLearn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearn.setIconImage(Toolkit.getDefaultToolkit().getImage("bin\\images\\iRememberLogoSmall.png"));
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.text);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w_learnEncryptionMenu a= new w_learnEncryptionMenu();
				a.class3frame();
				frmLearn.dispose();
			}
		});
		frmLearn.getContentPane().setLayout(null);
		btnBack.setBounds(10, 11, 127, 50);
		frmLearn.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("bin\\images\\iRememberLogoSmall.png"));
		label.setBounds(714, 11, 160, 164);
		frmLearn.getContentPane().add(label);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setBounds(71, 172, 343, 20);
		frmLearn.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("2329");
		textField_1.setBounds(436, 172, 127, 20);
		frmLearn.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblToBeginEnter = new JLabel("to begin, enter a message and/or a INTEGER key");
		lblToBeginEnter.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblToBeginEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblToBeginEnter.setBounds(20, 56, 621, 50);
		frmLearn.getContentPane().add(lblToBeginEnter);
		
		JLabel lblNewLabel = new JLabel("The string below is the SYMBOLS that the encryption goes through to acquire a character");
		lblNewLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(5, 264, 727, 26);
		frmLearn.getContentPane().add(lblNewLabel);
		
		JLabel lblabcdefghijklmnopqrstuvwxyzuabubbuuauacueueuedufufaueufdueucucucdududaueudducufcucueufudfudcabcdefghijklmnopqrstuvwxyzubuaubdubcucuaueuuauaeuubfububububeud = new JLabel(" !#'$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ\u00AB\u00BB\u2014\u00A6\u00AC\u00E1[]^_`\u00E9\u00ED\u00F3\u00FA\u1E83\u00FD\u00E7\u00C1\u00C9\u00CD\u00D3\u00DA\u1E82\u00DD\u00C7\u00FC\u00C4\u00E4\u00F6\u00DF\u00DC{|}~abcdefghijklmnopqrstuvwxyz\u00B6\u00A7\u00BD\u00BC\u00C6\u00A5\u00E6\u2030\u00A9\u00AE\u2122\u00BF\u00B5\u00B2\u00B3\u00BE\u00D0");
		lblabcdefghijklmnopqrstuvwxyzuabubbuuauacueueuedufufaueufdueucucucdududaueudducufcucueufudfudcabcdefghijklmnopqrstuvwxyzubuaubdubcucuaueuuauaeuubfububububeud.setHorizontalAlignment(SwingConstants.CENTER);
		lblabcdefghijklmnopqrstuvwxyzuabubbuuauacueueuedufufaueufdueucucucdududaueudducufcucueufudfudcabcdefghijklmnopqrstuvwxyzubuaubdubcucuaueuuauaeuubfububububeud.setFont(new Font("Myriad Pro", Font.PLAIN, 9));
		lblabcdefghijklmnopqrstuvwxyzuabubbuuauacueueuedufufaueufdueucucucdududaueudducufcucueufudfudcabcdefghijklmnopqrstuvwxyzubuaubdubcucuaueuuauaeuubfububububeud.setBounds(10, 301, 722, 14);
		frmLearn.getContentPane().add(lblabcdefghijklmnopqrstuvwxyzuabubbuuauacueueuedufufaueufdueucucucdududaueudducufcucueufudfudcabcdefghijklmnopqrstuvwxyzubuaubdubcucuaueuuauaeuubfububububeud);
		
		JButton btnNewButton = new JButton("Stage 1");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String encryptme1=textField.getText();
				String key=textField_1.getText();
				int key1=Integer.parseInt(key);
				e_affineInspired c=new e_affineInspired();
				String stageone=c.teachaff1(encryptme1,key1);
				String stageonetext="Firstly, we work out our A and B. A = our key / the length of our symbols floored. B= our key mod(%) of our length of symbols";


				lblToBeginEnter.setText(stageone);
				textPane.setText(stageonetext);
				
				
				
			}
		});
		btnNewButton.setBounds(71, 203, 111, 50);
		frmLearn.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stage 2");
		btnNewButton_1.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme2=textField.getText();
				String key_1=textField_1.getText();
				int key2=Integer.parseInt(key_1);
				e_affineInspired c=new e_affineInspired();
				String stagetwo=c.teachaff2(encryptme2,key2);
				String stagetwotext="Now we have our keys, in this step we find out our current affineIndex for each character by going through our message.";


				lblToBeginEnter.setText(stagetwo);
				textPane.setText(stagetwotext);
			}
		});
		btnNewButton_1.setBounds(192, 203, 111, 50);
		frmLearn.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stage 3");
		btnNewButton_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme3=textField.getText();
				String key_2=textField_1.getText();
				int key3=Integer.parseInt(key_2);
				e_affineInspired c=new e_affineInspired();
				String stagethree=c.teachaff3(encryptme3,key3);
				String stagethreetext="this is where it gets complicated. we do (A+B)*affineIndex and then the answer of that mod the length of our symbols. For each character.";


				lblToBeginEnter.setText(stagethree);
				textPane.setText(stagethreetext);
			}
		});
		btnNewButton_2.setBounds(331, 203, 111, 50);
		frmLearn.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Stage 4");
		btnNewButton_3.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String encryptme4=textField.getText();
				String key_3=textField_1.getText();
				int key4=Integer.parseInt(key_3);
				e_affineInspired c=new e_affineInspired();
				String stagefour=c.teachaff4(encryptme4,key4);
				String stagefourtext="lastly, we apply this new index to our character. If the original character was not in our affine, it is not encrypted.";


				lblToBeginEnter.setText(stagefour);
				textPane.setText(stagefourtext);
			}
		});
		btnNewButton_3.setBounds(452, 203, 111, 50);
		frmLearn.getContentPane().add(btnNewButton_3);
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btnExit.setBackground(SystemColor.text);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLearn.dispose();
			}
		});
		btnExit.setBounds(736, 298, 138, 52);
		frmLearn.getContentPane().add(btnExit);
		
		textPane = new JTextPane();
		textPane.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(30, 117, 611, 39);
		frmLearn.getContentPane().add(textPane);
		
	}
}
