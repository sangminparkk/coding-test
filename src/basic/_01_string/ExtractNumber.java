package basic._01_string;

import java.util.Scanner;

public class ExtractNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        ExtractNumber extractNumber = new ExtractNumber();
        Integer result = extractNumber.solution(input);
        System.out.println(result);
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
