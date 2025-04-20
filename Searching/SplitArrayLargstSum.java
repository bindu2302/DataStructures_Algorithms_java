package Searching;


import java.util.Scanner;

public class SplitArrayLargstSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("\\s+");
		int[] nums = new int[input.length];
		for(int i=0; i<input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		int k = scanner.nextInt();
		
		int result = splitArray(nums,k);
		
		System.out.println("The minimized largest sum is " + result + ".");
	}
	
	
	public static int splitArray(int[] nums, int k) {
		int left = getMax(nums);
		int right = getSum(nums);
		
		while(left < right) {
			int mid = (left+right)/2;
			if(canSplit(nums,k,mid)) {
				right = mid;
			} else {
				left = mid+1;
			}
		}
		return left;
	}
	
	public static boolean canSplit(int[] nums, int k, int maxSum) {
		int count = 1;
		int currentSum = 0;
		for(int num:nums) {
			if(currentSum + num > maxSum) {
				count++;
				currentSum = num;
				if(count > k) {
					return false;
				}
			} else {
				currentSum += num;
			}
		}
		return true;
		
	}
	
	public static int getMax(int[] nums) {
		int max = nums[0];
		for(int num:nums) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public static int getSum(int[] nums) {
		int sum = 0;
		for(int num:nums) {
			sum += num;
		}
		return sum;
	}

}
