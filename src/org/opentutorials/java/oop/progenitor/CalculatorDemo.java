package org.opentutorials.java.oop.progenitor;

public class CalculatorDemo {
	
	 public static void main(String[] args) {
	     Calculator c1 = new Calculator();
		 c1.setOprands(10, 20);
		 System.out.println(c1); //c1.toString() -> Object 클래스의 함수 사용
		 System.out.println(c1.toString()); //오버로딩 된 toString() 사용
	 }
}

/*
 * 어떤 객체를 System.out.print로 호출하면 자동으로 toString이 호출됨
 */