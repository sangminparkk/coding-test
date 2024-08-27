package basic._01_string;

import java.util.Scanner;

public class FindLongestWord {

    public static void main(String[] args) {

        FindLongestWord findLongestWord = new FindLongestWord();

        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine().trim();

        System.out.println(findLongestWord.solution(content));
    }

    private String solution(String content) {
        String[] split = content.split(" ");
        int max = split[0].length();
        int index = 0;

        for (int i = 1; i < split.length; i++) {
            if (split[i].length() > max) {
                max = split[i].length();
                index = i;
            }
        }

        return split[index];
    }
}
