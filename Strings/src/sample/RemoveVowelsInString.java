package sample;

import java.util.Scanner;

public class RemoveVowelsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String vowels = "aeiouAEIOU";
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(vowels.indexOf(ch)==-1) {
				result.append(ch);
			}
		}
		System.out.println(result.toString());
	}

}
