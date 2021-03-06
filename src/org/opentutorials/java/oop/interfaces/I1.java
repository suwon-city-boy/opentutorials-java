package org.opentutorials.java.oop.interfaces;

//객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의  메소드들을 구현해야 함
//인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 에플리케이션은 컴파일 조차 되지 않음
public interface I1 {
	//인터페이스의 맴버는 반드시 public
	public void z();
}

/*
 * 인터페이스와 상속의 차이?
 * 상속이 상위 클래스의 기능을 하위 클래스가 물려 받는 것이라고 한다면, 인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제함
 * 상속은 extends를 사용하지만 인터페이스는 implements를 사용함
 
 * abstract vs interface
 * 인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능
 * 인터페이스는 클래스가 아닌 인터페이스라는 고유한 형태를 가지고 있는 반면 추상 클래스는 일반적인 클래스
 * 인터페이스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를 가지고 있을 수 있음
 
 *  인터페이스를 이용해 효과적인 협업이 가능?
 *  서로가 동일한 메소드를 만들도록 규약을 만들어서 공유, 각자가 상대의 일정이나 구현하는 방식에 덜 영향을 받으면서 에플리케이션을 구축 할 수 있음
 */