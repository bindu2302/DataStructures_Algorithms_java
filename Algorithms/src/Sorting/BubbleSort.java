package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements to be stored in array: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Before Sorting: ");
		displayArray(arr);
		BubbleSort(arr);
		System.out.println("After Sorting: ");
		displayArray(arr);
	}

	public static int[] BubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<=n-2; i++) {
			for(int j=0; j<= n-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;	
	}
	
	static void displayArray(int[] arr) {
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
