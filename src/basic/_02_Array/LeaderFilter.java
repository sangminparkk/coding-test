package basic._02_Array;

import java.util.Scanner;

public class LeaderFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] grid = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        LeaderFilter leaderFilter = new LeaderFilter();
        System.out.println(leaderFilter.solution(n, grid));
    }

    private int solution(int n, int[][] grid) {
        int answer = 0; // 몇번 학생
        int[] students = {1,2,3,4,5};
        int count = 0;

        // 0번 학생
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][students[i]] == grid[j][i]
            }
        }

        return answer+1;
    }

}
