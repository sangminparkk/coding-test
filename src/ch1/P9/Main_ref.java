package ch1.P9;

import java.util.Scanner;

public class Main_ref {
    public int solution(String s) {
        int answer = 0;

        // 강사님은 ASCII CODE 로도 쉽게 구현
        for (char c : s.toCharArray()) {
            if (48 <= c && c <= 57) {
                answer = answer * 10 + ((int) c - 48); // character를 정수로 연산하게 되면, 자동으로 ASCII CODE 로 연산수행함
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
