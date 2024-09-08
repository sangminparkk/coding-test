package basic._01_string;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String str = palindromeChecker.solution2(input);
        System.out.println(str);
    }

    private String solution2(String input) {
        // 문자열 관련하여, index 접근방법을 늘 염두해두면 좋을 듯 하다. (꿀팁)
        input = input.toUpperCase();
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() -1 - i)) {
                return "NO";
            }
        }
        return "YES";
    }

    private String solution(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            return "YES";
        }
        return "NO";
    }
}
