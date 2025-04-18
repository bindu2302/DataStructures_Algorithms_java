package Searching;

import java.util.Scanner;

public class Duplicates_Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\s+");
		int[] nums = new int[input.length];
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		findDuplicate(nums);
		
	}
	
	public static void findDuplicate(int[] nums) {
		System.out.println("Duplicates are: ");
		
		for(int i=0; i<nums.length; i++) {
			boolean isChecked= false;
			for(int k=0; k<i; k++) {
				if(nums[i] == nums[k]) {
					isChecked = true;
					break;
				}
			}
			
			if (isChecked) continue;
			
			for(int j=i+1; j <nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.println(nums[i]);
					break;
				}
			}
		}
	}

}
