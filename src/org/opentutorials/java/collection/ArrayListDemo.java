package org.opentutorials.java.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two"; //인덱스 2를 참조하려하면 에러 발생
		
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList는 크기를 미리 지정하지 않음
		//ArrayList<String> al = new ArrayList<String>(); -> 지금은 이런 식
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		Collections.sort(al); //정렬(List 형식의 컬렉션 지원)
		//list의 제네릭 <T>는 Comparable을 extends 하고 있어야 함
		//Comparable은 인터페이스이며, 이를 구현하는 클래스는 compareTo(T 변수명) 메소드를 가지고 있어야 함
		//메소드 sort를 실행하면 내부적으로 compareTo를 실행하고 그 결과에 따라서 객체의 선후 관계를 판별
		
		for(int i=0; i<al.size(); i++) {
			//Object 타입을 String으로 명시적 변환
			//지금은 제네릭 사용
			String val = (String)al.get(i);
			System.out.println(val);
		}
	}
}

/*
 * 컬렉션즈 프래임워크 = 컨테이너
 * 자바에서 제공하는 다양한 상황에서 사용할 수 있는 다양한 컨테이너
 * Collection과 Map이라는 최상위 카테고리가 있고, 그 아래에 다양한 컬렉션들이 존재
 * Collection 밑에는 Set, List, Queue 카테고리가 있음
 * 각 카테고리는 같은 Api를 가지고 있음
 */