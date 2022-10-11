package org.opentutorials.javatutorials.For5weekHw;

class Point {
	int x;
	int y;
	Point(int x,int y){
		this.x=x; this.y = y;
	}
	void setXY(int x, int y) {this.x=x; this.y=y;};
	public String toString() {
		return "("+x+","+y+")"+"의 점";
	}
	void move(int x ,int y) {
		this.x =x;
		this.y =y;
	}
}

public class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z =z;
	}
	void moveUp() {
		this.z++;
	}
	void moveDown() {
		this.z--;
	}
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z=z;
	}
	public String toString() {
		return "("+x+","+y+","+z+")"+"의 점";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");

	}

}
