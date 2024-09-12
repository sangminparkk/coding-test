package basic._01_string;

import java.util.Scanner;

public class SignalFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String inputStr = sc.next();
        SignalFromString signalFromString = new SignalFromString();
        System.out.print(signalFromString.solution2(number, inputStr));
    }

    private String solution2(int number, String password) {
        String answer = "";
        // #, * > replace
        for (int i = 0; i < number; i++) {
            String word = password.substring(0, 7).replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(word, 2);
            password = password.substring(7);
        }

        return answer;
    }

    private Character solution(String str) {
        String binary = "";
        for (char c : str.toCharArray()) {
            binary += c == '#' ? 1 : 0;
        }
        int decimal = Integer.parseInt(binary,2);
        return (char) decimal;
    }
}
