package com_2DArray;

import java.util.Scanner;
public class Employees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no.of companies: ");
		int companies = scan.nextInt();
		
		System.out.println("Enter the no.of  employees: ");
		int employees = scan.nextInt();
		
		System.out.println("Enter the first names: ");
		String[][] firstnames = new String[companies][employees];
		
		for(int i=0; i<= firstnames.length-1; i++) {
			for(int j=0; j<=firstnames[i].length-1; j++) {
				firstnames[i][j] = scan.next();
			}
		}
		
		
		for(int i=0; i<=firstnames.length-1; i++) {
			for(int j=0; j<=firstnames[i].length-1; j++) {
				System.out.println(firstnames[i][j] + " ");
			}
			System.out.println();
		}
	}

}
