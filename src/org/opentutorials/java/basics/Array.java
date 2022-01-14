package org.opentutorials.java.basics;

public class Array {
	
	public static void main(String[] args) {
		//문자열 배열 선언
		String[] classGroup = {"서장훈", "김희철", "강호동", "이수근", "민경훈"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[3]);
		
		//.length는 배열을 처음 생성할 때 지정한 배열의 크기
		System.out.println(classGroup.length); //5
		
		for(int i = 0; i < classGroup.length; i++) {
			String member = classGroup[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
		//for-each : 자바 5.0부터 도입된 for문을 간편하게 사용하는 방법
		for(String e : classGroup) {
			System.out.println(e + "이 for-each를 사용하였습니다.");
		}
		
		/*
		 * 자주 발생하는 예외 : java.lang.ArrayIndexOutOfBoundsException
		 * 존재하는 인덱스 이상의 인덱스에 접근하려고 할 때 발생
		 */
		
		/*
		 * 배열은 초기화할 때 크기가 정해짐
		 * 자바에서는 Collection(Container)을 이용하면 유연하게 배열을 사용할 수 있음
		 */
	}
	
}
