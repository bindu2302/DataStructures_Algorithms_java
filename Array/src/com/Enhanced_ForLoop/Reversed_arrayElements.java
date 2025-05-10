package com.Enhanced_ForLoop;

import java.util.Scanner;
public class Reversed_arrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scan.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Original Array: [");
		int index = 0;
		for(int element : arr) {
			if(index<arr.length-1) {
				System.out.print(element + ", ");
			} else {
				System.out.print(element);
			}
			index++;
		}
		System.out.println("]");
		
		// Reverse Array
		int[] revArr = new int[arr.length];
		int j = revArr.length-1;
		for(int element : arr) {
			revArr[j] = element;
			j--;
		}
		
		System.out.print("Reversed Array: [");
		index =0;
		for(int element : revArr) {
			if(index < revArr.length-1) {
				System.out.print(element+ ", ");
			} else {
				System.out.print(element);
			}
			index++;
			
		}
		System.out.println("]");
		
	}

}
