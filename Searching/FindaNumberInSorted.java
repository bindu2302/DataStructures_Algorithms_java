package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FindaNumberInSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] inputStr = sc.nextLine().split("\\s+");
		int[] scores = new int[inputStr.length];
		
		for(int i=0; i<inputStr.length; i++) {
			scores[i] = Integer.parseInt(inputStr[i]);
		}
		
		int target = sc.nextInt();
		
		Arrays.sort(scores);
		System.out.println("Sorted array: " + Arrays.toString(scores));
		
		int resultIndex = binarySearch(scores,target);
		if(resultIndex == -1) {
			System.out.println(target + " is not in the list.");
		} else {
			System.out.println(target + " is found at index " +  resultIndex + ".");
		}
	} 
	
	public static int binarySearch(int[] arr, int target) {
		int left =0, right = arr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] < target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return -1;
	}

}
