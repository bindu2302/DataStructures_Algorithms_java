package Sorting;

import java.util.Scanner;

public class BubbleSort_Strings {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String input = scanner.nextLine();
		char[] charinput = input.toCharArray();
		
		bubbleSort(charinput);
		
		String str = new String(charinput);
		System.out.println(str);
	}
	
	
	public static void bubbleSort(char[] arr) {
		int n = arr.length;
		boolean swapped = false;
		for(int i=0; i<=n-2; i++) {
			for(int j=0; j<=n-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}

}
