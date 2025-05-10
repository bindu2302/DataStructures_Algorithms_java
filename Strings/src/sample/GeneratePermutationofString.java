package sample;

import java.util.Scanner;

public class GeneratePermutationofString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		generatePermutation(str,"");
		
	}
	
	public static void generatePermutation(String str, String perm) {
		if(str.isEmpty()) {
			System.out.println(perm);
			return;
		}
		
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			String remaining = str.substring(0,i) + str.substring(i+1);
			generatePermutation(remaining,perm+ch);
		}
	}
}
