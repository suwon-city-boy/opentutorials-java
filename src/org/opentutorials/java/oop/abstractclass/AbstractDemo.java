package org.opentutorials.java.oop.abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		//�߻� Ŭ���� A�� �ν��Ͻ�ȭ�ϸ� ������ �߻�
		//A a = new A();
		
		B b = new B();
		System.out.println(b.b());
		b.d();
	}
}

/*
 * template method pattern?
 * �ݺ��Ǵ� ���ϵ��� ��Ƽ� ������ ���� ������ ����(design pattern)
 * ���� ����� �޶����� �޼ҵ�� �߻� �޼ҵ�� ���� ���� Ŭ�������� �����ϵ��� �ϰ�
 * ��� Ŭ������ ����и��� ��쿡�� ���� Ŭ������ �ξ �ڵ��� �ߺ�, ���������� ���Ǽ� ���� ����
 
 * ������ ������ ����
 * - ���� ���踦 �ܱⰣ�� �н��� �� �ִٴ� ��
 * - ���뿡 ������ �ȴٴ� ��
 */
