package Practice;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(majorEle(arr));
	}
	
	public static int majorEle(int[] arr) {
		if(arr.length == 0) return arr[0];
		
		int count =0, candidate =0;
		for(int num: arr) {
			if(count == 0) {
				candidate = num;
			}
			
			if(num == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}

}
