package sample;

import java.util.Scanner;

public class StringbufferProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2).append(str3);
		System.out.println("The concatenated string is: '"+ sb + "'.");
	}

}



package sample;

import java.util.Scanner;

public class Stringbuffer_StringBuilder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder("Hello");
		
		builder.append("World!");
		System.out.println(builder); // HelloWorld!

		builder.insert(5,",world");  
		System.out.println(builder); // Hello,world
		
		builder.reverse();
		System.out.println(builder); //olleH


		builder.delete(0,11);
		System.out.println(builder); // delete all nothing will be printed
	}

}

