package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam116 {
	
	public static void main(String[] args) {
		
		String workpath = System.getProperty("user.dir");
		
	    File directory = new File(workpath+"\\src\\text");

	    // list all files present in the directory
	    File[] files = directory.listFiles();
	    System.out.println("Files\t\t\tExtension");

	    for(File file : files) {
	      // convert the file name into string
	      String fileName = file.toString();

	      int index = fileName.lastIndexOf('.');
	      if(index > 0) {
	        String extension = fileName.substring(index + 1);
	        System.out.println(fileName + "\t" + extension);
	      }
	    }
	  }
 
}
