package ch1.P9;

import java.util.Scanner;

public class Main {

    public int solution(String s) {
        String answer = "";

        // 내가 직접 풀었다 ㅎㅎ

        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(arr[i])) answer += arr[i];
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
