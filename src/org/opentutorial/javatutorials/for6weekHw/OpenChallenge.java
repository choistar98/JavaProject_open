package org.opentutorial.javatutorials.for6weekHw;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

class Word{
	String Korean;
	String English;
	Word(String Korean, String English){
		this.Korean = Korean;
		this.English = English;
	}
	String getEngWord() {
		return English;
	}
	String getKorWord() {
		return Korean;
	}
}
public class OpenChallenge {

	private String name;
    private Scanner sc;
    private Vector<Word> v;
    final int MAX = 4;
    int[] question;
    
    public OpenChallenge() {
        name = "명품영어";
        question = new int[MAX];
        sc = new Scanner(System.in);
        v = new Vector<Word>();
        v.add(new Word("사랑", "love"));
		v.add(new Word("그림", "paint"));
		v.add(new Word("감정", "emotion"));
		v.add(new Word("아기", "baby"));
		v.add(new Word("인간", "human"));
		v.add(new Word("눈", "eye"));
		v.add(new Word("책", "book"));
		v.add(new Word("학교", "school"));
		v.add(new Word("사회", "society"));
		v.add(new Word("오류", "error"));
    }
    
    public void run() {
    	while(true) {
    		System.out.print("단어 테스트:1, 단어 삽입:2 종료:3>>");
	    	int chooseNum = sc.nextInt();
	    	switch(chooseNum) {
	    	case 1:
	    		testWord();
	    		break;
	    	case 2:
	    		sc.nextLine();
	    		addWord();
	    		break;
	    	case 3:
                sc.close();
	    		return;
	    	default:
	    		System.out.println("잘못 입력하셨습니다.");
	    	}
    	}
    }
    public void randomQuiz() {
        for(int i = 0; i < MAX; i++) {
            question[i] = (int)(Math.random() * v.size()); 
            for(int j = 0; j < i; j++) {
                if(question[i] == question[j]) {
                    i--;
                    continue;
                }
            }
        }
    }
    public void testWord() {
    	System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
        while(true) {
        	try {
        		randomQuiz();
        		int answerNumber = (int)(Math.random() * question.length); 
        		int answerIndex = question[answerNumber]; 
        		System.out.println(v.get(answerIndex).getEngWord() + "?");
        		for(int i = 0; i < question.length; i++) {
        			System.out.print("(" + (i + 1) + ")" + v.get(question[i]).getKorWord() + " ");
        		}
        		System.out.print(">> ");
        		int input = sc.nextInt();
        		if(input == -1){
        			System.out.println("\"" + name + "\"" + "를 종료합니다...");
        			break;
        		}
        		else if(input - 1 == answerNumber) 
        			System.out.println("Excellent !!");
        		else
        			System.out.println("No. !!");
        	}catch(InputMismatchException error){
        		System.out.println("숫자를 입력하세요");
        		sc.nextLine();
        		continue;
        	}
        }
    }
    public void addWord() {
    	System.out.println("한글단어에 그만을 입력하면 입렵을 종료합니다.");
    	String input;
    	String[] words;
    	while(true) {
    		System.out.print("한글 영어 입력 >>");
    		input =sc.nextLine();
    		if(input.equals("그만"))
    			return;
    		words = input.split(" ");
    		v.add(new Word(words[0],words[1]));
    	}

    }
    public static void main(String[] args) {
		OpenChallenge app = new OpenChallenge();
		app.run();
	}

}
