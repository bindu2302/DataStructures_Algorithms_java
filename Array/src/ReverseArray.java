import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = scanner.nextInt();
		}
		 int[] revArr = new int[arr.length];
		 int j = revArr.length-1;
		 for(int i=0; i<=arr.length-1; i++) {
			 revArr[j] = arr[i];
			 j--;
		 }
		 
		 System.out.print("original array: [");
		 for(int i=0; i<=arr.length-1; i++) {
			 if(i<arr.length-1) {
				 System.out.print(arr[i] + ", ");
			 } else {
				System.out.print(arr[i]); 
			 }
		 }
		 System.out.println("]");
		 
		 
		 System.out.print("Reversed array: [");
		 for(int i=0; i<=arr.length-1; i++) {
			 if(i<arr.length-1) {
				 System.out.print(revArr[i] + ", ");
			 } else {
				System.out.print(revArr[i]); 
			 }
		 }
		 System.out.println("]");
		
	}

}
