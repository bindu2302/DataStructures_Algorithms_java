package sample;

import java.util.Scanner;

public class Substring_CharAt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(n1 >= 0 && n2 <= str.length() && n1<=n2) {
			System.out.println("The substring is " + str.substring(n1,n2));
		} else {
			System.out.println("Invalid indices.");
		}
		
		// charAt()
		// here i will take str and n1 values for this program
		
		if(n1>=0 && n1<=str.length()) {
			System.out.println("The character at index " + n1 + " is " + str.charAt(n1));
		} else {
			System.out.println("Invalid index");
		}
	}

}

//java programming
//5 10
//The substring is progr
//The character at index 5 is p

