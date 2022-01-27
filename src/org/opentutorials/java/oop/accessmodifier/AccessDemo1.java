package org.opentutorials.java.oop.accessmodifier;

public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x());
		System.out.println(a.y());
		//private이라 클래스 밖에서는 접근 불가
		//System.out.println(a.z());
	}
}

/*
 * 객체의 로직을 보호하기 위해서는 멤버에 따라서 외부의 접근을 허용하거나 차단해야 할 필요가 있음
 * 접근 제어자를 사용하는 또 다른 이유? 사용자에게 객체를 조작 할 수 있는 수단을 제공함으로서 객체의 사용에 집중 할 수 있도록 도움
 * protected는 상속 관계에 있다면 서로 다른 패키지에 있는 클래스의 접근도 허용
 * default는 접근 제어 지시자가 없는 경우를 의미, 접근 제어자가 없는 메소드는 같은 패키지에 있고 상속 관계에 있는 메소드에 대해서만 접근을 허용
 * 접근 통제가 삼엄한 순서 : private > default > protected > public
 
 * 클래스의 접근 제어자는 패키지와 관련된 개념으로 public과 default 존재
 * 접근 제어자가 public인 클래스는 다른 패키지의 클래스에서도 사용 가능
 * 접근 제어자가 default인 클래스는 경우는 같은 패키지에서만 사용 가능
 
 * public 클래스가 포함된 소스코드는 public 클래스의 클래스 명과 소스코드의 파일명이 같아야 함
 * 즉, 하나의 소스 코드에는 하나의 public 클래스가 존재
 */
