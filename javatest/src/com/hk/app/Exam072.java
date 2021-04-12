package com.hk.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exam072 {
	
	 public static void main(String[] args) throws IOException {

		 String path = System.getProperty("user.dir") + "\\src\\text\test072.txt";
	        
		 System.out.println("Working Directory = " + path);
		 
		 Charset encoding = Charset.defaultCharset();

		 List<String> lines = Files.readAllLines(Paths.get(path), encoding);
		
		 System.out.println(lines);   
	     
	 }

}
