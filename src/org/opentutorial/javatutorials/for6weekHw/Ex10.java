package org.opentutorial.javatutorials.for6weekHw;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
	public Shape() {};
	abstract public void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		Scanner sc = new Scanner(System.in);
		Vector<Shape> vector= new Vector<Shape>();
		while(true) {
			int chooseNum;
			System.out.print("삽입(1), 삭제(2), 모두보기(3),종료(4)>>>");
			chooseNum = sc.nextInt();
			switch(chooseNum) {
			case 1:
				System.out.print("Line(1),Rect(2),Circle(3)>>");
				int insert = sc.nextInt();
				if(insert ==1) {
					vector.add(new Line());
				}else if(insert ==2) {
					vector.add(new Rect());
				}else if(insert ==3) {
					vector.add(new Circle());
				}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				int removeNum = sc.nextInt();
				if(removeNum<=0 || removeNum>vector.size()) System.out.println("삭제할 수 없습니다.");
				else
					vector.remove(removeNum-1);
				break;
			case 3:
				Iterator<Shape> it = vector.iterator();
				while(it.hasNext()) {
					Shape shape = it.next();
					shape.draw();
				}
				break;
			case 4:
				System.out.println("beauty를 종룔합니다.");
				break;
			default:
				System.out.print("잘못 입력하셨습니다.");
			}
		}
	}

}
