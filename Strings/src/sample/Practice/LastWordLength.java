package Practice;

import java.util.Scanner;

public class LastWordLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim(); // Remove trailing/leading spaces

        // Split by one or more spaces using regex "\\s+"
        String[] words = s.split("\\s+");

        // Get the last word and print its length
        String lastWord = words[words.length - 1];
        System.out.println(lastWord.length());
	}

}


//Hello World
//5

//      fly me   to   the moon
//4
