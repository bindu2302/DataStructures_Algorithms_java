package com_2DArray;

import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original Matrix:");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] transpose = new int[row][col];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				transpose[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose of the Matrix:");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}

}
