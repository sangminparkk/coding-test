package ch1.P4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        /**
         *  특정 조건의 문자열만 뒤집는 경우
         */
        for (String x : str) {
            char[] s = x.toCharArray();
            /**
             * 이게 핵심 >> 손코딩하라고하면 이정돈 해야합니다.
             */
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // 클래스.valueOf > valueOf 는 static 이다!! >> 와 기본개념
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n]; // 동적 배열

        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

}
