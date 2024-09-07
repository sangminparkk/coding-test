package basic._01_string;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String str = palindromeChecker.solution(input);
        System.out.println(str);
    }

    private String solution(String input) {
        input = input.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(input).reverse().toString();

        if (input.equals(reversed)) {
            return "YES";
        }
        return "NO";
    }
}
