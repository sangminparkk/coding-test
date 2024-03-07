package ch1.P4.ex;

import ch1.P4.Main2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // 글자를 거꾸로 출력

        for (int i = 0; i < str.length; i++) {
            String temp = "";
            char[] charArray = str[i].toCharArray();
            for (int j = charArray.length-1; j >= 0; j--) {
                temp += charArray[j];
            }
            answer.add(temp);
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
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
