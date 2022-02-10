package org.opentutorials.java.collection;

import java.util.*;

public class ListSetDemo {
	public static void main(String[] args) {
		
        ArrayList<String> al = new ArrayList<String>(); //중복 허용 o + 저장되는 순서가 유지
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
         
        HashSet<String> hs = new HashSet<String>(); //중복 허용 x + 순서가 없음
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator(); //메소드 iterator의 호출 결과로 인터페이스 iterator를 구현한 객체를 리턴
        //인터페이스 iterator는 아래 메소드를 구현하도록 강제
        //hasNext() : 반복할 데이터가 더 있으면 true, 더 이상 반복할 데이터가 없다면 false를 리턴
        //next() : hasNext가 true라는 것은 next가 리턴할 데이터가 존재한다는 의미
        
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}

/*
 * 메소드 iterator는 인터페이스 Collection에 정의되어 있음
 * 따라서 Collection을 구현하고 있는 모든 컬렉션즈 프레임웍크는 이 메소드를 구현하고 있음
 */
