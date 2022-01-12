package org.opentutorials.java.operator;

public class Division {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		double d = 3.0;
		
		System.out.println(a/b); //정수 ÷ 정수 = 정수
		System.out.println(c/d); //실수 ÷ 실수 = 실수
		System.out.println(a/d); //정수 ÷ 실수 = 실수(형변환)
	}
}
