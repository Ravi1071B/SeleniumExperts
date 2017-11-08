package com.virphy.practice;

public class SingleDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[3];
		
		arr[0]=123;
		arr[1]=234;
		arr[2]=456;
		
		int count =arr.length;
		
		System.out.println("No of arrays:"+count);
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]);
		}

	}

}
