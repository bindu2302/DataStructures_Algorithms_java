package sample;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string1: ");
		String str1 = scan.nextLine();
		System.out.println("Enter a string2: ");
		String str2 = scan.nextLine();
		
		if(rotateString(str1,str2)) {
			System.out.println("The string '" + str2 + "' is a rotation of '" + str1 + "'.");
	    } else {
	        System.out.println("The string '" + str2 + "' is NOT a rotation of '" + str1 + "'.");
	    }
		
	}
	
	public static boolean rotateString(String str1, String str2) {
		if(str1.length() == str2.length() && str1.length()>0) {
			String combined = str1 + str1;
		    return combined.contains(str2);
		}
		return false;
	}
}
