import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class caesarCypher extends caesarCypherMulti{

	private Scanner input;
	@SuppressWarnings("unused")
	private String a;
	public String savenewpassone(String pass){
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int ascii =(int)character;
			int encrypt = ascii + 5;
			if (encrypt > 122) {
				encrypt = encrypt - 26;
			}
			char newchar = (char)encrypt;
			String newString = Character.toString(newchar);
			list.add(newString);
		}
		System.out.println(list);
		String encPass=pass;
		/*
		FileWriter writer = new FileWriter("fileA.txt");
		for (String str:list) {
			writer.write( list);
		}
		writer.close();
		*/
		
		String[] strarray = new String[list.size()];
		list.toArray(strarray);
		System.out.println(strarray);
		return encPass;
		
	}
	
	public String decryptNewPassOneTeach(String teachPass) {
		List<String> list = new ArrayList<String>();
		for (char ch: teachPass.toCharArray()) {
			char character = ch;
			int ascii =(int)character;
			int encrypt = ascii - 5;
			if (encrypt < 97) {
				encrypt = encrypt + 26;
			}
			char newchar = (char)encrypt;
			String newString = Character.toString(newchar);
			list.add(newString);
		}
		System.out.println(list);
		return teachPass;
	}

	public String saveNewPassOneTeach(String teachPass) {
		List<String> list = new ArrayList<String>();
		input = new Scanner(System.in);
		
		System.out.println("Firstly, the computer converts the string to seperate characters");
		
		for (char ch: teachPass.toCharArray()) {
			char character = ch;
			System.out.print(character + " ");
		}
		a=input.nextLine();
		System.out.println("Then it converts every character into its ascii equilavent");
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii =(int)character;
			System.out.print(ascii + " ");
		}
		
		a=input.nextLine();
		System.out.println("Then we add 5 to this ascii integer");
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			System.out.println(ascii + " + 5 = " + encrypt);
		}
		a=input.nextLine();
		System.out.println("We now have to check if the character is bigger than z, z = 122 in ascii so we check if it is bigger than 122");
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			if (encrypt > 122) {
				System.out.println(encrypt + " > 122 so we must -26");
				encrypt = encrypt - 26;
			}
			System.out.println(encrypt + " < 122 so we change nothing");
		}
		a=input.nextLine();
		System.out.println("Lastly, we convert it all back to characters and assign them to a list");
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			if (encrypt > 122) {
				
				encrypt = encrypt - 26;
			}
			char newchar = (char)encrypt;
			String newString = Character.toString(newchar);
			list.add(newString);
		}
		
		System.out.println(list);
		String encPass=teachPass;
		return encPass;
	}

}
