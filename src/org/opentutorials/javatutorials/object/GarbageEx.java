package org.opentutorials.javatutorials.object;

public class GarbageEx {

	public static void main(String[] args) {
		String a= new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a=null;
		d = c;
		c = null;
		//Good을 가리키는 참조자가 없음으로 가비지가 된다.
	}

}
