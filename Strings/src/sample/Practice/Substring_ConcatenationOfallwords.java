package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Substring_ConcatenationOfallwords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        List<Integer> result = findSubstring(s, words);
        System.out.println(result);
    }
	
	public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seen = new HashMap<>();
            for (int j = 0; j < words.length; j++) {
                int wordIndex = i + j * wordLen;
                String word = s.substring(wordIndex, wordIndex + wordLen);

                if (!wordCount.containsKey(word)) {
                    break;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if (seen.get(word) > wordCount.get(word)) {
                    break;
                }
            }

            if (seen.equals(wordCount)) {
                result.add(i);
            }
        }

        return result;
    }
}

//barfoothefoobarman
//2
//foo bar
//[0, 9]

//wordgoodgoodgoodbestword
//3
//word good best
//[12]
