package org.opentutorials.java.operator;

public class Conditional {
	
	public static void main(String[] args) {
		String id = "id";
		String password = "password";
		
		if(true && false) {
			System.out.println(1);
		}
		if(true && true) {
			System.out.println(2);
		}
		
		if(id.equals("id") && password.equals("password")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
		if(true || false) {
			System.out.println(3);
		}
		
		if ((id.equals("id") || id.equals("id2")) && password.equals("password")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
		
		if(!true) {
			System.out.println(4);
		}
		if(!false) {
			System.out.println(5);
		}
	}
	
}
