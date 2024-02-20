package ch1.P3;

import java.util.Scanner;

public class Main2 {
    private String solution(String str) {
        String answer = "";

        //1. 절대 기준
        int m = Integer.MIN_VALUE, pos;

        //2. 탐색
        while ((pos = str.indexOf(" ")) != -1) { // 해당 인덱스가 없으면 -1, 있으면 해당 인덱스를 반환
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(main.solution(str));
    }

}
