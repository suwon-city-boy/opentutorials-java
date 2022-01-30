package org.opentutorials.java.oop.exception;

public class CalculatorDemo {

	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0); //오류 발생 지점
        c1.divide();
    }
}
