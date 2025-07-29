package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumInputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(numbers);
		int[] result = twoSum(numbers,target);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int left =0, right = numbers.length-1;
		while(left < right) {
			int sum = numbers[left] + numbers[right];
			if(sum == target) {
				return new int[] {left+1,right+1};
			} else if(sum <target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] {};
	}
}

//4
//2 7 11 15
//9
//[1, 2]


//3
//2 3 4
//6
//[1, 3]


//4
//15 7 2 11
//9
//[1, 2]
