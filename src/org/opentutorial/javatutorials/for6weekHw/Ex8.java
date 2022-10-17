package org.opentutorial.javatutorials.for6weekHw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Point{
	String name;
	int point;
	
	
}
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**포인트 관리 프로그램입니다.**");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		Iterator<String> it;
		Set<String> keys;
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String input = sc.nextLine();
			if(input.equals("그만"))
				break;
			String[] str = input.split(" ");
			String name = str[0];
			Integer point =Integer.parseInt(str[1]);
			if(map.containsKey(name)) {
				map.put(name, point+map.get(name));
			}
			else {
				map.put(name, point);
			}
			keys=map.keySet();
			it=keys.iterator();
			while(it.hasNext()) {
				String key=it.next();
				Integer value = map.get(key);
				System.out.print("("+key+","+value+")");
			}
			System.out.println();
		}
		sc.close();
	}

}
