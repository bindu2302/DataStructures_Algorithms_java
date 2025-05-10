package com.Enhanced_ForLoop;

import java.util.Scanner;
public class Array_EvenSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Array: [");
		int index =0;
		for(int ele: arr) {
			if(index<arr.length-1) {
				System.out.print(ele+ ", ");
			} else {
				System.out.print(ele);
			}
			index++;
		}
		System.out.println("]");
		
		
		int Evensum =0;
		for(int ele : arr) {
			if(ele % 2 ==0) {
				Evensum += ele;
			}
		}
		System.out.print("Sum of Even elements: " + Evensum);
	}

}
