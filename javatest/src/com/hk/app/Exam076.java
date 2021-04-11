package com.hk.app;

import java.io.*;

public class Exam076 {
	
	public static void main(String[] args) throws IOException {

        InputStream stream = new ByteArrayInputStream("Hello there!".getBytes());
        StringBuilder sb = new StringBuilder();
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();

        System.out.println(sb);

    }

}
