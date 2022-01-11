package org.opentutorials.java.basics;

public class Variable {
	
	public static void main(String[] args) {
		int a; //정수형 변수 선언
		a = 1;
		System.out.println(a); //1
		System.out.println(a+1); //2
		
		double b; //실수형 변수 선언
		b = 1.1;
		System.out.println(b); //1.1
		System.out.println(b+2.4); //3.5
		
		String c, d; //문자열 변수 선언
		c = "Test";
		d = "자바 복습";
		System.out.println(c + " " + d);
		
		//변수의 효용 : 변수는 코드의 재활용성을 높여준다.
	}
	
}
