package basic._02_Array;

import java.util.Scanner;

public class MaxGridSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int[][] grid = new int[counter][counter];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        MaxGridSum maxGridSum = new MaxGridSum();
        int max = maxGridSum.solution2(counter, grid);
        System.out.println(max);
    }

    private int solution2(int counter, int[][] grid) {
        int answer = Integer.MIN_VALUE; // max
        int sum1, sum2;

        // row vs column
        for (int i = 0; i < counter; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < counter; j++) {
                sum1 += grid[i][j];
                sum2 += grid[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // diagonals
        sum1 = sum2 = 0;
        for (int i = 0; i < counter; i++) {
            sum1 += grid[i][i];
            sum2 += grid[i][counter-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    private int solution(int counter, int[][] grid) {
        int max = 0, sumOfMainDia = 0, sumOfSecondDia = 0;

        for (int i = 0; i < counter; i++) {
            int sumOfRows = 0, sumOfColumns = 0;

            for (int j = 0; j < counter; j++) {
                sumOfRows += grid[i][j];
                sumOfColumns += grid[j][i];

                if (i == j) {
                    sumOfMainDia += grid[i][j];
                }

                if (i + j == 4) {
                    sumOfSecondDia += grid[i][j];
                }

                int maxFilter = Math.max(sumOfRows, sumOfColumns);
                if (maxFilter > max) {
                    max = maxFilter;
                }
            }
        }

        int maxDiagonal = Math.max(sumOfMainDia, sumOfSecondDia);
        return Math.max(max, maxDiagonal);
    }
}
