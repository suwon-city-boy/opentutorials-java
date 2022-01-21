package org.opentutorials.java.oop.inheritance;

public class SubCalculator extends Calculator {
	public SubCalculator(int left, int right) {
		super(left, right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

/*
 * 상속? 객체의 필드(변수)와 메소드를 다른 객체가 물려 받을 수 있는 기능
 */