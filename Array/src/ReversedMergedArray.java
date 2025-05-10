import java.util.Scanner;
public class ReversedMergedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//creating 1st array
		int[] arr1 = new int[scan.nextInt()];
		// creating 2nd array
		int[] arr2 = new int[scan.nextInt()];
		
		
		// store elements in 1st array
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i] = scan.nextInt();
		}
		
		// store elements in 2nd array
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i] = scan.nextInt();
		}
		
		//creating 3rd array -->size-->arr1.length + arr2.length
		int[] arr3 = new int[arr1.length + arr2.length];
		
		// reversing 
		int j = arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i] = arr1[j];
			j--;
		}
		
		 j = arr2.length-1;
		for(int i=arr1.length; i<=arr3.length-1;i++) {
			arr3[i] = arr2[j];
			j--;
		}
		
		
		//print arr3
		System.out.println("Merged Array: [");
		for(int i=0; i<=arr3.length-1; i++) {
			if(i<arr3.length-1) {
				System.out.print(arr3[i] +", ");
			} else {
				System.out.print(arr3[i]);
			}
		}
		
		System.out.print("]");
       
	}

}
