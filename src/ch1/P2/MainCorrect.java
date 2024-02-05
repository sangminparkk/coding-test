package ch1.P2;
import java.util.Scanner;

public class MainCorrect {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (97 <= x && x <= 122) answer += (char) (x-32) ;
            else answer += (char) (x+32);
        }
        return answer;
}

    public static void main(String[] args) {
        MainCorrect T = new MainCorrect();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}



