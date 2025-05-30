package sample;

public class BasicStringOperations {

	public static void main(String[] args) {
		String str = "KodNest Tech";
		
		System.out.println(str);//KodNest Tech
		System.out.println(str.toUpperCase());//KODNEST TECH
		System.out.println(str.toLowerCase()); //kodnest tech
		System.out.println(str.charAt(3)); // N
		System.out.println(str.indexOf('e'));//4
		System.out.println(str.lastIndexOf('e')); //9
		System.out.println(str.concat("Pvt Ltd")); //KodNest TechPvt Ltd
		System.out.println(str.contains("Nest")); //true
		System.out.println(str.contains("java")); //false
		System.out.println(str.startsWith("Kod")); //true
		System.out.println(str.startsWith("java")); //false
		System.out.println(str.endsWith("Tech")); //true
		System.out.println(str.endsWith("Kod")); //false
		System.out.println(str.substring(4));// est Tech
		System.out.println(str.substring(4,8)); //est T
		System.out.println(str.isEmpty()); // false
		System.out.println(str.length());// 12
		System.out.println(str.replace("N","T")); // KodTest Tech

		// Examples
		String firstname = "Hima";
		String lastname = "Bindu";
		String combine = firstname.concat(" ").concat(lastname);
		System.out.println(combine);
		
		int length = combine.length();
		System.out.println("length: " + length);
		
		char initial1 = firstname.charAt(0);
		char initial2 = lastname.charAt(0);
		System.out.println("Initials are: " + initial1 + initial2);
		
		String sub = combine.substring(0,6);
		System.out.println("Substring(startIndex,endIndex(exclusive)): " + sub);

		String actual = "bindu123";
		String duplicate = "bindu123";
		if(actual.equals(duplicate)) { // check the values
			System.out.println("They are equals the content of 2 strings");
		} else {
			System.out.println("They are not equal");
		}
		
		
		if(actual==duplicate) {  //check memory referencecs
			System.out.println("They are referencing same object.");
		} else {
			System.out.println("They are not equal");
		}
		
		System.out.println("Uppercase: " + firstname.toUpperCase());
		System.out.println("Lowercase: " + firstname.toLowerCase());
		
		String word = "   bindu123   ";
		String trimmedWord = word.trim(); // remove leading and trailing spaces
		System.out.println("After trim(): " + trimmedWord);
	}

}
