package ch1.P5;

import java.util.Scanner;

public class Main_ref {
    public static String solution(String str) {
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(c[left])) { // Character 메소드... >> 자바를 잘 알아야하는 이유
                left++;
            } else if (!Character.isAlphabetic(c[right])) {
                right--;
            } else { // 해결하려는 "사고과정"이 유연하지 못함. > 노트에 적어가면서 해야하나
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}

