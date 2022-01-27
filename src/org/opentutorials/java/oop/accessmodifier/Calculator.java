package org.opentutorials.java.oop.accessmodifier;

public class Calculator {
	//두 변수는 객체 외부에서 호출될 필요가 없기에 private로 선언
	private int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int sum() {
		return this.left+this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("+++" + sum() + "+++");
	}
}