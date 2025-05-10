import java.util.Scanner;

public class MinEle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Array: [");
		for(int i=0; i<=arr.length-1; i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
		
		int evenSum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] % 2==0) {
				evenSum += arr[i];
			}
		}
		System.out.println("Sum of even numbers: " + evenSum);
		
	}

}
