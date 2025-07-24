package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sortedArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int[] arr1 = new int[m+n];
		int[] arr2 = new int[n];
		
		for(int i=0; i<m; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			arr2[j] = scanner.nextInt();
		}
		
		mergeSort(arr1,arr2,m,n);
		System.out.println(Arrays.toString(arr1));
	}

	private static void mergeSort(int[] arr1, int[] arr2, int m, int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j>=0) {
			if(arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				k--;
				i--;
			} else {
				arr1[k] = arr2[j];
				k--;
				j--;
			}
		}
		while(j>=0) {
			arr1[k] = arr2[j];
			k--;
			j--;
		}
	}
}

output:
3 3
1 2 3
2 5 6
[1, 2, 2, 3, 5, 6]
