package org.opentutorials.java.basics;

public class TypeConversion {
	
	public static void main(String[] args) {
		/*
		 * �ڵ� �� ��ȯ
		 * ǥ�������� ���� ������ Ÿ�Կ��� ���� ������ Ÿ�������� ��ȯ�� ���
		 * byte -> short, char -> int -> long -> float -> double
		 */
		double a = 3.0F; //float -> double(����)
		//float b = 3.0; //double -> float(�Ұ���)
		
		int c = 3;
		float d = 1.0F;
		double e = c + d; //c+d�� �������� int -> float, ���Խÿ� float -> double
		
		/*
		 * ����� �� ��ȯ
		 * ��ȣ �ȿ� ������ Ÿ���� �����ؼ� �� �տ� ��ġ��Ű�� ��
		 * (������ Ÿ��)������ ��
		 */
		float f = (float)3.0;
		int g = (int)100.1F;
		
		System.out.println(g); //100
	}
	
}
