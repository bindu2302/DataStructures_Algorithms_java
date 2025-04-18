package Searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intersection_BinarySearch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] input1 = scanner.nextLine().split("\\s+");
		int[] nums1 = new int[input1.length];
		for(int i=0; i<nums1.length; i++) {
			nums1[i] = Integer.parseInt(input1[i]);
		}
		
		
		String[] input2 = scanner.nextLine().split("\\s+");
		int[] nums2 = new int[input2.length];
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = Integer.parseInt(input2[i]);
		}
		
		
		int[] intersection = intersect(nums1,nums2);
		System.out.println("The intersection is: " + Arrays.toString(intersection));
	}
		
		public static int[] intersect(int[] nums1, int[] nums2) {
			Set<Integer> resultSet = new HashSet<>();
			
			Arrays.sort(nums1);
			Arrays.sort(nums2);
			
			if(nums1.length > nums2.length) {
				int[] temp = nums1;
				nums1 = nums2;
				nums2 = temp;
			}
			
			for (int num: nums1) {
				if(BinarySearch(nums2,num)) {
					resultSet.add(num);
				}
			}
			
			int[] result = new int[resultSet.size()];
			int i = 0;
			for(int num: resultSet) {
				result[i++] = num;
			}
			return result;
		}
		
	
	public static boolean BinarySearch(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		while(left <= right) {
			int mid = (left + right)/2 ;
			if (nums[mid] == target) {
				return true;
			} else if(nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}
