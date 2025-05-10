import java.util.Scanner;
public class PrimeNumbers_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();
		System.out.println("Enter the Array elements");
		int[]arr = new int[n];
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		printPrime(arr);
	}
		public static void printPrime(int[] arr) {
			System.out.print("The prime numbers are: ");
			for(int i=0; i<=arr.length-1; i++) {
				int count =0;
				for(int j=1; j<=arr[i]; j++) {
					if(arr[i] % j ==0) {
						count ++;
					}
				}
				if(count ==2) {
					System.out.print(arr[i] + " ");
				}
			}
		}
}
	
