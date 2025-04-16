package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Before Sorting: ");
		displayArray(arr);
		SelectionSort(arr);
		System.out.println("After Sorting: ");
		displayArray(arr);

	}
	
	public static void displayArray(int[] arr) {
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
	public static int[] SelectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<=n-2; i++) {
			int pos = i;
			int min=arr[pos];
			for(int j=i+1; j<=n-1; j++) 
			{
				//replace
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			//swap
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] =  temp;
			
		}
		return arr;
	}

}
