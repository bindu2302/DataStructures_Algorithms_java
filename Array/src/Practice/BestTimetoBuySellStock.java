package Practice;

import java.util.Scanner;

public class BestTimetoBuySellStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = maxProfit(arr);
		System.out.println(result);
	}
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			} else {
				maxProfit = Math.max(maxProfit, price - minPrice);
			}
		}
		return maxProfit;
	}
}

//6
//7 1 5 3 6 4

//5


//5
//7 6 4 3 1

//0

