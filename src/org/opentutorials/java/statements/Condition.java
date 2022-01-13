package org.opentutorials.java.statements;

public class Condition {
	
	public static void main(String[] args) {
		int a = 2;
		String str = "aaa";
		String id = "id";
		String password = "password";
		
		if(true) {
			System.out.println("result : true");
		}
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
		}
		
		if(false) {
			System.out.println(3);
		}
		
		if(true) {
			System.out.println(4);
		} else {
			System.out.println(5);
		}
		
		if(a>3) {
			System.out.println("a");
		} else if(a > 2) {
			System.out.println("b");
		} else {
			System.out.println("c");
		}
		
		if(str.equals("aaa")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
		if(id.equals("id")) {
			if(password.equals("password2")) {
				System.out.println("pass");
			} else {
				System.out.println("wrong password!");
			}
		} else {
			System.out.println("wrong id!");
		}
		
		/*
         * if문과 switch문은 서로 대체 가능한 관계
         * switch문에서는 case마다 break를 반드시 해줘야함
         * switch의 조건으로는 byte, short, char, int, enum 타입과
         * String, Character, Byte, Short, Integer 타입만 사용가능
         */
		switch(1) { 
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
