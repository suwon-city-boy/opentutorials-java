package org.opentutorials.java.oop.progenitor;

public class ObjectDemo {
	
	public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //Object의 equals를 오버로딩
    }
}

/*
 * 객체 간에 동일성을 비교하고 싶을 때는 ==를 사용하지 말고 equals를 이용
 * equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함
 * 그 이유가 분명하지 않다면 비교 연산자 == 은 원시 데이터형을 비교할 때만 사용
 
 * 원시 데이터 형(Primitive Data Type)이란?
 * 자바에서 기본적으로 제공하는 데이터 타입
 * byte, short, int, long, float, double, boolean, char
 * new 연산자를 이용해서 생성하지 않아도 사용될 수 있다는 특징
  
 * finalize는 객체가 소멸될 때 호출되기로 약속된 메소드지만, 사용은 추천되지 않음
 * https://d2.naver.com/helloworld/1329 -> 가비지 컬렉션에 대한 좋은 설명글
 
 * clone은 어떤 객체가 있을 때 그 객체와 똑같은 객체를 복제해주는 기능
 * clone의 대상이 되는 클래스는 Cloneable라는 빈 인터페이스를 구현(implements Cloneable)
 * 해당 클래스가 복제 가능하다는 것을 표시하기 위함
 */