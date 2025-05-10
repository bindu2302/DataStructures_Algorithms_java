package sample;

import java.util.Scanner;

public class TripleStringTransformation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        // Transform words manually
        String transformedWord1 = replaceVowels(word1);
        String transformedWord2 = replaceConsonants(word2);
        String transformedWord3 = toUpperCase(word3);
        
        System.out.println(transformedWord1 + transformedWord2 + transformedWord3);

	}
	
	
    // Replace vowels in a word with '%'
    public static String replaceVowels(String word) {
    	String result = "";
    	for(int i=0; i<word.length(); i++) {
    		char ch = word.charAt(i);
    		if(isVowel(ch)) {
    			result += "%";
    		} else {
    			result += ch;
    		}
    	}
    	return result;
    }
    
    // Replace consonants in a word with '#'
    public static String replaceConsonants(String word) {
    	String result = "";
    	
    	for(int i=0; i<word.length(); i++) {
    		char ch = word.charAt(i);
    		if(!isVowel(ch)) {
    			result += "#";
    		} else {
    			result += ch;
    		}
    	}
    	return result;		
    }
    
    // Convert a word to uppercase manually
    public static String toUpperCase(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z') {
            	result += (char)(ch-32);
            } else {
            	result += ch;
            }
        }
        return result;
    }
    
    public static boolean isVowel(char ch) {
        char lowerCh = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch; // Convert to lowercase
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
    
}
