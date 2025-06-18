//package sample;
//
//import java.util.Scanner;
//
//public class RegexPatternValidation {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String pattern = sc.nextLine();
//		
//		boolean isValid = true;
//		
//		if(pattern.isEmpty() || pattern.charAt(0) == '*') {
//			isValid = false;
//		}
//		
//		int openbrace = 0;
//		for(char c: pattern.toCharArray()) {
//			if(c=='[') {
//				openbrace++;
//			} else if (c==']') {
//				openbrace--;
//			}
//			if(openbrace < 0) {
//				isValid = false;
//				break;
//			}
//		}
//		
//		if(openbrace != 0) {
//			isValid = false;
//		}
//		
//		if(isValid) {
//			System.out.println("The pattern '" + pattern + "' is valid.");
//		} else {
//			System.out.println("The pattern '" + pattern + "' is not valid.");
//		}
//	}
//
//}


package sample;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		
		try {
			Pattern.compile(pattern);
			System.out.println("The pattern '" + pattern + "' is valid.");
		} catch(PatternSyntaxException e) {
			System.out.println("The pattern '" + pattern + "' is not valid.");
		}
	}
}

