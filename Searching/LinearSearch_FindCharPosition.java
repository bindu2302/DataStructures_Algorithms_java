package Searching;

import java.util.Scanner;

public class LinearSearch_FindCharPosition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char searchChar = scanner.next().charAt(0);
		
		int position = findpos(str,searchChar);
		
		if(position!=1) {
			System.out.println(position);
		} else {
			System.out.println("-1");
		}
	}
	
	public static int findpos(String str, char searchChar) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == searchChar) {
				return i;
			}
		}
		return -1;
	}

}
