package org.opentutorials.java.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two"; //�ε��� 2�� �����Ϸ��ϸ� ���� �߻�
		
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList�� ũ�⸦ �̸� �������� ����
		//ArrayList<String> al = new ArrayList<String>(); -> ������ �̷� ��
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		Collections.sort(al); //����(List ������ �÷��� ����)
		//list�� ���׸� <T>�� Comparable�� extends �ϰ� �־�� ��
		//Comparable�� �������̽��̸�, �̸� �����ϴ� Ŭ������ compareTo(T ������) �޼ҵ带 ������ �־�� ��
		//�޼ҵ� sort�� �����ϸ� ���������� compareTo�� �����ϰ� �� ����� ���� ��ü�� ���� ���踦 �Ǻ�
		
		for(int i=0; i<al.size(); i++) {
			//Object Ÿ���� String���� ����� ��ȯ
			//������ ���׸� ���
			String val = (String)al.get(i);
			System.out.println(val);
		}
	}
}

/*
 * �÷����� �����ӿ�ũ = �����̳�
 * �ڹٿ��� �����ϴ� �پ��� ��Ȳ���� ����� �� �ִ� �پ��� �����̳�
 * Collection�� Map�̶�� �ֻ��� ī�װ��� �ְ�, �� �Ʒ��� �پ��� �÷��ǵ��� ����
 * Collection �ؿ��� Set, List, Queue ī�װ��� ����
 * �� ī�װ��� ���� Api�� ������ ����
 */