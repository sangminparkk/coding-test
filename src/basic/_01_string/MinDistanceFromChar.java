package basic._01_string;

import java.util.Scanner;

public class MinDistanceFromChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        char inputChar = scanner.next().charAt(0);

        MinDistanceFromChar minDistance = new MinDistanceFromChar();
        for (int x : minDistance.solution2(inputStr, inputChar)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution2(String inputStr, char inputChar) {
        int[] answer = new int[inputStr.length()];
        int p = 1000;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == inputChar) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = inputStr.length()-1; i >=0; i--) {
            if (inputStr.charAt(i) == inputChar) {
                p = 0;
            } else {
                p++;
                //비교
                answer[i] = Math.min(answer[i], p); // Math 함수 사용 (if 처리 X)
            }
        }

        return answer;
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
