package sample;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements to store in array.");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to be searched.");
		int key = scan.nextInt();
		
		Arrays.sort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		
		int result = binarySearch(arr,key);
		if(result != -1) {
			 System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
		}
		scan.close();
    }

    // Binary Search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        
		while(low <= high) {
			int mid = (low+ high)/2;
			
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				low = mid+1;
				high = high;
			} else {
				low = low;
				high = mid-1;
			}
		}
		return -1;
	}

}
