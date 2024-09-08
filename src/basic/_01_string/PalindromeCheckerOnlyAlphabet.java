package basic._01_string;

import java.util.Scanner;

public class PalindromeCheckerOnlyAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeCheckerOnlyAlphabet palindromeChecker = new PalindromeCheckerOnlyAlphabet();
        String str = palindromeChecker.solution(input);
        System.out.println(str);
    }

    private String solution(String input) {
        input = input.replaceAll("[^a-zA-Z]", "");
        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            return "YES";
        }
        return "NO";
    }
}
