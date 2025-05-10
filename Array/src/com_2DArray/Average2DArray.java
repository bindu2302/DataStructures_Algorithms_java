package com_2DArray;

import java.util.Scanner;

public class Average2DArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int col = scanner.nextInt();
		
		int[][] arr = new int[rows][col];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Array: ");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			int sum = 0;
			for(int j=0; j<=arr[i].length-1; j++) {
				sum = sum + arr[i][j];
			}
			double avg = (double)sum / col;
			System.out.println("Average of row: " + (i+1) + ": " + avg);
		}
		
	}

}
