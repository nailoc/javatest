package com.hk.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exam072 {
	
	 public static void main(String[] args) throws IOException {

	        String path = System.getProperty("user.dir") + "\\src\\text\\test072.txt";
	        System.out.println("Working Directory = " + path);
	        Charset encoding = Charset.defaultCharset();

	        byte[] encoded = Files.readAllBytes(Paths.get(path));
	        String lines = new String(encoded, encoding);
	        System.out.println(lines);
	    }

}
