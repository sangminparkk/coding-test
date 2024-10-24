package basic._03_TwoPoints;

import java.util.Scanner;

public class FindCaseSumOfConsecutive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        FindCaseSumOfConsecutive findCaseSumOfConsecutive = new FindCaseSumOfConsecutive();
        System.out.println(findCaseSumOfConsecutive.solution(n));
    }

    private int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1; // m = max
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }

        }
        return answer;
    }
}
