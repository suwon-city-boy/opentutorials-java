package org.opentutorials.java.oop;

public class Calculator2 {
	int left, right;
	static double PI = 3.14;
	static int special = 100;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + special);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

/*
 * ������ �ν��Ͻ� ���� �������� ���� ������ ������ ���� �ʿ䰡 ����
 * �̷� ��� ������ Ŭ������ �ɹ��� ����
 * static�� �ɹ�(����,�޼ҵ�) �տ� ���̸� Ŭ���� ���
 * Ŭ���� ������ �뵵
 * - �ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ���
 * - �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���
 * - ���� ���� ������ ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
 */
