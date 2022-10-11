package org.opentutorials.javatutorials.object;
class Point2 {
	private int x,y;
	public Point2() {
		this.x = this.y = 0;
	}
	public Point2(int x, int y ) {
		this.x = x ; this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point2 {
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		
		
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();

	}

}
