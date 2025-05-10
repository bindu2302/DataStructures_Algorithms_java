package sample;

import java.util.Scanner;

public class FindAsciiValueofString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		int result = (int)ch;
		System.out.println("The ascii value of '" + ch + "' is: " + result);
		
	}

}
