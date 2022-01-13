package org.opentutorials.java.statements;

public class Loop {
	
	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			System.out.println("Loop : " + i++);
		}
		
		//for���� Ư���� Ƚ����ŭ �ݺ� ������ �ϴ� ��쿡 ���� �����
		for (int j = 1; j < 10; j++) {
			System.out.println("Loop : " + j);
		}
		
		for (int j = 1; j < 10; j++) {
			if(j == 5) continue;
			if(j == 8) break;
			System.out.println("Loop with Control : " + j);
		}
		
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.println(x + " " + y);
			}
		}
	}
	
}
