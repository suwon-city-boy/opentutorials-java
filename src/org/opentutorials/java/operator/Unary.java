package org.opentutorials.java.operator;

public class Unary {
	
	//���� ������? �ϳ��� ���� ������� ������ �̷������ ������
	public static void main(String[] args) {
		int i = 2;
		
		System.out.println(i); //2
		System.out.println(++i); //3
		System.out.println(i++); //3
		System.out.println(i); //4
		
		System.out.println(--i); //3
		System.out.println(i--); //3
		System.out.println(i); //2
		
		System.out.println(-i); //-2
	}
	
}
