package com_2DArray;

import java.util.*;

public class SumofEachMarks_jaggedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no.of rows: ");
		int arr[][] = new int[scan.nextInt()][];
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter the no of cols for row: " + i);
			arr[i] = new int[scan.nextInt()];
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.println("Enter marks for class: " + (i+1) +" student: "+(j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			int sum =0;
			for(int j=0;j<=arr[i].length-1;j++) {
				sum  = sum + arr[i][j];
			}
			System.out.println("Sum of marks of class: "+(i+1)+" : "+sum);

		}
	}
}
