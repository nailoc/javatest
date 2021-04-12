package com.hk.app;

import java.io.File;

public class Exam084 {
	 
	public static void main(String[] args) {

		// create a file object
		String path = System.getProperty("user.dir") + "\\src\\text\\";
		File file = new File(path+"oldName.txt");
		
		  
		// create a file
		try {
		  file.createNewFile();
		}
		catch(Exception e) {
		  e.getStackTrace();
		}
		
		// create an object that contains the new name of file
		File newFile = new File(path+"newName.txt");
		
		// change the name of file
		boolean value = file.renameTo(newFile);
		
		if(value) {
		  System.out.println("The name of the file is changed.");
		}
		else {
		  System.out.println("The name cannot be changed.");
		}
	}

}
