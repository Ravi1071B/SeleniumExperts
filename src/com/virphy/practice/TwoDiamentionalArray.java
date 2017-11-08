package com.virphy.practice;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[row][col] row--> no of times,  col- no of values
			int[][] arr = new int[2][3];
			
			//First row
			arr[0][0]=111;
			arr[0][1]=121;
			arr[0][2]=131;
			
			//Second row
			
			arr[1][0]=211;
			arr[1][1]=311;
			arr[1][2]=411;
			
			int row = arr.length;
			int col = arr[0].length;
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

	}

}
