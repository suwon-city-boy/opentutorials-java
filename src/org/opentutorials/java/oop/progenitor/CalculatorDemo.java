package org.opentutorials.java.oop.progenitor;

public class CalculatorDemo {
	
	 public static void main(String[] args) {
	     Calculator c1 = new Calculator();
		 c1.setOprands(10, 20);
		 System.out.println(c1); //c1.toString() -> Object Ŭ������ �Լ� ���
		 System.out.println(c1.toString()); //�����ε� �� toString() ���
	 }
}

/*
 * � ��ü�� System.out.print�� ȣ���ϸ� �ڵ����� toString�� ȣ���
 */