package Searching;

import java.util.Scanner;

public class FindLongestInterval {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int rating = longestInterval(arr);
		System.out.println(rating);
	}

	
	public static int longestInterval(int[] arr) {
		int maxLength = 0;
		int currentLength = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 6) {
				currentLength++;
			} else {
				maxLength= findMax(maxLength, currentLength);
				currentLength = 0;
			}
		}
		maxLength = findMax(maxLength, currentLength);
		return maxLength;
	}
	
	public static int findMax(int a, int b) {
		return (a > b) ? a : b;
	}
}
