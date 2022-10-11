package org.opentutorials.javatutorials.method;

public class MethodDemo {

	public static void main(String[] args) {
		String a = numbering2(1,4);
		System.out.println(a);

	}
	
	public static void numbering() {
		int i =0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}
	public static String numbering2(int init, int limit) {
		int i =init;
		String output = "";
		while (i<limit) {
			output += i;
			i++;
		}
		return output;
	}

}
