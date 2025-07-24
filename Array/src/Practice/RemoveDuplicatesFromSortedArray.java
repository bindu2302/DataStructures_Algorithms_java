package Practice;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(countUnique(arr,n));
	}
	
	public static int countUnique(int[] arr, int n) {
		int count = 1;
		for(int i=1; i<n; i++) {
			if(arr[i] != arr[i-1]) {
				count++;
			}
		}
		return count;
	}
}

//10
//0 0 1 1 1 2 2 3 3 4
//5

