package org.opentutorials.java.collection;

import java.util.*;

public class MapDemo {
	 public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
         
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
        
        //Map 인터페이스를 구현하는 HashMap과 HashTable
        Map<String, Integer> b = new HashMap<String, Integer>();
        b = new Hashtable<String, Integer>();
    }
	 
	static void iteratorUsingForEach(HashMap map){
		//메소드 entrySet은 Map의 데이터를 담고 있는 Set을 반환
		//반환한 Set의 값이 사용할 데이터 타입은 Map.Entry(인터페이스)
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
     
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
