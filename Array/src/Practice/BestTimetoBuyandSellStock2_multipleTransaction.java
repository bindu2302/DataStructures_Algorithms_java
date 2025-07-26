package Practice;

import java.util.Scanner;

public class BestTimetoBuyandSellStock2_multipleTransaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		
		for(int i=0; i<n; i++) {
			prices[i] = sc.nextInt();
		}
		
		int result = maxProfit(prices);
		System.out.println(result);
	}
	
	public static int maxProfit(int[] prices) {
		int profit = 0;
		
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				profit += prices[i] - prices[i-1];
			}
		}
		return profit;
	}
}


//6
//7 1 5 3 6 4

//7


//5
//1 2 3 4 5

//4
