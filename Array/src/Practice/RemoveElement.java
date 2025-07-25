package Practice;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int val = sc.nextInt();
		int result = CountNonDup(arr,val);
		System.out.println(result);
	}
	
	public static int CountNonDup(int[] arr, int val) {
		int k = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}
}

//4
//3 2 2 3
//3

//2




//8
//0 1 2 2 3 0 4 2
//2

//5
