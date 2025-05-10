package sample;

import java.util.Scanner;

public class Strings_ConvertLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = scan.next();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]>='A' && arr[i]<='Z') {  //  ----> for lower  // if(arr[i]>='a' && arr[i]<='z');  ----> for uppercase
				arr[i] = (char)(arr[i]+32);                        // arr[i] = (char)(arr[i]-32);
			}
		}
		
		String newStr = new String(arr);
		System.out.println("The new String is: " + newStr);
	}
}































//package sample;
//
//import java.util.Scanner;
//
//public class Strings_ConvertLower {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a string: ");
//		String str = scan.nextLine();
//		
//		if(str.equals(str.toUpperCase())) {
//			str = toconvertLower(str);
//		}
//		 System.out.println("Output: " + str);
//		
//	}
//	
//	// A = 65 a =97 
//	public static String toconvertLower(String str) {
//		String result = "";
//		for(int c: str.toCharArray()) {
//			if(c>='A' && c<='Z') {
//				result += (char) (c+32);
//			} else {
//				result += c;
//			}
//		}
//		return result;
//	}
//}
