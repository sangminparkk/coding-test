package ch1.P10;

import java.util.Scanner;

public class Main {
    public int solution(String s, char c) {
        String answer = "";

        // teachermode e
        // 10121012210
        // 각 문자가 떨어진 최소 거리
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " " + i + " " + s.indexOf(s.charAt(i)));

        }

        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0); // 여기서부터 틀림 >> 문자를 읽어야함. next().charAt(0); 이 되어야함
        System.out.println(T.solution(str, c));
    }
}
