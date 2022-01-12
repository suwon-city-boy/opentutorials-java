package org.opentutorials.java.operator;

public class Arithmetic {

	public static void main(String[] args) {
		//더하기
		int result = 1 + 2;
		System.out.println(result); //3
		System.out.println("aaaaa" + "bbbb"); //문자열 결합에도 사용
		
		//빼기
		result = result - 1;
		System.out.println(result); //2
		
		//곱하기
		result = result * 2;
		System.out.println(result); //4
		
		//나누기
		result = result / 4;
		System.out.println(result); //1
		
		
		result = result + 9;
		//나머지
		result = result % 8;
		System.out.println(result); //2
	}

}
