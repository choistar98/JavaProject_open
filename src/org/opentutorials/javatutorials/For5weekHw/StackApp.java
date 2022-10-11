package org.opentutorials.javatutorials.For5weekHw;

import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

public class StackApp implements Stack{
	int numberOfData;
	int maxlen;
	String[]arr;
	
	StackApp(int maxlen){
		this.maxlen = maxlen;
		arr = new String[this.maxlen];
		numberOfData =0;
	}
	
	public int length() {
		return numberOfData;
	}
	public int capacity() {
		return maxlen;
	}
	public String pop() {
		this.numberOfData--;
		return arr[numberOfData];
	}
	public boolean push(String val) {
		if(numberOfData ==maxlen) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		}
		this.arr[numberOfData] = val;
		numberOfData++;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("총 스택 저장 공간의 크기 입력>>>");
		int numberOfStack = sc.nextInt();
		StackApp app = new StackApp(numberOfStack);
		while(true) {
			
			System.out.print("문자열 입력 >>");
			str = sc.next();
			if(str.equals("그만"))
					break;
			app.push(str);
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i =0; i<numberOfStack; i++) {
			System.out.print(app.pop() +" ");
		}
		sc.close();
	}

}
