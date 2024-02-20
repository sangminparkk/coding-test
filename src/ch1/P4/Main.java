package ch1.P4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
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
