package org.opentutorials.java.basics;

public class Method {
	
	public static void printNumber() { //�޼ҵ� ����
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * �޼ҵ��� �Է� ���� �Ű�����(parameter)�� ���ؼ� �̷����
	 * �Է��� ���ؼ� �޼ҵ��� ������ ������ �� ����
	 */
	public static void printNumber2(int x) {
		for(int i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}
	
	public static void printNumber3(int x, int y) {
		for(int i = x; i <= y; i++) {
			System.out.println(i);
		}
	}
	
	//��ȯ���� ������ void, �ִ� ��� ������ Ÿ�Կ� �°� ���
	public static int getNumber(int x, int y) {
		int result = x + y;
		return result; //return�� �޼ҵ带 �ߴܽ�Ű�� ���ҵ� ������ ����
	}
	
	//���� ���� �����͸� ��ȯ�ϰ� ���� �� �迭�� �̿�
		public static String[] getMembers() {
			String[] members = new String[2];
			members[0] = "�۹�ȣ";
			members[1] = "�̼���";
			return members;
		}
	
	//�ڹٸ� ������ �� �ڹٴ� �ۼ��� main�޼ҵ带 ����
	public static void main(String[] args) {
		//�޼ҵ�(method)�� �ڵ带 ������ �� �ְ� ����
		printNumber(); //�޼ҵ� ȣ��
		
		for(int i = 1; i <= 3; i++) {
			printNumber();
		}
		
		printNumber2(3); //�޼ҵ� ȣ��(3�� ����, x�� �Ű�����)
		printNumber3(2, 3); //�޼ҵ� ȣ��(���� �ΰ� ����)
		
		System.out.println(getNumber(100, 200));
		
		String[] members = getMembers();
		for(int i = 0; i < 2; i++) {
			System.out.println(members[i]);
		}
	}
}
