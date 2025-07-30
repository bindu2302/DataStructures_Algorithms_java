package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumMeeting_oneRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] start = new int[n];
		for(int i=0; i<n; i++) {
			start[i] = sc.nextInt();
		}
		
		int[] end = new int[n];
		for(int i=0; i<n; i++) {
			end[i] = sc.nextInt();
		}
		
		int result = maxMeetings(start,end);
		System.out.println(result);
	}
	
	public static int maxMeetings(int[] start, int[] end) {
		int n = start.length;
		
		int[][]meetings = new int[n][2];
		for(int i=0; i<n; i++) {
			meetings[i][0] = start[i];
			meetings[i][1] = end[i];
		}
		
		Arrays.sort(meetings,(a,b) -> a[1] - b[1]);
		int count = 1;
		int lastEndTime = meetings[0][1];
		
		for(int i=1; i<n; i++) {
			if(meetings[i][0] > lastEndTime) {
				count++;
				lastEndTime = meetings[i][1];
			}
		}
		return count;
	}
}

//3
//10 12 20
//20 25 30
//1

//6
//1 3 0 5 8 5
//2 4 6 7 9 9
//4
