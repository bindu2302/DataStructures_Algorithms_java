package sample;

import java.util.Scanner;

public class StringRotationWithDirection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scan.next();
		System.out.println("Enter no.of positions: ");
		int pos = scan.nextInt();
		System.out.println("Enter a direction: ");
		String direction = scan.next().toLowerCase();
		
		if(direction.equals("right")) {
			String s1 = str.substring(str.length()-pos);
			String s2 = str.substring(0,str.length()-pos);
			System.out.println(s1+s2);
			
		} else {
			String s1 = str.substring(pos);
			String s2 = str.substring(0,pos);
			System.out.println(s1+s2);
		}	
	}
}
