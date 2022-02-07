package org.opentutorials.java.oop.exception;

import java.io.IOException;

public class D {
	void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}

/*
 * IOException은 예외처리를 강제함
 * getMessage, printStackTrace, toString등은 Throwable 클래스에서 정의 되어 있음
 * Throwable <- Exception <- etc 순
 
 * checked 예외 - RuntimeException을 제외한 Exception의 하위 클래스
 * unchecked 예외 - RuntimeException의 하위 클래스
 * checked 예외는 반드시 예외처리를 해야 하고, unchekced는 예외처리를 해도 되고 안 해도 되는 예외
 */
