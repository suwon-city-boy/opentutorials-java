package org.opentutorials.java.oop.polymorphism;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		//���� �ٸ� Ŭ���� B�� B2�� ������ ������ Ÿ�� A�� �ν��Ͻ�ȭ
		A obj = new B();
		A obj2 = new B2();
		
		B obj3 = new B();
		
		System.out.println(obj.x());
		System.out.println(obj2.x());
		//System.out.println(obj.y());
		System.out.println(obj3.y());
	}
}

/*
 * Ŭ���� B�� Ŭ���� A�� ������ Ÿ������ �ν��Ͻ�ȭ ���� �� Ŭ���� A�� �����ϴ� �ɹ����� Ŭ���� B�� �ɹ��� ��
 * ���ÿ� Ŭ���� B���� �������̵��� �ɹ��� ���۹���� �״�� ����
 */