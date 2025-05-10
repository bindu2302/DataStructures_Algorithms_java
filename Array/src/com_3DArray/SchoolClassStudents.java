package com_3DArray;

import java.util.*;
public class SchoolClassStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][][] arr = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		for(int i=0; i<= arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i=0; i<= arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				for(int k=0; k<=arr[i][j].length-1; k++) {
					System.out.println("school: "+ (i+1)+ " class: " + (j+1) + " student "+(k+1)+ " : " +arr[i][j][k]);
				}
			}
		}
	}

}
