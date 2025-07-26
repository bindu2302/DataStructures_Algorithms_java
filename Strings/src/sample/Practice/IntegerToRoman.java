package Practice;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // Input: an integer like 58 or 1994

        String result = intToRoman(num);
        System.out.println(result);
    }

    public static String intToRoman(int num) {
        // Arrays for Roman values and symbols
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,   4,   1};
        String[] symbols ={"M",  "CM","D", "CD", "C", "XC","L", "XL","X", "IX","V", "IV","I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);  // Append Roman symbol
                num -= values[i];          // Subtract value from number
            }
        }

        return roman.toString();
    }

}

//3
//III

//58
//LVIII


