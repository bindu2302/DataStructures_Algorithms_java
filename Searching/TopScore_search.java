package Searching;

import java.util.Scanner;

public class TopScore_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] scores = new int[n];
		
		String inputLine = sc.nextLine();
		String[] inputStrings = inputLine.trim().split("\\s+");
		
		for(int i=0; i<n; i++) {
			scores[i] = Integer.parseInt(inputStrings[i]);
		}
		
		int maxScore = findScore(scores);
		System.out.println("The max score is: " + maxScore);
		
	}
	
	public static int findScore(int[] scores) {
		int max = scores[0];
		for(int i=1; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		return max;
	}

}
