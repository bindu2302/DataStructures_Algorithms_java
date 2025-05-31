package sample;

import java.util.Scanner;

public class CharacterOccurences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char ch = scanner.next().charAt(0);
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println("Original String: " + str);
		System.out.println("Character: " + ch);
		System.out.println("Occurrences: " + count);
	}

}
