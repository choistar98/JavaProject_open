package org.opentutorials.javatutorials.homework;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int []unit = {50000, 10000, 1000, 500, 100, 50, 10,1};
		System.out.print("금액을 입력하오>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		for(int i =0; i<unit.length; i++) {
			int quotient=money/unit[i];
			if(quotient!=0) {
				System.out.println(unit[i]+"원 짜리 :"+quotient +"개");
				money = money%unit[i];
			}
		}
		sc.close();
	}
}
