package basic._01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapWord {

    public static void main(String[] args) {
        SwapWord swapWord = new SwapWord();

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String[] array = new String[number];

        for (int i = 0; i < number; i++) {
            array[i] = sc.next();
        }

        for (String s : swapWord.solution(number, array)) {
            System.out.println(s);
        }

    }

    private ArrayList<String> solution(int number, String[] array) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : array) {
            StringBuilder stringBuilder  = new StringBuilder(s);
            String reversed = stringBuilder.reverse().toString();
            list.add(reversed);
        }

        return list;
    }

}
