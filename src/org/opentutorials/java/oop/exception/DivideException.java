package org.opentutorials.java.oop.exception;

public class DivideException extends RuntimeException{ //���� ����� ���� ����
	//extends�� ���� checked���� unchecked���� ������ 
	 DivideException(){
		 super();
	 }
	 
	 DivideException(String message){
	     super(message);
	 }
}
