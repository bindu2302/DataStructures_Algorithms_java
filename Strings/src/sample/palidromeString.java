package sample;

import java.util.Scanner;

public class palidromeString {

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
		
		if(str.equals(revStr)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}
}
