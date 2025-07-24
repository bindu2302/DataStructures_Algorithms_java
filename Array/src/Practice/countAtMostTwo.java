package Practice;

import java.util.Scanner;

public class countAtMostTwo {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Process and print result
        int result = countAtMostTwo(arr);
        System.out.println(result);
    }
	
	 public static int countAtMostTwo(int[] arr) {
	        if (arr.length == 0) return 0;

	        int index = 0;

	        for (int num : arr) {
	            if (index < 2 || num != arr[index - 2]) {
	                arr[index++] = num;
	            }
	        }

	        return index;
	    }
}

//9
//0 0 1 1 1 1 2 3 3
//7
