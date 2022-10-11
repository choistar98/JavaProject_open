package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class InputDemo {
	public static void main(String[] args) {
		try {
			File file = new File("1234.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e) {
		 e.printStackTrace();
		}
	}
}
