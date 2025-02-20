import java.util.Scanner;

public class LinearSearchIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = scan.nextInt();
		
        int result = SearchElement(numbers,target);
        
        if(result != -1) {
        	 System.out.println(target + " is found at index " + result + ".");
        } else {
            System.out.println(target + " is not found in the array.");
        
        }
		
	}
	
	
	public static int SearchElement(int[] numbers, int target) {
		for(int i=0; i<numbers.length; i++) {
			if(target == numbers[i]) {
				return i;
			}
		}
		return -1;
	}

}
