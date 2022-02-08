package org.opentutorials.java.basics.generic;

public class GenericDemo {
	
	 public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); //컴파일 성공
         
        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        //System.out.println(ei2.rank); //컴파일 실패
        
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10); //기본 데이터 타입인 int를 참조 데이터 타입으로 변환(Wrapper 클래스라고 함)
        Person2<EmployeeInfo, Integer> p3 = new Person2<EmployeeInfo, Integer>(e, i);
        System.out.println(p3.id.intValue());
        p3.<EmployeeInfo>printInfo(e);
        p3.printInfo(e);
    }
}

/*
 * 제네릭은 참조 데이터 타입에 대해서만 사용할 수 있음
 */
