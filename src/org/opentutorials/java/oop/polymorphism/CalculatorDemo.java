package org.opentutorials.java.oop.polymorphism;

public class CalculatorDemo {
	public static void main(String[] args) { 
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		    
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}

/*
 * Calculator를 상속 받은 클래스들을 인스턴스화 할 때 Calculator를 데이터 타입으로 하고 있음
 * 인스턴스 c1과 c2를 사용하는 입장에서 두개의 클래스 모두 Calculator인 것처럼 사용할 수 있음
 
 * 하나의 클래스(Calculator)가 다양한 동작 방법(ClaculatorDecoPlus, ClaculatorDecoMinus)을 가지고 있는 것 -> 다형성
 */

