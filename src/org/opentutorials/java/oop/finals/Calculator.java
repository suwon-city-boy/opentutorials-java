package org.opentutorials.java.oop.finals;

public class Calculator {
	//������ ���� �̷� ���� ���� �տ� final�� �ٿ��� �� ���� ����Ǵ� ���� ������ �� ����
	static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        
        //final�� ������ �������� �ѹ� ���� �Ҵ�Ǹ� �� ���� �ٲ� �� ����
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
