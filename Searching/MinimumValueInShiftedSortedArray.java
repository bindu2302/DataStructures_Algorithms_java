package Searching;
import java.util.Scanner;

public class MinimumValueInShiftedSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");   //"4 5 6 7 0 1 2"
		int[] arr = new int[input.length];            // ["4", "5", "6", "7", "0", "1", "2"]
		for(int i=0; i<input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);       //[4, 5, 6, 7, 0, 1, 2]
		}
		
		int min = FindMin(arr);
		System.out.println("Minimum element is: " + min);

	}
	
	public static int FindMin(int[] arr) {
		int low =0, high = arr.length-1;
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid] > arr[high]) {
				low = mid+1;
			} else {
				high = mid;
			}
		}
		return arr[low];
	}

}
