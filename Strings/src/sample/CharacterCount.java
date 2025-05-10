package sample;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.next();
		
		String newStr = removeDuplicates(str);
         System.out.println(newStr);
         
         checkFrequency(str,newStr);
	}
	
	static String removeDuplicates(String str) {
		String newStr = "";
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(!(newStr.contains(String.valueOf(ch))))
			{
				newStr = newStr + ch;
			}
		}
		return newStr;
	}
	
	static void checkFrequency(String str,String newStr) {
		char[] arr = str.toCharArray();
		char[] newArr = newStr.toCharArray();
		
		for(int i=0; i<=newArr.length-1; i++) {
			int count =0;
			for(int j=0; j<=arr.length-1; j++) {
				if(newArr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println("Frequency of " + arr[i] + " is: " + count);
		}
	}
}
