package org.opentutorials.java.operator;

public class Compare {

	public static void main(String[] args) {
		//�� �������� ����� : true or false
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
         * ���ڿ��� �� : .equals�� ==
         * ������ ? ==�� �ΰ��� ������ Ÿ���� ������ ��ü������ �˾Ƴ��� ��
         * .equals�� ���� �ٸ� ��ü�鰣�� ���� ������ ���ϴ� ��
         */
        
        String str = "aaa";
        String str2 = new String("aaa");
        System.out.println(str==str2); //false
        System.out.println(str.equals(str2)); //true
	}

}
