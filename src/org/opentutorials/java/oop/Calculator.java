package org.opentutorials.java.oop;

public class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

/*
 * Ŭ������ �����Ǿ� �ִ� ������ �޼ҵ��� ����
 * Ŭ���� : ���赵, �ν��Ͻ� : ��ǰ
 * ��ü�� ���� ����ϴ� ������ ��Ȱ�뼺�� ���̱� ���ؼ�
 * this�� Ŭ������ ���ؼ� ������� �ν��Ͻ� �ڽ��� ����Ŵ
 * �޼ҵ� �ۿ��� ������ ������ �ν��Ͻ� ���� ��� �޼ҵ忡�� ������ ����
 * ���� : ����, �޼ҵ� : �ൿ
 * �ϳ��� Ŭ������ �������� �ν��Ͻ��� �� �� �ִٴ� ���� ��ü ������ �����ϴ� ���� �⺻���� ��Ȱ�뼺
 */
