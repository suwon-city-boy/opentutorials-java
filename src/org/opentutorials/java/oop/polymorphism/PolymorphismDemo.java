package org.opentutorials.java.oop.polymorphism;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		//서로 다른 클래스 B와 B2가 동일한 데이터 타입 A로 인스턴스화
		A obj = new B();
		A obj2 = new B2();
		
		B obj3 = new B();
		
		System.out.println(obj.x());
		System.out.println(obj2.x());
		//System.out.println(obj.y());
		System.out.println(obj3.y());
	}
}

/*
 * 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 됨
 * 동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지
 */