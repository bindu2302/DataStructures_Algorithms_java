package com_3DArray;

import java.util.Scanner;

public class Sum_elements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int depth = scanner.nextInt();
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][][] arr = new int[depth][row][col];
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					arr[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		System.out.println("3D Array:");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Layer " + (i+1) + ": ");
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			int sum = 0;
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					sum += arr[i][j][k];
				}
			}
			System.out.println("Sum of laryer " + (i+1) + ": " + sum);
		}
	}
}
