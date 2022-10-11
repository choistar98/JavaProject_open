package org.opentutorials.javatutorials.object;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Calaulator {
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}