package org.opentutorial.javatutorials.for6weekHw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
	String 도시;
	String 위도;
	String 경도;
	Location(String 도시, String 위도, String 경도){
		this.도시 =도시;
		this.위도 = 위도;
		this.경도 = 경도;
	}
	void printLocation() {
		System.out.printf("%5s%5s%5s\n",this.도시,this.경도, this.위도);
	}
}
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> map =new HashMap<String, Location>() ;
		Scanner sc = new Scanner(System.in);
		Location location;
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i =0; i<4; i++) {
			System.out.print(">> ");
			String str = sc.nextLine();
			String[] strlist =str.split(", ");
			location = new Location(strlist[0],strlist[1],strlist[2]);
			map.put(strlist[0], location);
		}
		System.out.println("--------------------- ");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			location = map.get(it.next());
			location.printLocation();
		}
		System.out.println("--------------------- ");
		while(true) {
			System.out.print("도시 이름>> ");
			String city =sc.next();
			if(city.equals("그만"))
				break;
			location = map.get(city);
			if(location != null) {
				location.printLocation();
			}
			else {
			System.out.println(city+"는 없습니다.");
			}
		}
		sc.close();
	}

}
