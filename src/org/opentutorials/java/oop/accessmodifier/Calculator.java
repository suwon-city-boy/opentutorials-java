package org.opentutorials.java.oop.accessmodifier;

public class Calculator {
	//�� ������ ��ü �ܺο��� ȣ��� �ʿ䰡 ���⿡ private�� ����
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