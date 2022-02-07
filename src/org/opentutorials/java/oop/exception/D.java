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
 * IOException�� ����ó���� ������
 * getMessage, printStackTrace, toString���� Throwable Ŭ�������� ���� �Ǿ� ����
 * Throwable <- Exception <- etc ��
 
 * checked ���� - RuntimeException�� ������ Exception�� ���� Ŭ����
 * unchecked ���� - RuntimeException�� ���� Ŭ����
 * checked ���ܴ� �ݵ�� ����ó���� �ؾ� �ϰ�, unchekced�� ����ó���� �ص� �ǰ� �� �ص� �Ǵ� ����
 */
