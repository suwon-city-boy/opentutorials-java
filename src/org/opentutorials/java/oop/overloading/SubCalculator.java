package org.opentutorials.java.oop.overloading;

public class SubCalculator extends Calculator {
	
	public void setOprands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}

	public void substract() {
		System.out.println(this.left - this.right - this.third);
	}
}