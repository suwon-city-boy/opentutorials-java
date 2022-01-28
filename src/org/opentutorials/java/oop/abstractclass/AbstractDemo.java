package org.opentutorials.java.oop.abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		//추상 클래스 A를 인스턴스화하면 오류가 발생
		//A a = new A();
		
		B b = new B();
		System.out.println(b.b());
		b.d();
	}
}

/*
 * template method pattern?
 * 반복되는 패턴들을 모아서 정리한 것이 디자인 패턴(design pattern)
 * 동작 방법이 달라지는 메소드는 추상 메소드로 만들어서 하위 클래스에서 구현하도록 하고
 * 모든 클래스의 공통분모의 경우에는 상위 클래스에 두어서 코드의 중복, 유지보수의 편의성 등을 꾀할
 
 * 디자인 패턴의 장점
 * - 좋은 설계를 단기간에 학습할 수 있다는 점
 * - 소통에 도움이 된다는 점
 */
