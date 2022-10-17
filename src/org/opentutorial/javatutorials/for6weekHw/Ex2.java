package org.opentutorial.javatutorials.for6weekHw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		String scores = sc.nextLine();
		String[] scorelist = scores.split(" ");
		for(int i =0; i<scorelist.length; i++) {
			list.add(scorelist[i]);
		}
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String n = it.next();
			switch(n.charAt(0)) {
			case 'A':
				sum +=4.0; break;
			case 'B':
				sum +=3.0; break;
			case 'C':
				sum +=2.0; break;
			case 'D':
				sum +=1.0; break;
			case 'f':
				sum +=0.0; break;	
			}
		}
		System.out.print(sum/6);
		sc.close();
	}

}
