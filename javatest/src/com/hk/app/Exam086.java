package com.hk.app;

import java.io.*;

public class Exam086 {
	
	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "\\src\\text\\";
		
		byte[] array = new byte[50];
		try {
		  FileInputStream sourceFile = new FileInputStream(path+"input.txt");
		  FileOutputStream destFile = new FileOutputStream(path+"newFile");
		
		  // reads all data from input.txt
		  sourceFile.read(array);
		
		  // writes all data to newFile
		  destFile.write(array);
		  System.out.println("The input.txt file is copied to newFile.");
		
		  // closes the stream
		  sourceFile.close();
		  destFile.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	}

}
