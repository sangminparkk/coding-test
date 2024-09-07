package basic._01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDuplicated {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        DeleteDuplicated deleteDuplicated = new DeleteDuplicated();
        String result = deleteDuplicated.solution2(input);
        System.out.println(result);

    }

    private String solution2(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private String solution(String input) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : list) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
