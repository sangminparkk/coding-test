package ch1.P7;

import java.util.Scanner;

public class Main_ref {

    public String solution(String str) {
        String answer = "YES"; // 먼저 flag를 설정한다.
        int len = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < len/2; i++) { // 탐색은 절반으로
            if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_ref T = new Main_ref();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(T.solution(string));
    }

}
