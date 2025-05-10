import java.util.Scanner;
public class Fibonacci_inArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int maxNumber = scanner.nextInt(); 
        
        int [] arr = new int[maxNumber];
        fibArray(arr);
        }
	
	static void fibArray(int[] arr) {
		int fib1 =0, fib2 =1;
		int fib3;
		arr[0] = fib1;
		arr[1] = fib2;
		
		for(int i =2; i<=arr.length-1; i++) {
			fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
			arr[i] = fib3;
		}
		System.out.println("The array elements are: ");
		for(int x : arr) {
			System.out.print(x+ " ");
		}
    }	

}
