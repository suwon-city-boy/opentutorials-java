package org.opentutorials.java.oop.exception;

import java.io.*;

public class B {
	void run() throws IOException, FileNotFoundException{ //Class C에서 예외처리
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
