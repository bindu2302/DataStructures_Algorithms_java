package com_2DArray;

import java.util.Scanner;
public class Student_marks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no.of classrooms");
		int classroom = scan.nextInt();
		
		System.out.println("Enter no.of Students for each class");
		int students = scan.nextInt();
		
		int[][] markArr = new int[classroom][students];
		
		for(int i=0; i<=markArr.length-1; i++) { // loop for rows
			for(int j=0; j<=markArr[i].length-1; j++) { // loop for cols in each row
				System.out.println("Enter the marks for class " + (i+1) + " student " + (j+1));
				markArr[i][j] = scan.nextInt();
			}
		}
		
		
		for(int i=0; i<=markArr.length-1; i++) {  // loop for rows
			
			for(int j=0; j<=markArr[i].length-1; j++) {  // loop for cols in each row
				
				System.out.print(markArr[i][j]+" ");
			}
			System.out.println();
		}	

	}

}
