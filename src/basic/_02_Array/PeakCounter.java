package basic._02_Array;

import java.util.Scanner;

public class PeakCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] grid = new int[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        PeakCounter peakCounter = new PeakCounter();
        System.out.println(peakCounter.solution2(n, grid));

    }

    private int solution2(int n, int[][] grid) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {

                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] >= grid[i][j]) {
                        flag = false;
                        break; // 찾는순간 바로 break
                    }
                }
                if (flag) count++;
            }
        }

        return count;
    }

    private int solution(int n, int[][] grid) {
        int count = 0;
        int max;
        int left, right, top, bottom, base;

        // inner grid
        for (int i = 1; i <= n; i++) {
            left = right = top = bottom = max = 0;
            for (int j = 1; j <= n; j++) {
                base = grid[i][j];

                left = grid[i][j - 1];
                right = grid[i][j + 1];
                top = grid[i - 1][j];
                bottom = grid[i + 1][j];

                max = Math.max(Math.max(left, right), Math.max(top, bottom));
                if (base > max) {
                    count++;
                }
            }
        }
        return count;
    }
}
