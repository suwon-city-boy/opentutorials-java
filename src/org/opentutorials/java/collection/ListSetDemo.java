package org.opentutorials.java.collection;

import java.util.*;

public class ListSetDemo {
	public static void main(String[] args) {
		
        ArrayList<String> al = new ArrayList<String>(); //�ߺ� ��� o + ����Ǵ� ������ ����
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }
         
        HashSet<String> hs = new HashSet<String>(); //�ߺ� ��� x + ������ ����
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator(); //�޼ҵ� iterator�� ȣ�� ����� �������̽� iterator�� ������ ��ü�� ����
        //�������̽� iterator�� �Ʒ� �޼ҵ带 �����ϵ��� ����
        //hasNext() : �ݺ��� �����Ͱ� �� ������ true, �� �̻� �ݺ��� �����Ͱ� ���ٸ� false�� ����
        //next() : hasNext�� true��� ���� next�� ������ �����Ͱ� �����Ѵٴ� �ǹ�
        
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}

/*
 * �޼ҵ� iterator�� �������̽� Collection�� ���ǵǾ� ����
 * ���� Collection�� �����ϰ� �ִ� ��� �÷����� �����ӿ�ũ�� �� �޼ҵ带 �����ϰ� ����
 */
