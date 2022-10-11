package org.opentutorials.javatutorials.homework;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int numberOfArr = sc.nextInt();
		int []arr = new int[numberOfArr];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			for(int j =0; j<i;j++)
			{
				if(arr[i] == arr[j])
				{					
					i--;
					break;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			if(i!=0 && i%10 == 0)
				System.out.println();
			System.out.printf("%3d ",arr[i]);
		}
		sc.close();
	}

}
