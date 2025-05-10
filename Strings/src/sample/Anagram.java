package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string1: ");
		String str1 = scan.next();
		
		System.out.println("Enter a string2: ");
		String str2 = scan.next();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String newstr1 = new String(arr1);
		String newstr2 = new String(arr2);
		
		if(newstr1.equals(newstr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}	
	}

}


// without built-in method
//package sample;
//
//import java.util.Arrays;
//import java.util.Scanner;

//public class Anagram {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a string1: ");
//		String str1 = scan.next();
//		
//		System.out.println("Enter a string2: ");
//		String str2 = scan.next();
//		
//		
//		if
//		char[] arr1 = str1.toCharArray(); // build in method no problem
//		char[] arr2 = str2.toCharArray();
//
//		
//		
//			
//	}
//
//}

