package ch1.P5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // if 조건절을 통해서 알파벳만 고르기 . (int) char -> ascii code 65~90, 97~122 >> 여기서 문제1.
            if (65 <= (int) c[left] && (int) c[left] <= 90 || 97 <= (int) c[left] && (int) c[left] <= 122) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;

            } else { // 이 조건도 있어야 하는구나.. >> 문제2. 효율적인 로직 구성 실패
                left++;
                right--;
            }

            //문제3. 답도 안나옴

        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}
