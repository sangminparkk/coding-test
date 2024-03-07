package ch1.P4.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_ref {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // StringBuilder 사용시
//        for (String x : str) {
//            String temp = new StringBuilder(x).reverse().toString();
//            answer.add(temp);
//        }

        // 직접 관계 설정 : 자리수마다 바꿈처리    // 1 <-> 4, 2 <-> 3

        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0;

            // while 로직 구현이 핵심
            int rt = x.length() - 1;
            while (lt < rt) { // ★★★★★★
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_ref T = new Main_ref();
        Scanner in = new Scanner(System.in);
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
