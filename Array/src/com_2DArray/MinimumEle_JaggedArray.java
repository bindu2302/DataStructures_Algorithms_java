package com_2DArray;
import java.util.*;
public class MinimumEle_JaggedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] arr = new int[rows][col];
		for(int i=0; i<=arr.length-1; i++) {
			for (int j=0; j<=arr[i].length-1; j++) {
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
		
		int minSum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			int min = arr[i][0];
			for(int j=0; j<=arr[i].length-1; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			minSum += min;
			System.out.println("Minimum of row " + (i+1) + ": " + min);
		}
		System.out.println("Sum of minimum ele: " + minSum);
	}

}
