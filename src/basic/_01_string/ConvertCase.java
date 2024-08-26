package basic._01_string;

import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {

        ConvertCase convertCase = new ConvertCase();

        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();

        String result = convertCase.solution1(str);
        System.out.println(result);

    }

    private String solution1(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }
}
