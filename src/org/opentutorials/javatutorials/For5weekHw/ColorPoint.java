package org.opentutorials.javatutorials.For5weekHw;


public class ColorPoint extends Point{
	String color;
	ColorPoint(int x, int y, String color){
		super(x, y);
		setXY(x,y);
		this.color = color;
	}
	void setColor(String color) {this.color =color;}
	public String toString() {
		return this.color+"색의 "+ super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
