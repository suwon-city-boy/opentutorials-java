package org.opentutorials.java.oop.exception;

public class DivideException extends RuntimeException{ //직접 만드는 예외 예제
	//extends를 통해 checked인지 unchecked인지 정해줌 
	 DivideException(){
		 super();
	 }
	 
	 DivideException(String message){
	     super(message);
	 }
}
