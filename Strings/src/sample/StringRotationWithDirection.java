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
			String str1 = str.substring(str.length()-pos);
			String str2 = str.substring(0,str.length()-pos);
			System.out.println("Rotated String: " + (str1+str2));
		} else {
			String str1 = str.substring(pos);
			String str2 = str.substring(0,pos);
			System.out.println("Rotated String: " + (str1+str2));
		}
	}
}

//Enter a string: 
//HelloWorld
//Enter no.of positions: 
//3
//Enter a direction: 
//left
//Rotated String: loWorldHel

//Enter a string: 
//HelloWorld
//Enter no.of positions: 
//2
//Enter a direction: 
//right
//Rotated String: ldHelloWor

//Enter a string: 
//JavaProgramming
//Enter no.of positions: 
//5
//Enter a direction: 
//left
//Rotated String: rogrammingJavaP
