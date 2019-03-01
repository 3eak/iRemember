
import java.util.Scanner;

public class iRemember extends caesarCypher {
	
private static Scanner input;

public static void main (String[] args) {
	
	int start;
	System.out.println("Learn Encryption! Welcome to iRemember, the secure, useful and smart new way to learn encryption!");
	input = new Scanner(System.in);
	System.out.println("Where do you want to start, press 1,2,3 or 4 respectively for 'What is Encryption',\n'Real World Application of Encryption', ''Learn Encryption' and 'Use Encryption for personal use!'");
	start=input.nextInt();
	switch(start) {
	case 1:
		System.out.println("You've selected: 'What is Encryption'");
		
		break;
	case 2:
		System.out.println("You've selected: 'Real World Application'");
		System.out.println("Welcome to a typical primary school system', in this system, passwords and usernames are uploaded, encrypted and stored on the system. passwords and usernames and technicians (admins) have permission to edit and upload new usernames and passwords to the system");
		
		break;
	case 3:
		System.out.println("You've selected: 'Learn Encryption'");
		System.out.println("Choose an encryption method to learn. 1 for Caesar Cypher normal. 2 for Caesar Cypher Multi. 3 for vigenere cypher. 4 for adler32 hashing and 5 for BSD Hashing");
		int d;
		d=input.nextInt();
		switch (d) {
		case 1:
			System.out.println("You've selected: CaesarCypher Normal");
			System.out.println("In this section we are gonna do a step by step on how a string is to be encrypted");
			System.out.println("Type in a word of your choice below:");
			Scanner inputb=new Scanner(System.in);
			String e;
			e = inputb.nextLine();
			iRemember f = new iRemember();
			System.out.println(f.saveNewPassOneTeach(e));
			System.out.println("Do you want to learn how to decrypt a word now?");
			int n;
			n = inputb.nextInt();
			if (n == 1) {
				System.out.println("Enter a word to decrypt ((Hint: You could try the word we just encrypyted above ^):");
				@SuppressWarnings("resource")
				Scanner inpute=new Scanner(System.in);
				String o = inpute.nextLine();
				System.out.println(f.decryptNewPassOneTeach(o));
			}
			else {
				System.out.println("Thank you for using iRemember");
				break;
			}
			System.out.println("Thank you for using iRemember");
			break;
		case 2:
			System.out.println("You've selected: CaesarCypher Multi");
			System.out.println("In this section we are gonna do a step by step on how a string is to be encrypted");
			System.out.println("Type in a word of your choice below:");
			Scanner inputc=new Scanner(System.in);
			String g;
			String i;
			System.out.println("Enter a word to encrypt: ");
			g = inputc.nextLine();
			System.out.println("Enter a word to use as a keyword to encrypt (the longer the stronger):");
			i = inputc.nextLine();
			iRemember h = new iRemember();
			System.out.println(h.saveNewPassTwoTeach(g,i));
			System.out.println("Do you want to learn how to decrypt your word now?");
			int m;
			m = inputc.nextInt();
			if (m == 1) {
				System.out.println("Enter a word to decrypt ((Hint: You could try the word we just encrypyted above ^):");
				@SuppressWarnings("resource")
				Scanner inputf=new Scanner(System.in);
				String p = inputf.nextLine();
				System.out.println("Enter a word to use as a key (Hint: If you are using the word we just encryped, you should use the old key too):");
				String q = inputf.nextLine();
				System.out.println(h.decryptNewPassTwoTeach(p,q));
			}
			else {
				System.out.println("Thank you for using iRemember");
			}
			System.out.println("Thank you for using iRemember");
			break;
		case 3:
			System.out.println("You've selected: VigenereCypher");
			System.out.println("In this section we are gonna do a step by step on how a string is to be encrypted");
			Scanner inputd=new Scanner(System.in);
			String j;
			String k;
			System.out.println("Enter a word to encrypt: ");
			j=inputd.nextLine();
			System.out.println("Enter a word to use as a keyword: ");
			k=inputd.nextLine();
			iRemember l = new iRemember();
			System.out.println(l.saveNewPassThreeTeach(j,k));
			System.out.println("Do you want to learn how to decrypt your word now?");
			Scanner inpute=new Scanner(System.in);
			int o;
			o = inpute.nextInt();
			if (o == 1) {
				iRemember s = new iRemember();
				System.out.println("Enter a word to decrypt ((Hint: You could try the word we just encrypyted above ^):");
				@SuppressWarnings("resource")
				Scanner inputf=new Scanner(System.in);
				String r = inputf.nextLine();
				System.out.println("Enter a word to use as a key (Hint: If you are using the word we just encryped, you should use the old key too):");
				String q = inputf.nextLine();
				System.out.println(s.decryptNewPassThreeTeach(r,q));
			}
			else {
				System.out.println("Thank you for using iRemember");
			}
			System.out.println("Thank you for using iRemember");
			break;
		case 4:
			System.out.println("You've selected: Adler32 Hashing");
			Scanner inputg=new Scanner(System.in);
			String aa;
			iRemember ab = new iRemember();
			System.out.println("Enter a word to encrypt: ");
			aa=inputg.nextLine();

			System.out.println(ab.saveNewPassFourAdler32(aa));
			break;
		case 5:
			System.out.println("You've chosen: BSD Hashing");
			Scanner inputh=new Scanner(System.in);
			String ac;
			String ba="0";
			iRemember ad = new iRemember();
			System.out.println("Enter a word to encrypt: ");
			ac=inputh.nextLine();
			for (char ch: ac.toCharArray()) {
				int ascCh=(int)ch;
				String binCh=Integer.toBinaryString(ascCh);
				ba=ba+""+binCh;
				}
			//System.out.println(ba);
			//System.out.println(ascCh);
			
			//byte[] z = ba.getBytes();
			System.out.println(ad.encryptAffine(ac));
			break;
		}
		
		
		break;
	case 4:
		int a;
		System.out.println("You've selected 'Use encryption for personal use'");
		System.out.println("Do you want to save a new password, retrieve an old password, or edit/delete an old password?");
		System.out.println("Press 1,2 or 3 respectively.");
		a=input.nextInt();
		switch(a) {
		case 1:
			System.out.println("Save a new password:");
			String c;
			Scanner inputa=new Scanner(System.in);
			c = inputa.nextLine();
			iRemember b = new iRemember();
			System.out.println(b.saveNewPassThree(c));
			break;
		case 2:
			System.out.println("Retrieve a password:");
			break;
		case 3:
			System.out.println("Edit/Delete a password:");
			break;
		
			}
		
		}
	}
}


