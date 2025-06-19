package sample;

import java.util.Scanner;

public class ReverseString_withoutThirdvariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		String reverse = reverse_without3rdVar(str);
		System.out.println(reverse);
	}
	
	public static String reverse_without3rdVar(String str) {
		char[] ch = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			ch[left] = (char) (ch[left] ^ ch[right]);
			ch[right] = (char) (ch[left] ^ ch[right]);
			ch[left] = (char) (ch[left] ^ ch[right]);
			
			left++;
			right--;
		}
		return new String(ch);
	}
}

//world
//dlrow
