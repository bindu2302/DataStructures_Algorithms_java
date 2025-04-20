package Searching;

import java.util.Scanner;

public class IntegerPair_LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		boolean found = false;
		
		for(int i=0; i<n; i++) {
			if((arr[i][0] == a && arr[i][1] == b) || (arr[i][0] == b && arr[i][1] == a)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
