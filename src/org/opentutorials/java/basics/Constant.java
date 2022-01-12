package org.opentutorials.java.basics;

public class Constant {

	public static void main(String[] args) {
		/*
		 * 상수란?
		 * 변하지 않는 값(=변수와 반대되는 개념)
		 * 고유한 값을 가지고 있고, 그 값을 변경 할 수 없는 데이터 타입
		 */
		
		//실수의 표현
		//float a = 2.2; //에러, 자바에서 실수형 상수는 double 타입
		double b = 2.2;
		float c = 2.2F; //float 데이터 타입이라는 것을 명시적으로 표현
		
		//int d = 2147483648; //int형 범위를 벗어나서 에러
		//long e = 2147483648; //long형 범위는 맞지만, 정수형 상수는 int 타입이므로 에러
		long f = 2147483648L; //long 데이터 타입이라는 것을 명시적으로 표현
		
		//단, int보다 작은 byte, short타입은 int형 허용
		byte g = 100;
		short h = 200;
	}

}
