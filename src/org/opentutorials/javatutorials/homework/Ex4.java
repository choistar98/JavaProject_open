package org.opentutorials.javatutorials.homework;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s= sc.next();
		char to = s.charAt(0);
	
		for(;to>='a'; to--) {
			for(char from='a'; from<=to;from++)
			{
				System.out.print(from);
			}
			System.out.println();
		}
		sc.close();
	}
}
