package org.opentutorials.java.oop.overriding;

public class SubCalculator extends Calculator {
	
	public SubCalculator(int left, int right) {
		super(left, right);
	}
	
	public void sum() {
		System.out.println("실행 결과는" + (this.left + this.right) + "입니다");
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}