package org.opentutorials.java.oop.exception;

import java.io.*;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		//B->C->main 순으로 넘어온 예외를 처리
         C c = new C();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
