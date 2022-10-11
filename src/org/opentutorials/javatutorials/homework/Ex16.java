package org.opentutorials.javatutorials.homework;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위 바위 보!>>>");
			int com = (int)(Math.random()*3);
			String user = sc.next();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다....");
				break;
			}
			int userNum=-1;
			for(int i =0; i<3; i++) {
				if(str[i].equals(user)) {
					userNum=i;
					break;
				}
			}
			if(userNum==-1) {
				System.out.println("다시입력하세요");
				continue;
			}
			
			int check = (com+3-userNum)%3;
			if(check ==0)
				System.out.println("사용자="+str[userNum]+" 컴퓨터="+str[com]+", 비겼습니다.");
			else if(check ==1)
				System.out.println("사용자="+str[userNum]+" 컴퓨터="+str[com]+", 졌습니다.");
			else
				System.out.println("사용자="+str[userNum]+" 컴퓨터="+str[com]+", 이겼습니다.");
		}
		sc.close();

	}

}
