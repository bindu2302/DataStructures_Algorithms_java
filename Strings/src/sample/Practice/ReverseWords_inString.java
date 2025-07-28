package Practice;

import java.util.Scanner;

public class ReverseWords_inString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		String[] words = s.split("\\s+");
		String result = reverseWords(words);
		System.out.println(result);
	}
	
	public static String reverseWords(String[] words) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length-1; i>=0; i--) {
			sb.append(words[i]);
			if(i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}

//the sky is blue
//blue is sky the


//hello   world
//world hello
