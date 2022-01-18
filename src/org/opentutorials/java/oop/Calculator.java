package org.opentutorials.java.oop;

public class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

/*
 * 클래스는 연관되어 있는 변수와 메소드의 집합
 * 클래스 : 설계도, 인스턴스 : 제품
 * 객체를 만들어서 사용하는 이유는 재활용성을 높이기 위해서
 * this는 클래스를 통해서 만들어진 인스턴스 자신을 가리킴
 * 메소드 밖에서 선언한 변수는 인스턴스 내의 모든 메소드에서 접근이 가능
 * 변수 : 상태, 메소드 : 행동
 * 하나의 클래스가 여러개의 인스턴스가 될 수 있다는 점이 객체 지향이 제공하는 가장 기본적인 재활용성
 */
