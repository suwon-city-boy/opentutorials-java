package org.opentutorials.java.oop;

public class ScopeDemo {
	
	static int i;
    
    static void a() {
        int i = 0;
    }
    
    static void b() {
    	int i = 100;
    	c();
    }
    
    static void c() {
    	System.out.println(i);
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i); //0 1 2 3 4
        }
        
        b(); //5
        
        Scope sc = new Scope();
        sc.m(); //10
    }
	
}

/*
 * 메소드 안에서 선언한 변수는 그 메소드가 실행될 때 만들어지고, 그 메소드가 종료되면 삭제
 * 클래스 아래의 변수와 메소드 아래의 변수가 같은 이름을 가지고 있다면 메소드 아래의 변수가 우선
 * 메소드 내의 변수가 존재하지 않을 때 클래스 아래의 변수를 사용하게 되는 것
 * 클래스 변수는 클래스 전역에 영향을 미치지만 메소드 내 지역 변수는 클래스 변수보다 우선순위가 높음
 * 클래스 전역에서 접근 할 수 있는 변수 = 전역변수
 * 메소드 내에서만 접근 할 수 있는 변수 = 지역변수
 * 메소드 내에서 지역변수가 존재하지 않는다면, 그 메소드가 소속된 클래스의 전역변수를 사용
 * 사용되는 시점에서의 유효범위를 사용하는 것이 아니라 정의된 시점에서의 유효범위를 사용 = 정적 스코프 혹은 렉시컬 스코프
 * 자바는 동적 스코프를 채택하지 않았고, 대부분의 현대적인 언어들이 정적 스코프 방식을 선택
 */