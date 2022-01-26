package org.opentutorials.java.oop.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOprands(10, 20);
		calc.sum();
		calc.avg();
		
		calc.setOprands(new int[] {10, 20});
		calc.sum2();
		
		SubCalculator subCalc = new SubCalculator();
		subCalc.setOprands(10, 20, 30); //�����ε�
		subCalc.sum();
		subCalc.avg();
		
		calc.setOprands(new int[] {10, 20, 30});
		calc.sum2();
	}

}

/*
 * �޼ҵ� �����ε��̶�? �̸��� ������ �ñ״�ó�� �ٸ� �޼ҵ带 �ߺ����� ���� �� �� �ִ� ���
 * �Ű������� ���ڿ� ���� ���� �̸���, ���� �ٸ� �޼ҵ带 ȣ��
 * �޼ҵ��� ��ȯ���� �޼ҵ带 ȣ���ϴ� �������� ���޵��� �ʴ� �����̱� ������ �����ε��� ����� �� �� ����
 */