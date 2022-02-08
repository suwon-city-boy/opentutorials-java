package org.opentutorials.java.basics.generic;

public class GenericDemo {
	
	 public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); //������ ����
         
        Person<String> p2 = new Person<String>("����");
        String ei2 = p2.info;
        //System.out.println(ei2.rank); //������ ����
        
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10); //�⺻ ������ Ÿ���� int�� ���� ������ Ÿ������ ��ȯ(Wrapper Ŭ������� ��)
        Person2<EmployeeInfo, Integer> p3 = new Person2<EmployeeInfo, Integer>(e, i);
        System.out.println(p3.id.intValue());
        p3.<EmployeeInfo>printInfo(e);
        p3.printInfo(e);
    }
}

/*
 * ���׸��� ���� ������ Ÿ�Կ� ���ؼ��� ����� �� ����
 */
