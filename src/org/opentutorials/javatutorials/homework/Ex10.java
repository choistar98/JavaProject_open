package org.opentutorials.javatutorials.homework;

public class Ex10 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		//random한 위치 배열로 만들기(10개 중복허용X)
		int randomPos[] =new int[10];
		for(int i =0; i<randomPos.length; i++) {
			randomPos[i] = (int)(Math.random()*16);
			for(int j =0; j<i;j++)
			{
				if(randomPos[i] == randomPos[j])
				{					
					i--;
					break;
				}
			}
		}
		//찾은위치 2차배열로 저장
		for(int i =0; i<randomPos.length; i++)
		{
			int pos = randomPos[i];
			int row = pos/4;
			int col = pos%4;
			arr[row][col]=(int)(Math.random()*10+1);
		}
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++)
			{				
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}
