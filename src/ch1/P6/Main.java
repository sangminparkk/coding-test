package ch1.P6;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // 힌트 : indexOf
//            System.out.println(str.charAt(i)+ " " + i + " "+ str.indexOf(str.charAt(i))); //  와... 이거 뭐냐ㅋㅋㅋㅋ

            if (i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(T.solution(string));

    }

}
