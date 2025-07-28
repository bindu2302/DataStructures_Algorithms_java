package Practice;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = sc.nextLine();
		}
		
		String result = LongPrefix(str);
		System.out.println(result);
	}
	
	public static String LongPrefix(String[] str) {
		if(str == null || str.length == 0) return "";
		
		String prefix = str[0];
		
		for(int i=1; i<str.length; i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0,prefix.length()-1);
				
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
}

//3
//flower
//flow
//flight
//
//fl


//3
//dog
//racecar
//car
//

