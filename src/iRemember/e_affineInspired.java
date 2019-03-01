package iRemember;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class e_affineInspired {
	String SYMBOLS = " !#'$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ«»—¦¬á[]^_`éíóúẃýçÁÉÍÓÚẂÝÇüÄäößÜ{|}~abcdefghijklmnopqrstuvwxyz¶§½¼Æ¥æ‰©®™¿µ²³¾Ð";
	String CHECK = " !#'$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ«»—¦¬á[]^_`éíóúẃýçÁÉÍÓÚẂÝÇüÄäößÜ{|}~abcdefghijklmnopqrstuvwxyz¶§½¼Æ¥æ‰©®™¿µ²³¾Ð                                                                                                           ";
	String encryptAffine(String pass,int key) {
		Double keyA= new Double(key/SYMBOLS.length());
		List<String> list = new ArrayList<String>();
		keyA=Math.floor(keyA);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Character> f = new ArrayList();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int affineIndex= CHECK.indexOf(character);
			if (affineIndex <0) {
				list.add(character+"");
			}
			else {
				int y=(keyAa*affineIndex)+keyB;
				int z=y%SYMBOLS.length();
				char x=SYMBOLS.charAt(z);
				list.add(x+"");
			}
			}
		String listString="";
		for (String s : list)
		{
		    listString += s + "";
		}
		return listString;
		
	}
	public String teachaff1(String pass, int key) { 
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		List<String> list = new ArrayList<String>();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		String keyAString=Integer.toString(keyAa);
		list.add("A="+keyAString+", B="+keyB);
		String newstring=list.toString();
		return newstring;
		
		/*
		 * Firstly, we work out our key A and our key B. A = our key / 
		 * the length of our symbols floored. B= our key mod of our 
		 * length of our symbols
		 */
		
		
	}
	public String teachaff2(String pass, int key) {
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		List<String> list = new ArrayList<String>();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		list.add("Affine Index =");
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int affineIndex= CHECK.indexOf(character);
			String affineString=Integer.toString(affineIndex);
			list.add(affineString);
		}
		String newstring=list.toString();
		return newstring;
		
		/*
		 * now we have our keys, in this step we find out
		 * our current affineIndex for each character by going through our message
		 */
		
	}
	public String teachaff3(String pass, int key) {
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		List<Character> f = new ArrayList();
		List<String> list = new ArrayList<String>();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		list.add("((A+B)*affineIndex)%SYMBOL.length = ");
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int affineIndex= CHECK.indexOf(character);
			String affineString=Integer.toString(affineIndex);
			if (affineIndex <0) {
				list.add(""+character);
			}
			else {
				int y=(keyAa+keyB)*affineIndex;
				int z=y%SYMBOLS.length();
				list.add(z+"");
			}
		}
		String newstring=list.toString();
		return newstring;
		
		/*
		 * this is where it gets complicated. we do (A+B)*affineIndex and then 
		 * the answer of that mod the length of our symbols. For each character
		 */
		
	}
	public String teachaff4(String pass, int key) {
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		List<Character> f = new ArrayList();
		List<String> list = new ArrayList<String>();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		list.add("Encrypted Message = ");
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int affineIndex= CHECK.indexOf(character);
			String affineString=Integer.toString(affineIndex);
			if (affineIndex <0) {
				list.add(""+character);
			}
			else {
				int y=(keyAa+keyB)*affineIndex;
				int z=y%SYMBOLS.length();
				char x=SYMBOLS.charAt(z);
				list.add(x+"");
			}
		}
		String newstring=list.toString();
		return newstring;
		
		/*
		 * lastly, we apply this new index to our character and add 
		 * it to the list. if the original character was not in our 
		 * affine, it is not encrypted.
		 */
		
	}

	public int ModInverse(int a, int b) {
		String aa=Integer.toString(a);
		String bb=Integer.toString(b);
		BigInteger ab=new BigInteger(aa);
		BigInteger ba=new BigInteger(bb);
		BigInteger cc=ab.modInverse(ba);
		int zz=cc.intValue();
		return zz;
		
		/*
		 * this simple piece of code does the mod inverse of
		 * two numbers, as there is no method of doing this that i could find in java.
		 */
	}
	
	public String decryptAffine(String pass,int key) {
		
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		int keyAa=keyA.intValue();
		int symlen=SYMBOLS.length();
		int keyB= key%SYMBOLS.length();
		int gg=ModInverse(keyAa,symlen);
		List<String> list = new ArrayList<String>();
		for (char ch: pass.toCharArray()) {
			char character = ch;
			int affineIndex= CHECK.indexOf(character);
			if (affineIndex <0) {
				list.add(character+"");
			}
			else {
				int yy=(affineIndex-keyB);
				int yyy=gg*yy;
				int z=yyy%SYMBOLS.length();
				char x=SYMBOLS.charAt(z);
				list.add(x+"");
			}
			}
		String listString="";
		for (String s : list)
		{
		    listString += s + "";
		}
		return listString;
		
	}

}
