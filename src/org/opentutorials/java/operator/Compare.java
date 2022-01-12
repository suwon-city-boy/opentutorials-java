package org.opentutorials.java.operator;

public class Compare {

	public static void main(String[] args) {
		//비교 연산자의 결과값 : true or false
		System.out.println(1==2); //false
		System.out.println(1==1); //true
		
		System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        
        int a=1, b=2;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        
        int c=2, d=5;
        System.out.println(c > d); //false
        System.out.println(c <= d); //true
        
        /*
         * 문자열의 비교 : .equals와 ==
         * 차이점 ? ==은 두개의 데이터 타입이 동일한 객체인지를 알아내는 것
         * .equals는 서로 다른 객체들간에 값이 같은지 비교하는 것
         */
        
        String str = "aaa";
        String str2 = new String("aaa");
        System.out.println(str==str2); //false
        System.out.println(str.equals(str2)); //true
	}

}
