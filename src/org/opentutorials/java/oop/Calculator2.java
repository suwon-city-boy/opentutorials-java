package org.opentutorials.java.oop;

public class Calculator2 {
	int left, right;
	static double PI = 3.14;
	static int special = 100;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + special);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

/*
 * 각각의 인스턴스 마다 원주율의 값을 별도로 가지고 있을 필요가 없음
 * 이런 경우 변수를 클래스의 맴버로 만듬
 * static을 맴버(변수,메소드) 앞에 붙이면 클래스 멤버
 * 클래스 변수의 용도
 * - 인스턴스에 따라서 변하지 않는 값이 필요한 경우
 * - 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
 * - 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
 */
