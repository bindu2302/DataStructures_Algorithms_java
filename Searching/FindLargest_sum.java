package Searching;
import java.util.Scanner;

public class FindLargest_sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = scan.nextInt();
		System.out.println("Enter the element in array: ");
		int[] arr = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = scan.nextInt();
		}
		int largestNum = findLargestNum(arr);
		int sum = findSum(arr);
		System.out.println("Largest number: " + largestNum);
		System.out.println("Sum: " + sum);	
	}
	
	
	public static int findLargestNum(int[] arr) {
		int max = arr[0];
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static int findSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
