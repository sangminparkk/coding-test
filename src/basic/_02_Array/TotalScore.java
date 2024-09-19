package basic._02_Array;

import java.util.*;

public class TotalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int[] test = new int[counter];
        for (int i = 0; i < counter; i++) {
            test[i] = scanner.nextInt();
        }

        TotalScore totalScore = new TotalScore();
        System.out.println(totalScore.solution2(counter, test));
    }

    private int solution2(int counter, int[] test) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < counter; i++) {
            if (test[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    private int solution(int counter, int[] test) {
        int[] grades = new int[counter];

        // 초기값설정
        if (test[0] == 0) {
            grades[0] = 0;
        } else {
            grades[0] = 1;
        }

        for (int i = 1; i < counter; i++) {
            // 틀린경우
            if (test[i-1] > test[i]) {
                grades[i] = 0;
            } else if (test[i-1] < test[i]) {
                grades[i] = 1;
            } else if (test[i - 1] == test[i] && test[i] == 0) {
                grades[i] = 0;
            } else {
                grades[i] = grades[i - 1] + 1;
            }
        }

        return Arrays.stream(grades).sum();
    }
}
