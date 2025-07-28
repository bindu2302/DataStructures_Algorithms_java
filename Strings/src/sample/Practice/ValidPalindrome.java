package Practice;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean result = isPalindrome(s);
		System.out.println(result);
	}
	
	public static boolean isPalindrome(String s) {
		String lowerStr = s.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		for(char c : lowerStr.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
		}
		String originalStr = sb.toString();
		String reversedStr = sb.reverse().toString();
		return originalStr.equals(reversedStr);
	}
}

//A man, a plan, a canal: Panama
//true

//race a car
//false
