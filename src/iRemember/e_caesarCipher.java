package iRemember;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e_caesarCipher extends e_caesarCipherMulti {

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
		//System.out.println(list);
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
		
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		//System.out.println(strarray);
		//String newstring=list.toString();
		return listString;
		
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
		///System.out.println(list);
		//String[] strarray = new String[list.size()];
		//list.toArray(strarray);
		String newstring=list.toString();
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		return listString;
	}

	public String teach1(String teachPass) {
		List<String> list = new ArrayList<String>();
		
		//System.out.println("Firstly, the computer converts the string to seperate characters");
		
		for (char ch: teachPass.toCharArray()) {
			char character = ch;
			list.add(character + " ");
		}
		//String newstring1=list.toString();
		//return newstring1;
		
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii =(int)character;
			list.add(ascii + " ");
		}
		String newstring1=list.toString();
		return newstring1;
	}
	public String teach2(String teachPass) {
		List<String> list = new ArrayList<String>();
		//System.out.println("Then we add 5 to this ascii integer");
		
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			list.add(ascii + " + 5 = " + encrypt);
		}
		String newstring2=list.toString();
		return newstring2;
	}
	public String teach3(String teachPass) {
		//System.out.println("We now have to check if the character is bigger than z, z = 122 in ascii so we check if it is bigger than 122");
		List<String> list = new ArrayList<String>();
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			if (encrypt > 122) {
				list.add(encrypt + " > 122 so we must -26");
				encrypt = encrypt - 26;
			}
			else {list.add(encrypt + " < 122 ");}
		}
		String newstring3=list.toString();
		return newstring3;
	}
	public String teach4(String teachPass) {
		//System.out.println("Lastly, we convert it all back to characters and assign them to a list");
		List<String> list = new ArrayList<String>();
		for (char ch:teachPass.toCharArray()) {
			char character = ch;
			int ascii = (int)character;
			int encrypt = ascii + 5;
			if (encrypt > 122) {
				
				encrypt = encrypt - 26;
			}
			//String encryptstring=encrypt;
			list.add(encrypt+"");
			char newchar = (char)encrypt;
			String newString = Character.toString(newchar);
			list.add(newString);
		}
		
		//System.out.println(list);
		//String encPass=teachPass;
		String newstring4=list.toString();
		return newstring4;
	}

}
