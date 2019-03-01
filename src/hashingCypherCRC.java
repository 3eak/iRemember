import java.util.ArrayList;
import java.util.List;

public class hashingCypherCRC {
/*
	public String CRC32 (String pass) { 
		int len=pass.length();
		int j;
		int rema;
		int n=-1;
		String CRC32String;
		int remb=1;
		int rem=0;
		for (char ch: pass.toCharArray()) {
			n=n+1;
			int ascCh=(int)ch;
			String binCh=Integer.toBinaryString(ascCh);
			int bin=Integer.parseInt(binCh);
			//int binChar=String.toInteger(binCh);
			//System.out.println(binCh);
			///System.out.println(ch);
			rema=rem^bin;
			//System.out.println(rema);
			///System.out.println(rem);
			for (j = 0; j <= 8; j =j+ 1) { 
				//System.out.println(j);
				if (j==8) {
					rema=(rema >> 1) ^ 0x8408;
				} else {
					rema=(rema >> 1);
				}
					
				
			}
			System.out.println(rema);
			remb=remb*rema;
		}
		CRC32String=Integer.toHexString(remb);
		System.out.println(CRC32String);
		
		
		
		
		return pass;
	}
	
	byte hashingBSD(byte[] pass) {
		byte check=0;
		
		for (byte a: pass) {
			System.out.println(check);
			check=(byte)(((check & 0xFF) >>>1)+((check & 0x1) << 7) );
			System.out.println(check);
			check = (byte)((check+a) & 0xFF);
			System.out.println(check);
		}
		return check;
	}
	
	byte hashingBSD(byte[] pass) {
	    byte checksum = 0;
	    for (byte cur_byte: pass) {
	        checksum = (byte) (((checksum & 0xFF) >>> 1) + ((checksum & 0x1) << 7)); // Rotate the accumulator
		checksum = (byte) ((checksum + cur_byte) & 0xFF);                        // Add the next chunk
	    }
	    return checksum;
	}
	
	
	byte hashingLRC(byte[] b) {
		byte LRC=0;
		for (byte cur_b: b) {
			LRC=(LRC+b) && 0xFF;
		}
		LRC =(((LRC ^ 0xFF)+1)&& 0xFF);
		System.out.println(LRC);
		
	}
		*/
	String SYMBOLS = " !#'$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ«»—¦¬á[]^_`éíóúẃýçÁÉÍÓÚẂÝÇüÄäößÜ{|}~abcdefghijklmnopqrstuvwxyz¶§½¼Æ¥æ‰©®™¿µ²³¾Ð";
	String CHECK = " !#'$%&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ«»—¦¬á[]^_`éíóúẃýçÁÉÍÓÚẂÝÇüÄäößÜ{|}~abcdefghijklmnopqrstuvwxyz¶§½¼Æ¥æ‰©®™¿µ²³¾Ð                                                                                                           ";
	String encryptAffine(String pass) {
		int key=2023;
		Double keyA= new Double(key/SYMBOLS.length());
		keyA=Math.floor(keyA);
		//System.out.println(keyA);
		//List<String> list = new ArrayList<String>();
		//List<Integer> e = new ArrayList();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Character> f = new ArrayList();
		int keyAa=keyA.intValue();
		int keyB= key%SYMBOLS.length();
		///Array ciphertext=[];
		for (char ch: pass.toCharArray()) {
			char character = ch;
			//int charint=(int)character;
			int affineIndex= CHECK.indexOf(character);
			//System.out.println(affineIndex);
			if (affineIndex <0) {
				f.add(character);
			}
			else {
				int y=(keyAa+keyB)*affineIndex;
				int z=y%SYMBOLS.length();
				char x=SYMBOLS.charAt(z);
				f.add(x);
			}

			//int y=(keyAa + keyB)*affineIndex;
			//int z=y%SYMBOLS.length();
			//char x=SYMBOLS.charAt(z);
			//f.add(x); 
			}
		System.out.println(f);
			
		
		//System.out.println(list);
		return pass;
		
	}

		
		
	}
		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

