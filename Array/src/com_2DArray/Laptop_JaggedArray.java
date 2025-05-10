package com_2DArray;

import java.util.*;
public class Laptop_JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no.of rows");
		
		double arr[][] = new double[scan.nextInt()][]; // [total rows][cols in each row]
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Enter no.of cols for row: "+i);
			arr[i] = new double[scan.nextInt()];
		}
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter price for shop: " + (i+1) + " laptop: " + (j+1));
				arr[i][j] = scan.nextDouble();
			}
		}
		System.out.println("The price of laptops are: ");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]);
			}
		}
	
	}

}
