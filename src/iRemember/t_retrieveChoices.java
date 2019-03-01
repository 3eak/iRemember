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


public class t_retrieveChoices extends e_affineInspired{
	
	public String retrieveYear(String year) {
		
		try {
			File inFile = new File("bin\\application\\schoolUsernames.txt");
		      if (!inFile.isFile()) {
		        //System.out.println("Parameter is not an existing file");
		        return "File not found";
		      }

		      //File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		      
		      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\schoolUsernames.txt"));
		     // PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
			
		      int count = 0;
		      String line = null;
		      List<String> list = new ArrayList<String>();
		      //Read from the original file and write to the new 
		      //unless content matches data to be removed.
		      while ((line = br.readLine()) != null) {  
		        line=decryptAffine(line,2192);
		        if (!line.trim().contains(year)) {
		          count=count+1;
		          System.out.println("test");
		         
		        }
		        else{
		        	list.add(line+"\n");
		        	System.out.println("ABCD");
		        }
		      }
		      String abc=list.toString();
		      br.close();
		      return abc;
		} catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		return "success";
	}
	
	public String retrieveYearPasswords(String year) throws IOException {
		File inFile = new File("bin\\application\\schoolUsernames.txt");
	      if (!inFile.isFile()) {
	        return "File not found";
	      }
	      BufferedReader br = new BufferedReader(new FileReader("bin\\application\\schoolUsernames.txt"));
	      BufferedReader br2 = new BufferedReader(new FileReader("bin\\application\\schoolPasswords.txt"));
	      int yes = 0;
	      int yes1;
	      int count = 0;
	      String line = null;
	      List<String> list = new ArrayList<String>();
	      List<String> list1 = new ArrayList<String>();
	      //Read from the original file and write to the new 
	      //unless content matches data to be removed.
	      while ((line=br2.readLine()) != null ) {
	    	  line=decryptAffine(line,2192);
	    	  list1.add(line);
	      }
	      System.out.println(list1);
	      while ((line = br.readLine()) != null) {	    	  
	        line=decryptAffine(line,2192);	        
	        if (!line.trim().contains(year)) {
	          count=count+1;	                  
	        }
	        else{
	        	yes=count;
	        	list.add(list1.get(yes)+"\n");	        	
	        	count=count+1;	    
	        }        
	      }
	        yes1=yes-15;
	      String abc=list.toString();
	      System.out.println(abc);
	      br.close();
	      br2.close();
	      return abc;
	}
	
	public String retrieveStudent (String user) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("bin\\application\\schoolUsernames.txt"))) {
		    String line;
		    int x=0;
		    int y=0;
		    while ((line = br.readLine()) != null) {
		    	x=x+1;
		    	if (line.equals(user)) {
		    		y=x;
		    	}
		    }
		    BufferedReader be=new BufferedReader(new FileReader("bin\\application\\schoolPasswords.txt"));
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "STUDENT NOT FOUND";
		
	}

}
