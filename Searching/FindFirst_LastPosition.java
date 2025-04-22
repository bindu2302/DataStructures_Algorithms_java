package Searching;

import java.util.Scanner;

public class FindFirst_LastPosition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split("\\s+");
		int[] arr = new int[input.length];
		for(int i=0; i<input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int target = scanner.nextInt();
		
		int first = findFirst(arr,target);
		int last = findLast(arr,target);
		
		System.out.println("[" + first + ", " + last + "]");
	}
	
	
	public static int findFirst(int[] arr, int target) {
		int left = 0, right = arr.length-1, first = -1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				first = mid;
				right = mid -1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return first;
	}
	
	public static int findLast(int[] arr, int target) {
		int left = 0, right = arr.length, last = -1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				last = mid;
				left = mid+1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return last;
	}

}
