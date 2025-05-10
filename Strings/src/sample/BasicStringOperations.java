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
		
		
	}

}
