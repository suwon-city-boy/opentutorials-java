package org.opentutorials.java.oop.inheritance;

public class Calculator {
	int left, right;
	
	//기본 생성자(하위 클래스에서 필요)
	//public Calculator() {}
	
	//매개변수가 있는 생성자 선언시, 자동으로 기본 생성자를 만들어주지 않음
	//따라서 위처럼 기본 생성자를 따로 선언해줘야함
	//하지만, super 키워드를 사용하여 문제 해결 가능
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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
 * super는 상위 클래스를 가리키는 키워드
 * super()는 부모 클래스의 생성자를 의미
 * 하위 클래스의 생성자에서 super를 사용할 때 주의할 점은 super가 가장 먼저 나타나야 한다는 점
 * 그 이유는? 부모가 초기화되기 전에 자식이 초기화되는 일을 방지하기 위함
 */