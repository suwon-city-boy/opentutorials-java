package org.opentutorials.java.oop.exception;

import java.io.*;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		//B->C->main ������ �Ѿ�� ���ܸ� ó��
         C c = new C();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ������Ʈ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
