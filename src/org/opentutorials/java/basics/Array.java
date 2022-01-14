package org.opentutorials.java.basics;

public class Array {
	
	public static void main(String[] args) {
		//���ڿ� �迭 ����
		String[] classGroup = {"������", "����ö", "��ȣ��", "�̼���", "�ΰ���"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[3]);
		
		//.length�� �迭�� ó�� ������ �� ������ �迭�� ũ��
		System.out.println(classGroup.length); //5
		
		for(int i = 0; i < classGroup.length; i++) {
			String member = classGroup[i];
			System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
		}
		
		//for-each : �ڹ� 5.0���� ���Ե� for���� �����ϰ� ����ϴ� ���
		for(String e : classGroup) {
			System.out.println(e + "�� for-each�� ����Ͽ����ϴ�.");
		}
		
		/*
		 * ���� �߻��ϴ� ���� : java.lang.ArrayIndexOutOfBoundsException
		 * �����ϴ� �ε��� �̻��� �ε����� �����Ϸ��� �� �� �߻�
		 */
		
		/*
		 * �迭�� �ʱ�ȭ�� �� ũ�Ⱑ ������
		 * �ڹٿ����� Collection(Container)�� �̿��ϸ� �����ϰ� �迭�� ����� �� ����
		 */
	}
	
}
