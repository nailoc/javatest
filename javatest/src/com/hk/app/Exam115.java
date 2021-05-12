package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam115 {
	
	public static void main(String[] args) {

	    try {
	      // create a new file object
	      File directory = new File("Directory");

	      // list all the files in an array
	      File[] files = directory.listFiles();

	      // delete each file from the directory
	      for(File file : files) {
	        System.out.println(file + " deleted.");
	        file.delete();
	      }

	      // delete the directory
	      if(directory.delete()) {
	        System.out.println("Directory Deleted");
	      }
	      else {
	        System.out.println("Directory not Found");
	      }

	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	    
	    try {
	        // create a new file object
	        File directory = new File("Directory");

	        deleteDirectory(directory);

	      } catch (Exception e) {
	        e.getStackTrace();
	      }
	  }
	
	public static void deleteDirectory(File directory) {
		// if the file is directory or not
	    if(directory.isDirectory()) {
	      File[] files = directory.listFiles();
	
	      // if the directory contains any file
	      if(files != null) {
	        for(File file : files) {
	
	          // recursive call if the subdirectory is non-empty
	          deleteDirectory(file);
	        }
	      }
	    }
	
	    if(directory.delete()) {
	      System.out.println(directory + " is deleted");
	    }
	    else {
	      System.out.println("Directory not deleted");
	    }
  }
 
}
