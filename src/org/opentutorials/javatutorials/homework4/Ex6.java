package org.opentutorials.javatutorials.homework4;

import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	public Circle(double x, double y , int radius) {
		this.x= x; this.y=y; this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);	
	}
	double area() {
		return 3.14*this.radius*this.radius;
	}
}

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i =0; i<c.length; i++) {
			System.out.print("x,y,radius>>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i] = new Circle(x,y,r);
		}
		double arr[] = new double[3];
		for(int i=0; i<c.length; i++) {
			arr[i] = c[i].area();
		}
		int bigIndex =arr[0]<arr[1]? 1:0;
		bigIndex =arr[bigIndex]<arr[2]? 2:bigIndex;
		
		System.out.print("가장 면적이 큰 원든: " );
		c[bigIndex].show();
		
		scanner.close();
	}

}
