package com_3DArray;

import java.util.Scanner;

public class AverageofeachElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int depth = scanner.nextInt();
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][][] arr = new int[depth][row][col];
		
		for(int i=0; i<depth; i++) {
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					arr[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		System.out.println("3D Array:");
		for(int i=0; i<depth; i++) {
			System.out.println("Layer " + (i+1) + ": ");
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
		for(int j=0; j<row; j++) {
			for(int k=0; k<col; k++) {
				int sum = 0;
				for(int i=0; i<depth; i++) {
					sum += arr[i][j][k];
				}
				double avg = (double)sum/depth;
				System.out.println("Average of column (" + j + "," + k + "): " + avg);
			}
		}
	}

}
