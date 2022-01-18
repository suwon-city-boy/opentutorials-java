package org.opentutorials.java.basics;

import java.io.*;
import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		
		while(sc.hasNextInt()) { //�Է°��� ����� ������ ������ ����
			System.out.println(sc.nextInt()*100);
		}
		
		sc.close();
		*/
		try {
			File file = new File("in.txt");
			Scanner scf = new Scanner(file);
			while(scf.hasNextInt()) {
				System.out.println(scf.nextInt() * 100);
			}
			scf.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
