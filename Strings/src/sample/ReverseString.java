package sample;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = scan.next();
		char[] arr = str.toCharArray();
		char[] revArr = new char[arr.length];
		
		int j = revArr.length-1;
		for(int i=0; i<=arr.length-1; i++) {
			revArr[i] = arr[j];
			j--;
		}
		String revStr = new String(revArr);
		System.out.println("The reversed string is: " + revStr);
			
//		String reverse = "";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			reverse = reverse + str.charAt(i);
//		}
//		
//		System.out.println("Reverse of a string: " + reverse);
	}

}
