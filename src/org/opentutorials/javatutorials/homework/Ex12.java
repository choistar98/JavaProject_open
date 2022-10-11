package org.opentutorials.javatutorials.homework;

public class Ex12 {

	public static void main(String[] args) {
		int sum =0;
		for(int i =0; i<args.length; i++) {
			int num;
			try {
				num = Integer.parseInt(args[i]);
			}catch(Exception e){
				num=0;
			}
			sum +=num;
		}
		System.out.println(sum);

	}

}
