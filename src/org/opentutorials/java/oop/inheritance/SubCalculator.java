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
 * ���? ��ü�� �ʵ�(����)�� �޼ҵ带 �ٸ� ��ü�� ���� ���� �� �ִ� ���
 */