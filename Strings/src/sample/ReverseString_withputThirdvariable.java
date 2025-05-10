package sample;

import java.util.Scanner;

public class ReverseString_withputThirdvariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] str = scanner.nextLine().toCharArray();
		
		 int left = 0;
		 int right = str.length-1;
		 
		 while(left<right) {
			 
			 str[left] = (char) (str[left] ^ str[right]);
			 str[right] = (char) (str[left] ^ str[right]);
			 str[left] = (char) (str[left] ^ str[right]);
			 left++;
			 right--;
		 }
		 
		System.out.println(new String(str));
		
	}

}
