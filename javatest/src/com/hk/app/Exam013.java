package com.hk.app;

public class Exam013 {

	public static void main(String[] args) {
		
		char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

	}

}
