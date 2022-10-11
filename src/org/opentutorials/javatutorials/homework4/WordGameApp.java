package org.opentutorials.javatutorials.homework4;

import java.util.Scanner;

class Player {
	String name;
	String word;
	boolean isHeDie;
	Player(String name){
		this.name = name;
		this.word = null;
		this.isHeDie = false;
	}
	String getWordFromUser(){
		Scanner sc = new Scanner(System.in);
		System.out.print(this.name+ ">>");
		this.word = sc.next();
		return this.word;
	}
	boolean checkSuccess(char c) {
		char firstChar = this.word.charAt(0);
		if (firstChar == c)
			return true;
		else {
			System.out.println(this.name +"이 졌습니다.");
			this.isHeDie = true;
			return false;
		}
	}
	
}
public class WordGameApp {
	
	Player[] arr;
	int numOfPlayer;
	String currentWord;
	
	WordGameApp(int numOfPlayer){
		this.arr = new Player[numOfPlayer];
		this.numOfPlayer = numOfPlayer;
		this.currentWord = "아버지";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int num = sc.nextInt();
		WordGameApp app = new WordGameApp(num);
		app.run();
		sc.close();

	}
	void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<this.numOfPlayer; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = sc.next();
			this.arr[i] = new Player(name);
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		while(true) {
			for(int i =0; i<this.numOfPlayer; i++) {
				char lastChar = currentWord.charAt(currentWord.length()-1);
				arr[i].getWordFromUser();
				
				if(arr[i].checkSuccess(lastChar)) {
					this.currentWord = arr[i].word;
				}else {
					return;
				}
			}
		}
	}
	
	

}
