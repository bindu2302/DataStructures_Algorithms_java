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
