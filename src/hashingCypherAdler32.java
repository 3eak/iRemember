
public class hashingCypherAdler32 extends hashingCypherCRC {
	public String saveNewPassFourAdler32(String pass) {
		int hashValA=0;
		int hashValB=0;
		int hashValueA=1;
		@SuppressWarnings("unused")
		int hashValueB=pass.length();
		@SuppressWarnings("unused")
		int modValA;
		@SuppressWarnings("unused")
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
		///System.out.println(modValA);
		for (@SuppressWarnings("unused")
		char d: pass.toCharArray()) {
			hashPass=pass.toCharArray();
			hashPassInt=(int)hashPass[b];
			hashedInt=hashPassInt*a;
			b=b+1;
			a=a-1;
			hashValB=hashValB+hashedInt;
			///System.out.println(hashValB);
		}
		hashValB=hashValB + n;
		modValB=hashValB % 65521;
		///System.out.println(modValB);
		adler32=(hashValB * 65536) + hashValA;
		adler32String=Integer.toHexString(adler32);
		///System.out.println(adler32);
		System.out.println(adler32String);
		
		

		return pass;
	}
}
