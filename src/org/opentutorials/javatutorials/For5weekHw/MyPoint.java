package org.opentutorials.javatutorials.For5weekHw;

public class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point(" +this.x+","+ this.y +")";
	}
	public boolean equals(Point p) {
		if (this.x==p.x&&this.y == p.y)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}

}
