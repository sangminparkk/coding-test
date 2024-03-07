package ch1.P7;

import java.util.Scanner;

public class Main_ref2 {

    public String solution(String str) {
        String answer = "NO"; // 먼저 flag를 설정한다.
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main_ref2 T = new Main_ref2();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(T.solution(string));
    }

}
