package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam119 {
	
	 public static void main(String[] args) {

		    int count = 0;

		    try {
		      // create a new file object
		      File file = new File("d:\\temp\\java.txt");

		      // create an object of Scanner
		      // associated with the file
		      Scanner sc = new Scanner(file);

		      // read each line and
		      // count number of lines
		      while(sc.hasNextLine()) {
		        sc.nextLine();
		        count++;
		      }
		      System.out.println("Total Number of Lines: " + count);

		      // close scanner
		      sc.close();
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
		  }
 
}
