package sample;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = scan.next();
		
		char[] arr = str.toCharArray();
		
		int length = arr.length;
		System.out.println("Length of the string: " + length);	

//		
//		int count = 0;
//		for(char c: arr) {
//			count++;
//		}
//		System.out.println("Length of the string: " + count);	
	}

}
