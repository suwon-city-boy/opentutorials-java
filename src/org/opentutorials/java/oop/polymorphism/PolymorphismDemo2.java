package org.opentutorials.java.oop.polymorphism;

public class PolymorphismDemo2 {
	
	public static void main(String[] args) {
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		 
		obj.A();
		obj.B();
		
		//�������̽� I�� ������ Ÿ������ �ϴ� �ν��Ͻ��� ��ġ �޼ҵ� A���� ������ �ִ� ��ó�� ����
		objI2.A();
		//objI2.B();
		 
		//objI3.A();
		objI3.B();
	}
}

/*
 * �ν��Ͻ� I2�� I3�� ���ؼ� �ϳ��� Ŭ������ �پ��� ���¸� ��� ��
 */