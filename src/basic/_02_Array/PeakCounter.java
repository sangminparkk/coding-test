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
        System.out.println(peakCounter.solution(n, grid));

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
