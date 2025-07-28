package Practice;

import java.util.Scanner;

public class IsSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		boolean result = isSubsequence(s,t);
		System.out.println(result);
	}
	
	public static boolean isSubsequence(String s, String t) {
		int i=0, j=0;
		
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return (i==s.length());
	}
}

//abc
//ahbgdc
//true

//axc
//ahbgdc
//false


