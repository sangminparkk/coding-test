package ch1.P3;

import java.util.Scanner;

public class Main {
    private String solution(String str) {
        String answer = "";

        //1. 절대 기준
        int m = Integer.MIN_VALUE; // -2147483648

        //2. 탐색
        String[] strings = str.split(" ");
        for (String x : strings) {

            int len = x.length(); // 상대기준
            if (len > m) {
                m = len; // 최대값 구하는 알고리즘
                answer = x; // 발견될때마다 계속해서 갱신
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }

}
