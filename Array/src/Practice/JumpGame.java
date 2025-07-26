package Practice;

import java.util.Scanner;

public class JumpGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		boolean result = canJump(nums);
		System.out.println(result);
	}
	
	public static boolean canJump(int[] nums) {
		int farthest = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(i > farthest) {
				return false;
			}
			farthest = Math.max(farthest, i + nums[i]);	
		}
		return true;
	}
}

//5
//3 2 1 0 4
//false

//5
//2 3 1 1 4
//true
