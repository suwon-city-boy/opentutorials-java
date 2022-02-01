package org.opentutorials.java.oop.exception;

import java.io.*;

public class C {
	void run() throws IOException, FileNotFoundException{ //main에서 예외처리
        B b = new B();
        b.run();
    }
}
