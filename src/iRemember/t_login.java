package iRemember;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class t_login extends e_adlerHashing{
	
	BufferedReader reader=null;
	FileInputStream textfile=null;

	public String createLogin(String username, String pass) {
		
		String encUsername = saveNewPassFourAdler32(username);
		String encPass=saveNewPassFourAdler32(pass);
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("bin\\application\\loginInformation.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writer.println(encUsername);
		writer.println(encPass);
		writer.close();
		
		File a =new File("bin\\application\\userNotes.txt");
		File b = new File("bin\\application\\userPasswords.txt");
		
		a.delete();
		b.delete();
		
		return "Information Saved";
		
		/*
		 * This method writes and saves login details to a notepad. It opens and prints
		 * each hashed line to the notepad through using the imported printWriter.
		 */
		
	}
	
	public String checkLogin(String username, String pass) {
		List<String> list = new ArrayList<String>();
		String user =saveNewPassFourAdler32(username);
		String password = saveNewPassFourAdler32(pass);
		try {
			textfile = new FileInputStream("bin\\application\\loginInformation.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader = new BufferedReader(new InputStreamReader(textfile));
		
		try {
            textfile = new FileInputStream("bin\\application\\loginInformation.txt");
            reader = new BufferedReader(new InputStreamReader(textfile));
            int x=0;
            int y=0;
            int lengthList=list.size();
            try (BufferedReader br = new BufferedReader(new FileReader("bin\\application\\loginInformation.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                	if (line.equals(user)){ 
                		list.add(line);
                	}
                	if (line.equals(password)){
                    		list.add(line);
                	}
                }
            } catch (IOException e) {
				e.printStackTrace();
			}
            if (list.size() == 2){
            	return "success";
            }
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		finally {
            try {
                reader.close();
                textfile.close();
            } catch (IOException ex) {
                Logger.getLogger(t_login.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
		return "failure";
		
		/*
		 * This method hashes the username and password that the user has inputted into the
		 * program, it checks if the hashes are the same as the ones in the notepad. If so
		 * it returns success to the call of the method.
		 */

	}
}

