package ch1.P7;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        str = str.toUpperCase();

        String front = "";
        String back = "";

        // 비교
        for (int i = 0; i < str.length(); i++) {
            front += str.charAt(i);
        }

        for (int i = str.length()-1; i >= 0; i--) {
            back += str.charAt(i);
        }

        if (front.equals(back)) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(T.solution(string));
    }

}
