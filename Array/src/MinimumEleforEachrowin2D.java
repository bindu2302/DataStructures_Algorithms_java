import java.util.Scanner;
public class MinimumEleforEachrowin2D {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the rows and cols: ");
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		
		System.out.println("Enter the elements to be inserted: ");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum =0;
		for(int i=0; i<=arr.length-1; i++) {
			int min = arr[i][0];
			for(int j=0; j<=arr[i].length-1; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			sum += min;
			System.out.println("Smallest element in row-" + (i+1) + " is: " + min);
		}
		double avg = (double)sum/ arr.length;
		System.out.println("Average of all the snallest elements is: " + avg);
	}
}
	
