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
        
        //Map �������̽��� �����ϴ� HashMap�� HashTable
        Map<String, Integer> b = new HashMap<String, Integer>();
        b = new Hashtable<String, Integer>();
    }
	 
	static void iteratorUsingForEach(HashMap map){
		//�޼ҵ� entrySet�� Map�� �����͸� ��� �ִ� Set�� ��ȯ
		//��ȯ�� Set�� ���� ����� ������ Ÿ���� Map.Entry(�������̽�)
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
