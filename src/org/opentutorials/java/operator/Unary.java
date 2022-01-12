package org.opentutorials.java.operator;

public class Unary {
	
	//단항 연산자? 하나의 항을 대상으로 연산이 이루어지는 연산자
	public static void main(String[] args) {
		int i = 2;
		
		System.out.println(i); //2
		System.out.println(++i); //3
		System.out.println(i++); //3
		System.out.println(i); //4
		
		System.out.println(--i); //3
		System.out.println(i--); //3
		System.out.println(i); //2
		
		System.out.println(-i); //-2
	}
	
}
