package org.opentutorials.java.oop.progenitor;

public class ObjectDemo {
	
	public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //Object�� equals�� �����ε�
    }
}

/*
 * ��ü ���� ���ϼ��� ���ϰ� ���� ���� ==�� ������� ���� equals�� �̿�
 * equals�� ���� �����ؾ� �Ѵٸ� hashCode�� �Բ� �����ؾ� ��
 * �� ������ �и����� �ʴٸ� �� ������ == �� ���� ���������� ���� ���� ���
 
 * ���� ������ ��(Primitive Data Type)�̶�?
 * �ڹٿ��� �⺻������ �����ϴ� ������ Ÿ��
 * byte, short, int, long, float, double, boolean, char
 * new �����ڸ� �̿��ؼ� �������� �ʾƵ� ���� �� �ִٴ� Ư¡
  
 * finalize�� ��ü�� �Ҹ�� �� ȣ��Ǳ�� ��ӵ� �޼ҵ�����, ����� ��õ���� ����
 * https://d2.naver.com/helloworld/1329 -> ������ �÷��ǿ� ���� ���� �����
 
 * clone�� � ��ü�� ���� �� �� ��ü�� �Ȱ��� ��ü�� �������ִ� ���
 * clone�� ����� �Ǵ� Ŭ������ Cloneable��� �� �������̽��� ����(implements Cloneable)
 * �ش� Ŭ������ ���� �����ϴٴ� ���� ǥ���ϱ� ����
 */