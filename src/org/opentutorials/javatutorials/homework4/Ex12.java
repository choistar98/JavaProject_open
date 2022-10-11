package org.opentutorials.javatutorials.homework4;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int optionNum;
		ConsertReservationSystem app = new ConsertReservationSystem();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			optionNum = sc.nextInt();
			switch(optionNum) {
			case 1:
				app.reserve();
				break;
			case 2:
				app.check();
				break;
			case 3:
				app.cancel();
				break;
			case 4:
				return;
			default:
				System.out.println("1~4를 입력하세요");
			}
			sc.nextLine();
		}
		
		

	}

}

class Seat{
	boolean reservation;
	String name;
	int number;
	Seat(){
		this.reservation=false;
		this.name=null;
	}
	Boolean isReserved(){
		return reservation;
	}
	boolean reserve(String name) {
		if(isReserved()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}else {
			this.reservation = true;
			this.name = name;
			return true;
		}
	}
	void cancel() {
		if(isReserved()) {
			this.reservation = false;
			this.name = null;
		}
	}
	String ShowInfo() {
		if(isReserved()) {
			return this.name;
		}
		else
			return "---";
	}
}
class ConsertReservationSystem{
	Seat[][] seats=new Seat[3][10];
	ConsertReservationSystem(){
		for(int i =0; i<3; i++) {
			for(int j = 0; j<10; j++) {
				seats[i][j]= new Seat();
			}
		}
	}
	void reserve(){
		int number;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int classNum= sc.nextInt();
		
		while(true) {
			System.out.print("이름>>");
			name = sc.next();
			System.out.print("번호>>");
			number = sc.nextInt();
			if(this.seats[classNum-1][number-1].reserve(name)) {
				System.out.println("예약되었습니다.");
				break;
			}
		}
	}
	void check() {
		for(int i=0; i<3; i++) {
			printClass(i+1);
			for(int j =0; j<10; j++) {
				System.out.print(this.seats[i][j].ShowInfo()+" ");
			}
			System.out.println();
		}
	}
	void cancel() {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("좌석 S(1), A(2), B(3)>>");
		int classNum= sc.nextInt();
		printClass(classNum);
		for(int i =0; i<10; i++) {
			System.out.print(this.seats[classNum-1][i].ShowInfo()+" ");
		}
		System.out.println();
		System.out.println("이름>>");
		name = sc.next();
		for(int i =0; i<10; i++) {
			if(this.seats[classNum-1][i].ShowInfo().equals(name))
				this.seats[classNum-1][i].cancel();
		}
	}
	void printClass(int number) {
		switch(number){
			case 1:
				System.out.print("A>>");
				break;
			case 2:
				System.out.print("B>>");
				break;
			case 3:
				System.out.print("C>>");
				break;
		}
	}

}
