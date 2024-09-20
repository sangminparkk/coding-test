package basic._02_Array;

import java.util.Scanner;

public class PrizeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int[] grades = new int[counter];
        for (int i = 0; i < counter; i++) {
            grades[i] = scanner.nextInt();
        }

        PrizeFilter prizeFilter = new PrizeFilter();

        for (int prize : prizeFilter.solution2(counter, grades)) {
            System.out.print(prize + " ");
        }
    }

    private int[] solution2(int counter, int[] grades) {
        int[] answer = new int[counter];

        for (int i = 0; i < counter; i++) {
            int prize = 1;
            for (int j = 0; j < counter; j++) {
                if (grades[j] > grades[i]) {
                    prize++;
                }
            }
            answer[i] = prize;
        }
        return answer;
    }

    private int[] solution(int counter, int[] grades) {
        int[] answer = new int[counter];
//        5
//        87 89 92 100 76
        // 예외처리 : 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
        // answer index = grades index

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < counter; i++) {
            if (grades[i] > max) {
                max = grades[i];
                answer[i] = 1;
            }
        }

        return answer;
    }

}
