package basic._02_Array;

import java.util.Scanner;

public class LeaderFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] grid = new int[n+1][6]; // grade fix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        LeaderFilter leaderFilter = new LeaderFilter();
        System.out.println(leaderFilter.solution(n, grid));
    }

    private int solution(int n, int[][] grid) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (grid[i][k] == grid[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }

}
