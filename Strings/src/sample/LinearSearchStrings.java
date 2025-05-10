package sample;

import java.util.Scanner;

public class LinearSearchStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] students = scan.nextLine().split("\\s+");
		String targetName = scan.nextLine();
		
		String result = searchStudents(students,targetName);
		System.out.println(result);
	}
	
	public static String searchStudents(String[] students, String targetName) {
		for(int i=0; i<students.length; i++) {
			if(targetName.equals(students[i])) {
				return students[i] + " is found at index at " + (i+1) + ".";
			}
		}
		return targetName + " is not found.";
	}

}
