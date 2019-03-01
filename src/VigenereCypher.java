import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VigenereCypher extends hashingCypherAdler32 {

	public String saveNewPassThree(String pass) {
		String keyword="examplekeyword";
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
		System.out.println(list);
		return keyword;
	
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
		System.out.println(list);
		return keyword;
	}
	public String saveNewPassThreeTeach(String pass, String keyword) {
		@SuppressWarnings("unused")
		String a;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n;
		n=-1;
		int len;
		len = keyword.length();
		List<String> list = new ArrayList<String>();
		System.out.println("In this cipher we use the vigenere table to compare our word and keyword to get the letter.");
		System.out.println("We use this table: https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Vigen%C3%A8re_square_shading.svg/800px-Vigen%C3%A8re_square_shading.svg.png");
		System.out.println("So firstly, we compare each letter by letter");
		a=input.nextLine();
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
			System.out.println(character +" " + keych);
		}
		a=input.nextLine();
		System.out.println("Then we convert them to their ascii numbers (-96 to use easier numbers) and compare");
		
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
			System.out.println(asciipassnew +" " + asciikeynew);
		}
		a=input.nextLine();
		System.out.println("Then we vigenere it by adding them together and minusing 1, this will give us the vigenere character from the table.");
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
			System.out.println("(" +asciipassnew +" + " + asciikeynew + ") - 1 = " + encch);
		}
		a=input.nextLine();
		System.out.println("Then we must check to make sure the characters are eligble");
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
				System.out.println(encch + " > 26 so we -26");
				encch = encch -26;
			}
			else { 
				System.out.println(encch + " < 26 so we leave it alone");
			}
		}
		a=input.nextLine();
		System.out.println("And lastly we convert them back and put them together.");
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
		System.out.println(list);
		return keyword;
	
	}
}
