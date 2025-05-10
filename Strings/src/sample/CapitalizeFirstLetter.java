package sample;

import java.util.Scanner;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String input = scan.nextLine();
		
		String result = FirstCapitalWord(input);
		System.out.println(result);
	}
	
	public static String FirstCapitalWord(String str) {
		String[] words = str.split("\\s"); 
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                
                 if (firstChar >= 'a' && firstChar <= 'z') {
                    firstChar = (char) (firstChar - 32);
                }

                // Append the capitalized first letter and the rest of the word
                result += firstChar + word.substring(1) + " ";
            }
		}
		return result.trim();
		
	}
}

       

