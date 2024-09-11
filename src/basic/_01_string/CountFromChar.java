package basic._01_string;

import java.util.*;

public class CountFromChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        CountFromChar countFromChar = new CountFromChar();
        String result = countFromChar.solution2(inputStr);
        System.out.println(result);
    }

    private String solution2(String inputStr) {

        String answer = "";
        inputStr = inputStr + " ";
        int count = 1;
        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
                count++;
            } else {
                answer += inputStr.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }
        return answer;
    }

    private String solution(String inputStr) {
        // K K H S S S S S S S E
        // 0 1 2 3 4 5 6 7 8 9 10

        // KS TTT S EE K F KKK D JJ GG
        // K S T3 S E2 K F K3 D J2 G2
        //
        String answer = "";
        for (int i = 0; i < inputStr.length()-1; i++) {
            int count = 0;
            if (inputStr.charAt(i) != inputStr.charAt(i + 1)) {
                count = 1;
            } else {
                count++;
            }
            answer += String.valueOf(inputStr.charAt(i)) + count;
        }

        //count
        System.out.println(answer);
        return null;
    }
}
