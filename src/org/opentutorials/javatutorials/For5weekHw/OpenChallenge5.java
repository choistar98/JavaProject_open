package org.opentutorials.javatutorials.For5weekHw;

import java.util.Scanner;

abstract class GameObject {
	protected int distance;
	protected int x,y;
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) {
		if(this.x == p.getX() &&this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();
	protected abstract char getShape();
}

class Bear extends GameObject {
	Bear(int x, int y, int distance){
		super(x,y,distance);
	}
	protected void move() {
		Scanner sc = new Scanner(System.in);
		System.out.print("왼쪽(a), 아래(s), 위(d) 오른쪽(f)");
		char key = sc.next().charAt(0);
		switch(key) {
		case 'a':
			this.x -=this.distance;
			break;
		case 's':
			this.y +=this.distance;
			break;
		case 'd':
			this.x +=this.distance;
			break;
		case 'f':
			this.y -=this.distance;
			break;
		default:
			System.out.print("잘못입력하셨습니다.");
		}
	}
	protected char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {
	int turn;
	Fish(int x, int y, int distance){
		super(x,y,distance);
		turn =0;
	}
	protected void move() {
		if(turn%5 >2) {
			int randNum = (int)Math.random()*4;
			switch(randNum) {
			case 0:
				this.x -=this.distance;
				break;
			case 1:
				this.y -=this.distance;
				break;
			case 2:
				this.x +=this.distance;
				break;
			case 3:
				this.y +=this.distance;
				break;
			default:
				System.out.print("잘못입력하셨습니다.");
			}
		}
		turn++;
	}
	protected char getShape() {
		return '@';
	}
}

class Game{
	Fish fish;
	Bear bear;
	char[][] map;
	
	Game(){
		map = new char[10][20];
		for(int i=0; i<10; i++) {
			for(int j =0; j<20; j++)
				map[i][j]='-';
		}
		fish = new Fish(5,10,1);
		bear = new Bear(0,0,1);
		map[fish.getX()][fish.getY()]=fish.getShape();
		map[bear.getX()][bear.getY()]=bear.getShape();
	}
	
	void showMap() {
		for(int i=0; i<10; i++) {
			for(int j =0; j<20; j++)
				System.out.print(map[i][j]+"");
			System.out.println();
		}
	}
	
	void gameStart() {
		System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
		showMap();
		while(true) {
			map[fish.getX()][fish.getY()]='-';
			map[bear.getX()][bear.getY()]='-';
			bear.move();
			fish.move();
			map[fish.getX()][fish.getY()]=fish.getShape();
			map[bear.getX()][bear.getY()]=bear.getShape();
			showMap();
			if(fish.getX()==bear.getX() && fish.getY() == bear.getY()) {
				System.out.println("Bear Wins!!");
				break;
			}
				
		}
		
	}
}



public class OpenChallenge5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game app = new Game();
		app.gameStart();

	}

}
