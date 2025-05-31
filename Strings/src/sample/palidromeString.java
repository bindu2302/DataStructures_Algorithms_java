package sample;

import java.util.Scanner;

public class palidromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
//		// One method using Stringbuilder
//		String str = scan.nextLine();
//		
//		String reversed = new StringBuilder(str).reverse().toString();
//		
//		if(str.equals(reversed)) {
//			System.out.println("The string is palindrome");
//		} else {
//			System.out.println("The string is not palindrome");
//		}


		// Without using built-in function
		String str = scan.nextLine();
		char[] charArr = str.toCharArray();
		char[] revArr = new char[charArr.length];
		
		int j = revArr.length-1;
		for(int i=0; i<=charArr.length-1; i++) {
			revArr[i] = charArr[j];
			j--;
		}
		
		String revStr = new String(revArr);
		
		if(str.equals(revStr)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}
}
