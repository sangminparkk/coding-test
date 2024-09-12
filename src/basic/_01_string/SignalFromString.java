package basic._01_string;

import java.util.Scanner;

public class SignalFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String inputStr = sc.next();
        SignalFromString signalFromString = new SignalFromString();
        int MAX_SIZE = 7;

        for (int i = 0; i < number; i++) {
            int startPoint = i * MAX_SIZE;
            int endPoint = Math.min(startPoint + MAX_SIZE, inputStr.length());

            String password = inputStr.substring(startPoint, endPoint);
            System.out.print(signalFromString.solution(password));
        }
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
