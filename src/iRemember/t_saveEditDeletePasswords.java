package iRemember;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;


public class t_saveEditDeletePasswords extends e_affineInspired{
	
	public String uploadSaveP(String file) {
	
		try {
			File newFile = new File ("bin\\application\\schoolPasswords.txt");
			// if file doesnt exists, then create it
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
		     BufferedReader br = new BufferedReader(new FileReader(file));
		     PrintWriter pw = new PrintWriter(new FileWriter(newFile));
		     int count = 0;
		     String line = null;
		     while ((line = br.readLine()) != null) {		        
		    	 String a=encryptAffine(line,2192);		    	 		    	 
		         pw.println(a+"\n");
		         pw.flush();
		       }		      
		      pw.close();
		      br.close();		
			return "success";
		} catch (IOException e) {
			e.printStackTrace();
		}			
			return "success";
		}
	public String rwaDel(String note) throws IOException {
		
		try {
		      File inFile = new File("bin\\application\\schoolUsernames.txt");
		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        return "File not found";
		      }
		      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\schoolUsernames.txt"));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		      int count = 0;
		      String line = null;
		      while ((line = br.readLine()) != null) {	        
		        if (!line.trim().equals(note)) {
		          count=count+1;
		          pw.println(line);
		          pw.flush();
		        }
		      }
		      count=count+1;
		      String countString=Integer.toString(count);
		      pw.close();
		      br.close();  
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        return "Could not delete file";
		      }     
		      if (!tempFile.renameTo(inFile)){
		        System.out.println("Could not rename file");}
		      return countString;
		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		return "";
	}

	public String rwaDel2(String note) throws IOException {
		
		try {
		      File inFile= new File ("bin\\application\\schoolPasswords.txt");    
		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        return "File not found";
		      }   
		      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");   
		      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\schoolPasswords.txt"));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));   
		      int count = 0;
		      String line = null;
		      while ((line = br.readLine()) != null) {
		        count=count+1;
		        String countString=Integer.toString(count);
		        if (!countString.equals(note)) {
		          pw.println(line);
		          pw.flush();
		          System.gc();
		        }
		      }		     
		      pw.close();
		      br.close();
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        return "Could not delete file";
		      } 
		      if (!tempFile.renameTo(inFile)){
		        System.out.println("Could not rename file");}
		      return "Password Deleted";
		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		return "";
	}
	
	public String uploadSaveU(String file) {

		try {
			File newFile = new File ("bin\\application\\schoolUsernames.txt");
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
		     BufferedReader br = new BufferedReader(new FileReader(file));
		     PrintWriter pw = new PrintWriter(new FileWriter(newFile));
		     int count = 0;
		     String line = null;
		     while ((line = br.readLine()) != null) {		        
		    	 String a=encryptAffine(line,2192);  	 
		         pw.println(a+"\n");
		         pw.flush();
		       }	      
		      pw.close();
		      br.close();

			return "success";

		} catch (IOException e) {
			e.printStackTrace();
		}
			return "success";
		}
		
	public String rwaAddStudentU(String user) {
		
		try {
			String content = user;
			File file = new File("bin\\application\\schoolUsernames.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n"+content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "complete";
	}
	
	public String rwaAddStudentP(String pass) {
		
		try {
			String content = pass;
			File file = new File("bin\\application\\schoolPasswords.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n"+content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "complete";
	}
	
	public String saveNewUsername(String user) {
	
	try {
		String content = user;
		File file = new File("bin\\application\\userNotes.txt");
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n"+content);
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return "complete";
}

	public String saveNewPassword(String pass) {
		
		try {
			String content = pass;
			File file = new File("bin\\application\\userPasswords.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\n"+content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "complete";
	}
	
	public String retrievePassword(String user) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("bin\\application\\userNotes.txt"))) {
		    String line;
		    int x=0;
		    int y=0;
		    while ((line = br.readLine()) != null) {
		    	x=x+1;
		    	if (line.equals(user)) {
		    		y=x;
		    	}
		       // process the line.
		    }
		    BufferedReader be=new BufferedReader(new FileReader("bin\\application\\userPasswords.txt"));
		    int count=0;
		    while((line = be.readLine()) != null) {
	            count=count+1;
	            if(count == y)
	            {
	                String password=decryptAffine(line,2192);
	                return password;
	            }
	        }   
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "PASSWORD NOT FOUND";
	}
	
	public String editPasswordGetInfo(String user){
		
		try {
			String a=deletePassword(user);
			String b=deletePassword2(a);
			return "Password Deleted";
		}
		catch (FileNotFoundException ex) {
		      ex.printStackTrace();
	    }
	    catch (IOException ex) {
	      ex.printStackTrace();
	    }
		return "Password Deleted";
	}
	
	public String editPassword(String user,String pass) {
		String a=saveNewUsername(user);
		String b=saveNewPassword(a);
		return "Password Edited";
	}
	
	public String deletePassword(String note) throws IOException {
		
		try {
			 
		      File inFile = new File("bin\\application\\userNotes.txt");
		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        return "File not found";
		      }
		      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\userNotes.txt"));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		      int count = 0;
		      String line = null;
		      while ((line = br.readLine()) != null) {
		        if (!line.trim().equals(note)) {
		          count=count+1;
		          pw.println(line);
		          pw.flush();
		        }
		      }
		      count=count+1;
		      String countString=Integer.toString(count);
		      pw.close();
		      br.close();
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        return "Could not delete file";
		      } 
		      //Rename the new file to the filename the original file had.
		      if (!tempFile.renameTo(inFile)){
		        System.out.println("Could not rename file");}
		      return countString;
		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		return "";
	}
public String deletePassword2(String note) throws IOException {
		
		try {
		      File inFile= new File ("bin\\application\\userPasswords.txt");
		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        return "File not found";
		      }
		      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\userPasswords.txt"));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		      int count = 0;
		      String line = null;
		      while ((line = br.readLine()) != null) {
		        count=count+1;
		        String countString=Integer.toString(count);
		        if (!countString.equals(note)) {
		          pw.println(line);
		          pw.flush();
		          System.gc();
		        }
		      }
		      pw.close();
		      br.close();
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        return "Could not delete file";
		      } 
		      if (!tempFile.renameTo(inFile)){
		        System.out.println("Could not rename file");}
		      return "Password Deleted";
		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		return "";
	}
}
