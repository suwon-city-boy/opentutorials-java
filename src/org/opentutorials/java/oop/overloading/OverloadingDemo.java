package org.opentutorials.java.oop.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOprands(10, 20);
		calc.sum();
		calc.avg();
		
		calc.setOprands(new int[] {10, 20});
		calc.sum2();
		
		SubCalculator subCalc = new SubCalculator();
		subCalc.setOprands(10, 20, 30); //오버로딩
		subCalc.sum();
		subCalc.avg();
		
		calc.setOprands(new int[] {10, 20, 30});
		calc.sum2();
	}

}

/*
 * 메소드 오버로딩이란? 이름은 같지만 시그니처는 다른 메소드를 중복으로 선언 할 수 있는 방법
 * 매개변수의 숫자에 따라서 같은 이름의, 서로 다른 메소드를 호출
 * 메소드의 반환값은 메소드를 호출하는 시점에서 전달되지 않는 정보이기 때문에 오버로딩의 대상이 될 수 없음
 */