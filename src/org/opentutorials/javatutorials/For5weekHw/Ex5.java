package org.opentutorials.javatutorials.For5weekHw;

import java.util.Calendar;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간은:" +now.get(Calendar.HOUR)+"시"+now.get(Calendar.MINUTE)+"분입니다.");
		int hour = now.get(Calendar.HOUR_OF_DAY);
		if (hour>=4 && hour<=12)
			System.out.println("good Morning");
		else if (hour<=18)
			System.out.println("good Afternoon");
		else if (hour<=22)
			System.out.println("good Evening");
		else
			System.out.println("good Night");

	}

}
