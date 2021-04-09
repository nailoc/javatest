package com.hk.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam070 {
	
	public static void main(String[] args) {

        // 배열을 set으로
		String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);
        
        // set을 배열로
        Set<String> set2 = new HashSet<>();
        set2.add("a");
        set2.add("b");
        set2.add("c");

        String[] array2 = new String[set2.size()];
        set2.toArray(array2);

        System.out.println("Array: " + Arrays.toString(array2));
    }

}
