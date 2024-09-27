package basic._02_Array;

import java.util.Scanner;

public class MentoringCaseCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        MentoringCaseCounter mentoringCaseCounter = new MentoringCaseCounter();
        int result = mentoringCaseCounter.solution(n, m, arr);
        System.out.println(result);

    }

    private int solution(int n, int m, int[][] arr) {


        return 0;
    }


}
