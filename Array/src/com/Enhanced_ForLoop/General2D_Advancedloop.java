package com.Enhanced_ForLoop;

import java.util.*;
public class General2D_Advancedloop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int[] x: arr) {
			for(int y : x) {
				System.out.println(y);
			}
		}
	}

}
