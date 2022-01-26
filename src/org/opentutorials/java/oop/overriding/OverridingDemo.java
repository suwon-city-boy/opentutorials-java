package org.opentutorials.java.oop.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 20);
		calc.sum();
		calc.avg();
		
		SubCalculator subCalc = new SubCalculator(10, 20);
		subCalc.sum();
		subCalc.avg();
		subCalc.substract();
	}

}

/*
 * ���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ� �θ� Ŭ�����κ��� ���� ���� �⺻ ���� ����� ����
 * �⺻������ ���а� ����ǰ�, �������� ����(������ ����)�� �� ���� �켱������ ���Ե�
 * �������̵��� �ϱ� ���ؼ��� �Ʒ��� ������ �������Ѿ� �Ѵ�.
 
 * �������̵��� ���� ���� = �޼ҵ��� ����(signature)�� ���ƾ� ��
 * - �޼ҵ��� �̸�
 * - �޼ҵ� �Ű������� ������ ������ Ÿ�� �׸��� ����
 * - �޼ҵ��� ���� Ÿ��
 */