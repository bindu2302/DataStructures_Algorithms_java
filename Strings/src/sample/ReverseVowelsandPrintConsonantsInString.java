package sample;

import java.util.Scanner;

public class ReverseVowelsandPrintConsonantsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		
		String vowelStr = reverseVowels(str);
        String consonantStr = findConsonants(str);
        
        System.out.println("Reversed Vowels: " + vowelStr);
        System.out.println("Consonants: " + consonantStr );
        
        checkPalindrome(vowelStr);
        checkPalindrome(consonantStr);

	}
	
	private static String reverseVowels(String str) {
        String newStr = "";
        for(int i=0; i<=str.length()-1; i++) {
        	char ch = str.charAt(i);
        	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		newStr = ch + newStr; //reverse
        	}
        }
        return newStr;
	}
	
	
	public static String  findConsonants(String str) {
		String newStr = "";
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				newStr = newStr + ch;
			}
		}
		return newStr;
	}
	
	
	public static void checkPalindrome(String str) {
		String reversedStr = reverseString(str);
		if (str.equals(reversedStr)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

	private static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
	}

}
