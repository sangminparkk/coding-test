package basic._01_string;

import java.util.Scanner;

public class MinDistanceFromChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        char inputChar = scanner.next().charAt(0);

        MinDistanceFromChar minDistance = new MinDistanceFromChar();
        String result = minDistance.solution(inputStr, inputChar);
        System.out.println(result);
    }

    private String solution(String inputStr, char inputChar) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputStr.length()-1; i++) {
            int min = 0;
            if (inputStr.charAt(i) == inputChar) {
                stringBuilder.append(min);
            }
            min += 1;
            if (inputStr.charAt(i + 1) == inputChar || inputStr.charAt(i - 1) == inputChar) {
                stringBuilder.append(min);
            }
            // min += 2;
            if (inputStr.charAt(i + 1) != inputChar && inputStr.charAt(i - 1) != inputChar) {
            }

            // min +=3;

        }

        return stringBuilder.toString();
    }
}
