package org.opentutorials.java.oop;

public class Scope {
	int v = 10;
	 
	void m() {
		int v = 20;
	    System.out.println(this.v);
	}
}

/*
 * this�� �ν��Ͻ� �ڽ��� �ǹ��ϴ� Ű����
 * ��ü���� ���α׷��ֿ����� �������̸� ���������� ����� �����ϴ� ���� ����
 * ���� ��ü�� �ʹ� ��������� �ʵ��� �����ϰ� �Ը� �ɰ��� �͵� �߿�
 */