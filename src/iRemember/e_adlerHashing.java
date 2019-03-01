package iRemember;

import java.util.ArrayList;
import java.util.List;

public class e_adlerHashing {
	
	public String saveNewPassFourAdler32(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		int hashValueB=pass.length();
		int modValA;
		int modValB;
		int n = pass.length();
		int a=n;
		int b=0;
		int adler32;
		int hashedInt;
		int hashPassInt;
		char[] hashPass;
		String adler32String;
		for (char d: pass.toCharArray()) {
			int dint= (int)d;
			hashValA=dint+hashValA;
			
			/* in this loop we go through each character of the given message
			 and find the ascii value and plus them together. This will give us the 
			 value we need to find our A. The following two lines will + 1 and mod to
			 65521, now we have our value of A.
			 */
			
		}
		hashValA=hashValA+hashValueA;
		modValA=hashValA % 65521;
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
		}
		hashValB=hashValB + n;
		modValB=hashValB % 65521;
		adler32=(hashValB * 65536) + hashValA;
		adler32String=Integer.toHexString(adler32);
		
		/*
		 * In this section we use our value that we retrieve from the for loop and 
		 * combine it with the and mod it together to find our value for b. 
		 * Finally we follow our formula and multiply our value of b by 65536 and
		 * add together that new value to our a. Finally we hex our value to get a
		 * new string hashed.
		 */
		
		return adler32String;
	}
	
	public String teach1(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		int modValA;
		int modValB;
		int n = pass.length();
		int a=n;
		int b=0;
		int adler32;
		int hashedInt;
		int hashPassInt;
		char[] hashPass;
		String adler32String;
		for (char d: pass.toCharArray()) {
			int dint= (int)d;
			hashValA=dint+hashValA;
		}
		hashValA=hashValA+hashValueA;
		modValA=hashValA % 65521;
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
		}
		List<String> list = new ArrayList<String>();
		list.add(hashValA+"");
		String newString=list.toString();
		return newString;
	}
	
	public String teach2(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		int modValA;
		int modValB;
		int n = pass.length();
		int a=n;
		int b=0;
		int adler32;
		int hashedInt;
		int hashPassInt;
		char[] hashPass;
		String adler32String;
		for (char d: pass.toCharArray()) {
			int dint= (int)d;
			hashValA=dint+hashValA;
		}
		hashValA=hashValA+hashValueA;
		modValA=hashValA % 65521;
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
		}
		hashValB=hashValB + n;
		List<String> list = new ArrayList<String>();
		list.add(hashValB+"");
		String newString=list.toString();
		return newString;
	}
	
	public String teach3(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		int modValA;
		int modValB;
		int n = pass.length();
		int a=n;
		int b=0;
		int adler32;
		int hashedInt;
		int hashPassInt;
		char[] hashPass;
		String adler32String;
		for (char d: pass.toCharArray()) {
			int dint= (int)d;
			hashValA=dint+hashValA;
		}
		hashValA=hashValA+hashValueA;
		modValA=hashValA % 65521;
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
		}
		hashValB=hashValB + n;
		modValB=hashValB % 65521;
		List<String> list = new ArrayList<String>();
		adler32=(hashValB * 65536) + hashValA;
		list.add("("+hashValB+"* 65536) + "+ hashValA + " = "+adler32);
		list.add("");
		String newString=list.toString();
		return newString;
	}
	
	public String teach4(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		int modValA;
		int modValB;
		int n = pass.length();
		int a=n;
		int b=0;
		int adler32;
		int hashedInt;
		int hashPassInt;
		char[] hashPass;
		String adler32String;
		for (char d: pass.toCharArray()) {
			int dint= (int)d;
			hashValA=dint+hashValA;
		}
		hashValA=hashValA+hashValueA;
		modValA=hashValA % 65521;
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
		}
		hashValB=hashValB + n;
		modValB=hashValB % 65521;
		adler32=(hashValB * 65536) + hashValA;
		adler32String=Integer.toHexString(adler32);
		return adler32String;
	}
}
