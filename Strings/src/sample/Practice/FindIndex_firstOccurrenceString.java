package Practice;

import java.util.Scanner;

public class FindIndex_firstOccurrenceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String haystack = sc.nextLine();
		String needle = sc.nextLine();
		
		int result = strStr(haystack,needle);
		System.out.println(result);
	}
	
	public static int strStr(String haystack, String needle) {
		
		int n = haystack.length();
		int m = needle.length();
		
		if(m==0) return 0;
		
		for(int i=0; i<=n-m; i++) {
			int j =0;
			
			while(j<m && haystack.charAt(i+j) == needle.charAt(j)) {
				j++;
			}
			
			if(j == m) {
				return i;
			}
		}
		return -1;
	}
}

//sadbutsad
//sad
//0

//leetcode
//leeto
//-1
