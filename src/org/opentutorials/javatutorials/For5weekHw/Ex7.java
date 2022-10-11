package org.opentutorials.javatutorials.For5weekHw;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			System.out.print(">>");
			str = sc.nextLine();
			if(str.equals("그만"))
				break;
			StringTokenizer st =new StringTokenizer(str," ");
			System.out.println("어절의 개수는 "+ st.countTokens());
		}
		sc.close();
	}

}
