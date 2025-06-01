//package sample;
//
//import java.util.Scanner;
//
//public class Split_join {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		String delimiter = scanner.next();
//		
//		String[] words = str.split(" ");
//		
//		for(String word: words) {
//			System.out.println(word);
//		}
//		
//		String joined = str.join(delimiter, words);
//		System.out.println("Joined sentence: " + joined);
//	}
//
//}


// startsWith,endsWith,isEmpty,regex

//package sample;
//
//import java.util.Scanner;
//
//public class Split_join_startsWith_endsWith_string_format {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		
//		System.out.println("Does the string start with \"Hello\"?" + str.startsWith("Hello"));
//		System.out.println("Does the string end with \"World!\"?" + str.endsWith("World!"));
//		System.out.println("Is the string empty? " + str.isEmpty());
//		
//		String reg = "[a-zA-Z]";
//		System.out.println("Does the string contain only letters? " + str.matches(reg));
//
//	}
//}


package sample;

import java.util.Scanner;

public class Split_join_startsWith_endsWith_string_format {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		
		String output = String.format("Hello, my name is %s, and I am %d years old.", name,age);
		System.out.println(output);
	}
}

