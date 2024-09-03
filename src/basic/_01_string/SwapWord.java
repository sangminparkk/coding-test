package basic._01_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapWord swapWord = new SwapWord();
        int number = sc.nextInt();

        List<String> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            result.add(swapWord.solution(new StringBuilder(sc.next())));
        }

        result.forEach(System.out::println);
    }

    private String solution(StringBuilder word) {
        return word.reverse().toString();
    }
}
