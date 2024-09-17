package basic._02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int[] toReverse = new int[counter];
        for (int i = 0; i < counter; i++) {
            toReverse[i] = scanner.nextInt();
        }

        ReversePrimeNumberCounter primeNumberCounter = new ReversePrimeNumberCounter();

        for (int prime : primeNumberCounter.solution(counter, toReverse)) {
            System.out.print(prime + " ");
        }
    }

    private List<Integer> solution(int counter, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        //9
        //32 55 62 20 250 370 200 30 100

        // 321
        for (int i = 0; i < counter; i++) {

            int tmp = arr[i];
            int rev = 0;
            while (tmp != 0) {
                int t = tmp % 10;
                rev = rev * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(rev)) {
                answer.add(rev);
            }
        }
        return answer;
    }

    private boolean isPrime(int rev) {
        if (rev == 1) {
            return false;
        }

        for (int i = 2; i < rev; i++) {
            if (rev % i == 0) {
                return false;
            }
        }

        return true;
    }
}
