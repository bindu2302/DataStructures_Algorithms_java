package com_3DArray;

import java.util.Scanner;
public class Program1_3D_JaggaedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][][] arr = new int[scan.nextInt()][][];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = new int[scan.nextInt()][];
		}
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr.length-1; j++) {
				arr[i][j] = new int[scan.nextInt()];
			}
		}
		// Storing
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		
		}
		
		// Displaying
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}


//1D --> [col] --> arr.length
//2D --> [row][col] -->arr.length,arr[i].length
//3D -->[depth][row][col] -->arr.length,arr[i].length,arr[i][j].length


