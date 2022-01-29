package org.opentutorials.java.oop.polymorphism;

public class PolymorphismDemo2 {
	
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		 
		obj.A();
		obj.B();
		
		//인터페이스 I를 데이터 타입으로 하는 인스턴스는 마치 메소드 A만을 가지고 있는 것처럼 동작
		objI2.A();
		//objI2.B();
		 
		//objI3.A();
		objI3.B();
	}
}

/*
 * 인스턴스 I2와 I3로 인해서 하나의 클래스가 다양한 형태를 띄게 됨
 */