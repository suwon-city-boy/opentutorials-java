package org.opentutorials.java.basics;

public class Method {
	
	public static void printNumber() { //메소드 정의
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	/*
	 * 메소드의 입력 값은 매개변수(parameter)를 통해서 이루어짐
	 * 입력을 통해서 메소드의 동작을 제어할 수 있음
	 */
	public static void printNumber2(int x) {
		for(int i = 1; i <= x; i++) {
			System.out.println(i);
		}
	}
	
	public static void printNumber3(int x, int y) {
		for(int i = x; i <= y; i++) {
			System.out.println(i);
		}
	}
	
	//반환값이 없으면 void, 있는 경우 데이터 타입에 맞게 명시
	public static int getNumber(int x, int y) {
		int result = x + y;
		return result; //return은 메소드를 중단시키는 역할도 가지고 있음
	}
	
	//여러 개의 데이터를 반환하고 싶을 땐 배열을 이용
		public static String[] getMembers() {
			String[] members = new String[2];
			members[0] = "송민호";
			members[1] = "이수근";
			return members;
		}
	
	//자바를 실행할 때 자바는 작성한 main메소드를 실행
	public static void main(String[] args) {
		//메소드(method)는 코드를 재사용할 수 있게 해줌
		printNumber(); //메소드 호출
		
		for(int i = 1; i <= 3; i++) {
			printNumber();
		}
		
		printNumber2(3); //메소드 호출(3은 인자, x는 매개변수)
		printNumber3(2, 3); //메소드 호출(인자 두개 전달)
		
		System.out.println(getNumber(100, 200));
		
		String[] members = getMembers();
		for(int i = 0; i < 2; i++) {
			System.out.println(members[i]);
		}
	}
}
