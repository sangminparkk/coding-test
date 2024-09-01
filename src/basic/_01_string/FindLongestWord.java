package basic._01_string;

import java.util.Scanner;

public class FindLongestWord {

    public static void main(String[] args) {

        FindLongestWord findLongestWord = new FindLongestWord();

        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine().trim();

        System.out.println(findLongestWord.solution(content));
        System.out.println(findLongestWord.solution2(content));
        System.out.println("=== indexOf ===");
        System.out.println(findLongestWord.solution3(content));
    }

    private String solution3(String content) {
        int max = Integer.MIN_VALUE, pos;
        String answer = "";

        while ( (pos=content.indexOf(" ")) != -1) {
            String tmp = content.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            content = content.substring(pos+1); // start position initialize
        }

        if (content.length() > max) { // 마지막 단어 포함
            answer = content;

        }
        return answer;
    }

    private String solution2(String content) {
        String[] split = content.split(" ");
        int max = Integer.MIN_VALUE;
        String answer = "";

        for (String s : split) {
            int len = s.length();
            if (len > max) {
                max = len;
                answer = s;
            }
        }

        return answer;
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
