package org.opentutorials.java.oop;

public class Calculator3 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

/*
 * 메소드가 인스턴스 변수를 참조하지 않는다면, 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있음
 * 인스턴스 메소드는 클래스 맴버에 접근 할 수 있음
 * 클래스 메소드는 인스턴스 맴버에 접근 할 수 없음
 * 클래스 메소드는 인스턴스가 생성되기 전에 만들어짐
 * 따라서, 클래스 메소드가 인스턴스 맴버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같음
 * 인스턴스 변수 -> Non-Static Field
 * 클래스 변수 -> Static Field
 */
