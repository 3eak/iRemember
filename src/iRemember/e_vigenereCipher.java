package iRemember;

import java.util.ArrayList;
import java.util.List;

public class e_vigenereCipher {

	public String teachv1(String pass, String keyword){
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
	public String teachv2(String pass, String keyword){
		
	
		//System.out.println("And then we assign them to their ascii values and -96 so we can add them together without using high numbers");
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
	public String teachv3(String pass, String keyword){
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		//System.out.println("Now we can + the two characters together to get our new value, after this we must - 1 to find our new encrypted value");
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
			int encascii=asciinewpass+asciinewkey-1;
			//System.out.println(asciinewpass + " + " + asciinewkey + " = " + encascii);
			list.add(asciinewpass+"+"+asciinewkey+"="+encascii);
		}
		n=-1;
		String newstring=list.toString();
		return newstring;
		
	}
		
	public String teachv4(String pass, String keyword){
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
			int encascii=asciinewpass+asciinewkey-1;
			
			
			
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
	public String teachv5(String pass, String keyword){
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
			int encascii=asciinewpass+asciinewkey-1;
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


	
	
	
	
	public String saveNewPassThree(String pass,String keyword) {
		//String keyword="examplekeyword";
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
			///System.out.println(character +" " + keych);
			int asciipass = (int)character;
			int asciikey = (int)keych;
			int asciipassnew= asciipass - 96;
			int asciikeynew=asciikey-96;
			int encch=asciipassnew+asciikeynew-1;
			if (encch > 26) {
				encch = encch -26;
			}
			int newenc=encch +96;
			char newchar=(char)newenc;
			String newString=Character.toString(newchar);
			list.add(newString);
			
		
		
	}
		//System.out.println(list);
		String newstring=list.toString();
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		return listString;
	
	}
	public String decryptNewPassThreeTeach(String pass, String keyword) {
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
			int encascii = asciipass - asciikey +1 ;
			if (encascii < 0) {
				encascii = encascii + 26;
			}
			else if (encascii > 26){
				encascii = encascii -26;
			}
			encascii = encascii + 96;
			char newchar= (char)encascii;
			String newString=Character.toString(newchar);
			list.add(newString);
		}
		//System.out.println(list);
		String listString = "";
		for (String s : list)
		{
		    listString += s + "";
		}
		String newstring=list.toString();
		return listString;
	}
}
