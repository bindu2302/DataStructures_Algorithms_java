package sample;

public class Program2 {

	public static void main(String[] args) {
		String str1 = "Java"; // Constant pool
		String str2 = "FullStack"; // Constant pool
		
      	// if string is created by concatenating the references, then
		// memory of string will be created in heap memory
		String str3 = str1 + str2;  //Heap
		
		String str4 = "Java" + "FullStack";  // Constant pool
		String str5 = "JavaFullStack";// Constant pool
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
		System.out.println("str5: " + str5);
		
		if(str3 == str5) {
			System.out.println("Both are in constant pool.");
		} else {
			System.out.println("str3 is in heap and str5 is in constant pool");
		}

		if(str4 == str5) {
			System.out.println("Both are in constant pool.");
		} else {
			System.out.println("str4 is in heap and str5 is in constant pool");
		}

	}

}
