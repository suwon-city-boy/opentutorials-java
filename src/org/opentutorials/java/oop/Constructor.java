package org.opentutorials.java.oop;

public class Constructor {
	int a, b;
	
	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a + this.b);
	}
}

/*
 * �����ڴ� ��ü�� ������ �� ȣ��
 * �������� Ư¡
 * - ���� ��ȯ���� ����
 * - �������� �̸��� Ŭ������ �̸��� ����(Ŭ���� �̸��� ������ �޼ҵ�� �����ڷ� ����ϱ�� ��ӵǾ� ����)
 */