package basic._01_string;

import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {

        ConvertCase convertCase = new ConvertCase();

        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();

        String result = convertCase.solution2(str);
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

    private String solution2(String str) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                result += (char) (c + 32); // 형 변환 처리
            } else {
                result += (char) (c - 32);
            }
        }
        return result;
    }
}
