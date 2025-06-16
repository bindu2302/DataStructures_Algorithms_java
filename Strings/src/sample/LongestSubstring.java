package sample;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		int maxLength = 0;
		String longestSubstring = "";
		
		for(int i=0; i<input.length(); i++) {
			String currentStr = "";
			
			for(int j=i; j<input.length(); j++) {
				char currentChar = input.charAt(j);
				
				if(currentStr.indexOf(currentChar) == -1) {
					currentStr += currentChar;
				} else {
					break;
				}
			}
			
			if(currentStr.length() > maxLength) {
				maxLength = currentStr.length();
				longestSubstring = currentStr;
			}
		}
		
		System.out.println("The length of the longest substring without repeating: " + maxLength);
	}

}
