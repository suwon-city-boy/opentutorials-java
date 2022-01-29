package org.opentutorials.java.oop.polymorphism;

public class CalculatorDemo {
	public static void main(String[] args) { 
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		    
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}

/*
 * Calculator�� ��� ���� Ŭ�������� �ν��Ͻ�ȭ �� �� Calculator�� ������ Ÿ������ �ϰ� ����
 * �ν��Ͻ� c1�� c2�� ����ϴ� ���忡�� �ΰ��� Ŭ���� ��� Calculator�� ��ó�� ����� �� ����
 
 * �ϳ��� Ŭ����(Calculator)�� �پ��� ���� ���(ClaculatorDecoPlus, ClaculatorDecoMinus)�� ������ �ִ� �� -> ������
 */

