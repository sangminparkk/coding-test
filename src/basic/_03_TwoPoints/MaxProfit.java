package basic._03_TwoPoints;

import java.util.Scanner;

public class MaxProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.solution(arr, k));

    }

    private int solution(int[] arr, int k) {
        int max;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += (arr[i] - arr[i - k]);
            max = Math.max(max, sum);
        }

        return max;
    }
}