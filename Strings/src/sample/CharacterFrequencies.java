package sample;

import java.util.Scanner;

public class CharacterFrequencies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] ch = str.toCharArray();
		
		System.out.println("Character Frequencies:");
		
		for(int i=0; i<ch.length; i++) {
			char currentChar = ch[i];
			int count = 1;
			for(int j=0; j<i; j++) {
				if(ch[j] == currentChar) {
					count = 0;
					break;
				}
			}
			if(count == 1) {
				for(int j = i+1; j<ch.length; j++) {
					if(ch[j]== currentChar) {
						count++;
					}
				}
				System.out.println(currentChar + ": " + count);
			}
		}
	}

}
