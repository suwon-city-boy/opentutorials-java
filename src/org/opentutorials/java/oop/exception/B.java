package org.opentutorials.java.oop.exception;

import java.io.*;

public class B {
	void run() throws IOException, FileNotFoundException{ //Class C���� ����ó��
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
