package iRemember;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class e_caesarCipherMulti  {
	private Scanner input;
	@SuppressWarnings("unused")
	private String a;
	public String savenewpasstwo(String pass,String keyword){
		///System.out.println(pass);
		///System.out.println(keyword);
		int n;
		//String keyword = "examplekeyword";
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			asciipass=asciipass - 96;
			asciikey=asciikey-96;
			int encascii = asciipass + asciikey;
			if (encascii > 26) {
				encascii = encascii - 26;
			}
			encascii = encascii + 96;
			char newchar= (char)encascii;
			String newString=Character.toString(newchar);
			list.add(newString);
			


				
		}
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		///System.out.println(list);
		String newstring=list.toString();
		return listString;

	
	}
	public String decryptNewPassTwoTeach(String pass, String keyword) {
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			asciipass=asciipass - 96;
			asciikey=asciikey-96;
			int encascii = asciipass - asciikey;
			if (encascii < 0) {
				encascii = encascii + 26;
			}
			encascii = encascii + 96;
			char newchar= (char)encascii;
			String newString=Character.toString(newchar);
			list.add(newString);
			


				
		}
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		//System.out.println(list);
		String newstring = list.toString();
		return listString;
	}
	public String teach11(String pass, String keyword){
		///System.out.println(pass);
		///System.out.println(keyword);
		//System.out.println("So in this encryption type, we take the first word and the keyword and compare them together. ");
		//System.out.println("We go through each character seperately to add each character together.");
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			list.add(character + ";" + keych);
			//System.out.println(character +" " + keych);
		}
		n=-1;
		
		String newstring=list.toString();
		return newstring;
		
	}
	public String teach22(String pass, String keyword){
		
	
		//.out.println("And then we assign them to their ascii values and -96 so we can add them together without using high numbers");
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			int asciinewpass=asciipass - 96;
			int asciinewkey=asciikey-96;
			//System.out.println("Password: " + asciipass + " - 96 = " + asciinewpass + ". Keyword: " + asciikey + " - 96 = " + asciinewkey);
			list.add(asciinewpass +";" + asciinewkey);
		}
		n=-1;
		String newstring = list.toString();
		return newstring;
		
		
		
		
	}
	public String teach33(String pass, String keyword){
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		//System.out.println("Now we can + the two characters together to get our new enrypted character");
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			int asciinewpass=asciipass - 96;
			int asciinewkey=asciikey-96;
			int encascii = asciinewpass + asciinewkey;
			//System.out.println(asciinewpass + " + " + asciinewkey + " = " + encascii);
			list.add(asciinewpass+"+"+asciinewkey+"="+encascii);
		}
		n=-1;
		String newstring=list.toString();
		return newstring;
		
	}
		
	public String teach44(String pass, String keyword){
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		
		
		//System.out.println("Now we must quickly check to ensure that it is not bigger than z");
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			int asciinewpass=asciipass - 96;
			int asciinewkey=asciikey-96;
			int encascii = asciinewpass + asciinewkey;
			
			
			
			if (encascii > 26) {
				//System.out.println(encascii + " > 26 so we - 26");
				list.add(encascii+">26 so -26");
				encascii = encascii - 26;
				
			}
			else {
				list.add(encascii+"<26");
				//System.out.println(encascii + " < 26 so we leave it alone");
			}
			
		}
		String newstring=list.toString();
		return newstring;
	}
	public String teach55(String pass, String keyword){
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
	
		n=-1;
		//System.out.println("Lastly, we +96 to get the ascii value and return it back as a character and assign it to a list");
		for (char ch: pass.toCharArray()) {
			n=n+1;
			char[] cha;
			cha = keyword.toCharArray();
			if(n == len) {
				n=n-len;
			}
			char keych;
			keych=cha[n];
			char character = ch;
			int asciipass = (int)character;
			int asciikey = (int)keych;
			int asciinewpass=asciipass - 96;
			int asciinewkey=asciikey-96;
			int encascii = asciinewpass + asciinewkey;
			if (encascii > 26) {
				encascii = encascii - 26;
			}
			int encnewascii = encascii + 96;
			char newchar= (char)encnewascii;
			//System.out.println(encascii + " + 96 = " + encnewascii + " which is: " + newchar);			
			String newString=Character.toString(newchar);
			list.add(newString+";"+encnewascii);	
		}
		//System.out.println(list);
		String newstring=list.toString();
		return newstring;
	
	}
}
