package org.opentutorials.javatutorials.condition;

public abstract class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		if(id.equals("yousung")&& password.equals("1111")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}

	}

}
