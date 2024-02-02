package ch1.P1;
import java.util.*;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;

        // 2. 구현
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /**
         * 1. for - if
         * 2. 향상된 for문 적용
         */
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }

        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        // 1. 입력 받기
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
