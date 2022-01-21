package org.opentutorials.java.oop.inheritance;

public class Calculator {
	int left, right;
	
	//�⺻ ������(���� Ŭ�������� �ʿ�)
	//public Calculator() {}
	
	//�Ű������� �ִ� ������ �����, �ڵ����� �⺻ �����ڸ� ��������� ����
	//���� ��ó�� �⺻ �����ڸ� ���� �����������
	//������, super Ű���带 ����Ͽ� ���� �ذ� ����
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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
 * super�� ���� Ŭ������ ����Ű�� Ű����
 * super()�� �θ� Ŭ������ �����ڸ� �ǹ�
 * ���� Ŭ������ �����ڿ��� super�� ����� �� ������ ���� super�� ���� ���� ��Ÿ���� �Ѵٴ� ��
 * �� ������? �θ� �ʱ�ȭ�Ǳ� ���� �ڽ��� �ʱ�ȭ�Ǵ� ���� �����ϱ� ����
 */