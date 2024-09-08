package basic._01_string;

import java.util.Scanner;

public class ExtractNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        ExtractNumber extractNumber = new ExtractNumber();
        Integer result = extractNumber.solution3(input);
        System.out.println(result);
    }

    private Integer solution3(String input) {
        String answer = "";
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    private Integer solution2(String input) {
        int answer = 0;
        for (char x : input.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    private Integer solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        if (input.charAt(0) == '0') {
            return Integer.parseInt(input.substring(1, input.length()));
        } else {
            return Integer.parseInt(input);
        }
    }
}
