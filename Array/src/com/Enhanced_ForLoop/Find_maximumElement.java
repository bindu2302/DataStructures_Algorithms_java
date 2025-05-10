package com.Enhanced_ForLoop;

import java.util.Scanner;
public class Find_maximumElement {

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
		
		int max = arr[0];
		for(int ele : arr) {
			if(ele> max) {
				max = ele;
			}
		}
		System.out.print("Maximum value: " + max);
	}

}
