package org.opentutorials.javatutorials.homework4;

import java.util.Scanner;

class Phone{
	String name;
	String tel;
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
}

class PhoneBook{
	Phone[] phoneArr;
	int max;
	int currentNumber;
	
	PhoneBook(int num){
		this.phoneArr = new Phone[num];
		this.max = num;
		this.currentNumber=0;
	}
	
	void addPhone(String name, String num) {
		if(currentNumber ==max)
			System.out.println("저장 할 수 없습니다. ");
		else {
			phoneArr[currentNumber++] = new Phone(name, num);
		}
	}
	void search(String name) {
		for(int i =0; i<currentNumber; i++) {
			if(phoneArr[i].name.equals(name)) {
				System.out.println(phoneArr[i].name+"의 번호는"+ phoneArr[i].tel);
				return;
			}
		}
		System.out.println(name+"이 없습니다.");
	}
}
public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneBook phoneBook;
		System.out.println("인원수>>");
		int number = sc.nextInt();
		phoneBook = new PhoneBook(number);
		
		for(int i =0; i<number; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel  = sc.next();
			phoneBook.addPhone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.println("검색할 이름>>");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			else
				phoneBook.search(name);
		}
		sc.close();
		

	}

}
