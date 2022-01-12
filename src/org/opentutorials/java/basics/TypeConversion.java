package org.opentutorials.java.basics;

public class TypeConversion {
	
	public static void main(String[] args) {
		/*
		 * 자동 형 변환
		 * 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용
		 * byte -> short, char -> int -> long -> float -> double
		 */
		double a = 3.0F; //float -> double(가능)
		//float b = 3.0; //double -> float(불가능)
		
		int c = 3;
		float d = 1.0F;
		double e = c + d; //c+d의 과정에서 int -> float, 대입시에 float -> double
		
		/*
		 * 명시적 형 변환
		 * 괄호 안에 데이터 타입을 지정해서 값 앞에 위치시키는 것
		 * (데이터 타입)데이터 값
		 */
		float f = (float)3.0;
		int g = (int)100.1F;
		
		System.out.println(g); //100
	}
	
}
