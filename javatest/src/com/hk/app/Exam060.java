package com.hk.app;

import java.util.Arrays;

public class Exam060 {
	

    public static void main(String[] args) {
    	
    	char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
        
        String st3 = "This is great";

        char[] chars = st3.toCharArray();
        System.out.println(Arrays.toString(chars));
    }

	
}
