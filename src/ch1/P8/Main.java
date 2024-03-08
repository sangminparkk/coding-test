package ch1.P8;

import java.util.Scanner;

public class Main {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 정규식 (부정 : ^) >> A-Z까지 아니면
//        System.out.println("s = " + s);

        String tmp = new StringBuilder(s).reverse().toString();
//        System.out.println("tmp = " + tmp);

        if (s.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
