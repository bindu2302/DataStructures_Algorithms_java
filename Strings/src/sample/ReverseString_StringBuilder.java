package sample;

import java.util.Scanner;

public class ReverseString_StringBuilder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if(input == null || input.isEmpty()) {
			System.out.println("Input is empty.");
		} else {
			StringBuilder sb =  new StringBuilder(input);
			sb.reverse().toString();
			System.out.println("The reversed string is '" + sb + "'.");
		}
	}
}

//hello
//The reversed string is 'olleh'.


//Q. If Java implicitly calls toString() when printing, then why do I need to call it explicitly?
//Ans:You only need to call .toString() if you want the reversed string as a String object for further processing.

//Purpose	Need toString()?
//Storing result as String	✅ Yes
//Returning a String from a method	✅ Yes
//Doing String operations (e.g. split, replace)