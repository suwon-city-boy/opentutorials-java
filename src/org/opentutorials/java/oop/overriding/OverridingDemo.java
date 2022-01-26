package org.opentutorials.java.oop.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 20);
		calc.sum();
		calc.avg();
		
		SubCalculator subCalc = new SubCalculator(10, 20);
		subCalc.sum();
		subCalc.avg();
		subCalc.substract();
	}

}

/*
 * 하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경
 * 기본동작은 폭넓게 적용되고, 예외적인 동작(변경한 동작)은 더 높은 우선순위를 갖게됨
 * 오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
 
 * 오버라이딩을 위한 조건 = 메소드의 서명(signature)이 같아야 함
 * - 메소드의 이름
 * - 메소드 매개변수의 갯수와 데이터 타입 그리고 순서
 * - 메소드의 리턴 타입
 */