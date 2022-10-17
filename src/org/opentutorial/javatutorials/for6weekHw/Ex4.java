package org.opentutorial.javatutorials.for6weekHw;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int 강수량;
		Vector<Integer> 강수량벡터 = new Vector<Integer>();
		Iterator<Integer> it;
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			강수량 = sc.nextInt();
			if(강수량 == 0)
				break;
			강수량벡터.add(강수량);
			it = 강수량벡터.iterator();
			int sum =0;
			int count = 0;
			while(it.hasNext()) {
				int number = it.next();
				count ++;
				sum+=number;
				System.out.print(number+ " ");
			}
			System.out.println();
			System.out.println("현재 평균" +sum/count);
		}
		sc.close();
	}

}
