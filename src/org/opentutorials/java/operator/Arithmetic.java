package org.opentutorials.java.operator;

public class Arithmetic {

	public static void main(String[] args) {
		//���ϱ�
		int result = 1 + 2;
		System.out.println(result); //3
		System.out.println("aaaaa" + "bbbb"); //���ڿ� ���տ��� ���
		
		//����
		result = result - 1;
		System.out.println(result); //2
		
		//���ϱ�
		result = result * 2;
		System.out.println(result); //4
		
		//������
		result = result / 4;
		System.out.println(result); //1
		
		
		result = result + 9;
		//������
		result = result % 8;
		System.out.println(result); //2
	}

}
