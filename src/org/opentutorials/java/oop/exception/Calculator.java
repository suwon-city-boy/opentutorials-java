package org.opentutorials.java.oop.exception;

class Calculator{
	
    int left, right;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    public void divide(){
    	try { //try 안에는 예외 상황이 발생할 것으로 예상되는 로직을 위치시킴
    		System.out.print("계산결과는 ");
    		//오류가 발생하면서 try 내의 실행이 중단되고 catch 구문 안의 내용이 실행
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
    	}
    	//Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속되어 있음
    	//예외가 발생하면 자바는 마치 메소드를 호출하듯이 catch를 호출하면서 그 인자로 Exception 클래스의 인스턴스를 전달
    	catch(Exception e) { //catch 안에는 예외가 발생했을 때 뒷수습을 하기 위한 로직이 위치함
    		//e.getMessage()는 자바가 전달한 인스턴스의 메소드 중 getMessage를 호출하는 코드
    		//getMessage는 오류의 원인을 사람이 이해하기 쉬운 형태로 리턴
    		//오류에 대한 기본적인 내용을 출력
    		System.out.println("오류가 발생했습니다 : " + e.getMessage());
    		//e.toString()은 e.getMessage()보다 더 자세한 예외 정보를 제공
    		System.out.println("\n\ne.toString()\n" + e.toString());
    		//메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없음
    		//이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력
    		//printStackTrace는 가장 자세한 예외 정보를 제공
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
    	}
    	finally {
            System.out.println("finally");
        }
    }
} 

/*
 * 예외란 프로그램을 만든 프로그래머가 상정한 정상적인 처리에서 벗어나는 경우에 이를 처리하기 위한 방법
 * 조건문의 else if처럼 여러 개의 catch를 하나의 try 구문에서 사용할 수 있음
 * finally는 try 구문에서 예외가 발생하는 것과 상관없이 언제나 실행되는 로직
 
 * (ex) 데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 함
 * 이때 데이터베이스 서버와 작성한 에플리케이션은 서로 접속상태를 유지
 * 데이터베이스를 제어하는 과정에서 예외가 발생해서 더 이상 후속 작업을 수행하는 것이 불가능한 경우가 있을 수 있음
 * 예외가 발생했다고 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 되고
 * 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있음
 * 접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 좋은 작업
 */