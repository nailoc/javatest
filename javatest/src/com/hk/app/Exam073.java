package com.hk.app;

import java.io.FileWriter;
import java.io.IOException;

public class Exam073 {
	
	public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String text = "Added text";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
    }

}
