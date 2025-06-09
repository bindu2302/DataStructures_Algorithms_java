package sample;

import java.util.Scanner;

public class Extract_digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <='9') {
				result += ch;
			}
		}
		System.out.println("Extracted result: " + result);
	}

}
